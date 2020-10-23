package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Timer;
import com.mygdx.game.UI.Button;
import com.mygdx.game.UI.Layout;
import com.mygdx.game.UI.PopupMenu;

import java.util.ArrayList;

/**
 * Created by dell on 07.08.2015.
 */
public class Controller implements InputProcessor {
    Layout layout;
    World world;
    PopupMenu popupMenu;
    Renderer renderer;

    float pputX  ;
    float pputY  ;


    final float CAMERA_WIDTH = 800f;
    final float CAMERA_HEIGHT = 1280f;

    private float calculatedWidth = CAMERA_WIDTH;
    private float calculatedHeight = CAMERA_HEIGHT;

    float delay = 0.1f; // seconds
    boolean pressed = false;
    boolean dragged = false;
    int x;
    int y;

    private OrthographicCamera cam;

    private Button tmpButton;

    TapProcesser tapProcessor;

    ArrayList<Button> buttons = new ArrayList<Button>();
    ArrayList<Button> buttonsStatic = new ArrayList<Button>();

    Controller(Layout layout, World world, PopupMenu popupMenu, Renderer renderer){

        this.layout = layout;
        this.world = world;
        this.popupMenu = popupMenu;
        this.renderer = renderer;
        tapProcessor = new TapProcesser(layout,world,popupMenu, renderer);


        float ratioX = CAMERA_WIDTH/Gdx.graphics.getWidth();
        float ratioY = CAMERA_HEIGHT/Gdx.graphics.getHeight();

        if (ratioX >= ratioY)
        {
            calculatedWidth = CAMERA_WIDTH/ratioX;
            calculatedWidth = Gdx.graphics.getWidth() / (Gdx.graphics.getWidth()/calculatedWidth);
            calculatedHeight = CAMERA_HEIGHT/ratioX;
            calculatedHeight = Gdx.graphics.getHeight() / (Gdx.graphics.getHeight()/calculatedHeight);
        }
        else
        {
            calculatedWidth = CAMERA_WIDTH/ratioY;
            calculatedWidth = Gdx.graphics.getWidth() / (Gdx.graphics.getWidth()/calculatedWidth);
            calculatedHeight = CAMERA_HEIGHT/ratioY;
            calculatedHeight = Gdx.graphics.getHeight() / (Gdx.graphics.getHeight()/calculatedHeight);
        }

        this.cam = new OrthographicCamera(calculatedWidth,calculatedHeight);
        this.cam.setToOrtho(false,calculatedWidth,calculatedHeight);
        this.cam.position.set(Gdx.graphics.getWidth()/2f,Gdx.graphics.getHeight()/2f,0);
        this.cam.update();

        pputX = (float) Gdx.graphics.getWidth() / CAMERA_WIDTH;
        pputY = (float) Gdx.graphics.getHeight() / CAMERA_HEIGHT;

        buttons = layout.getButtons();
        buttonsStatic = layout.getButtonsStatic();
    }

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.BACK){

            System.exit(1);
            
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {return false;}

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        Vector3 v3 = new Vector3(screenX, screenY, 0);
        cam.project(v3);
        screenX = (int) (v3.x/pputX);
        screenY = (int) (v3.y/pputY);


        pressed = true;
        x=screenX;
        y=screenY;

        if(x <= screenX + 20 || x >= screenX +20)
            if(y<= screenY +20 || y>=screenY +20) {
                //tap catched
                //send tap info

                x = (int) (x);

                y = (int) (1280f - y);
            }

        dragged = false;
        pressed = true;

        Timer.schedule(new Timer.Task() {
            @Override
            public void run() {
                // Do your work
                pressed = false;
                dragged = true;
            }
        }, delay);

        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        Vector3 v3 = new Vector3(screenX, screenY, 0);
        cam.project(v3);
        screenX = (int) (v3.x/pputX);
        screenY = (int) (v3.y/pputY);

        layout.tmpDeltaX = layout.deltaSlideX;

        if(pressed)
        {

                    tapProcessor.tap(x,y);

                    System.out.println(x);
                    System.out.println(y);

        }

        if(dragged)
        {
            int i = 0;
            float ensol = 800f;
            float ensag = 0f;

            /*for (Button buttona : buttons) {
                i+=1;
                if (buttona.position.x+layout.deltaSlideX<ensol)
                {
                    ensol =buttona.position.x+layout.deltaSlideX;
                }
                if (buttona.position.x+buttona.bounds.getX()+layout.deltaSlideX>ensag)
                {
                    ensag =buttona.position.x+buttona.bounds.getX()+layout.deltaSlideX;
                }
            }

            if (i>4){
                if (ensol>600f)
                {
                layout.deltaSlideX = 0f;
                tmpDeltaX = 0f;
                }
                if (ensag<200f)
                {layout.deltaSlideX = 800f-ensag-layout.deltaSlideX;
                tmpDeltaX = 800f-ensag-layout.deltaSlideX;}
            }
            else
            {
                layout.deltaSlideX = 0f;
                tmpDeltaX = 0f;
            }
*/

        }

        dragged = false;
        pressed = false;

        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {

        if(!tapProcessor.settingsMenuOpen)
        if(dragged){
            Vector3 v3 = new Vector3(screenX, screenY, 0);
            cam.project(v3);
            screenX = (int) (v3.x/pputX);
            screenY = (int) (v3.y/pputY);


            layout.deltaSlideX = screenX - this.x +layout.tmpDeltaX ;
         }





        return true;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
