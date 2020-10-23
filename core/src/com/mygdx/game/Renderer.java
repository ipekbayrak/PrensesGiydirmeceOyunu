package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Timer;
import com.mygdx.game.UI.Layout;
import com.mygdx.game.UI.PopupMenu;

/**
 * Created by dell on 07.08.2015.
 */

public class Renderer {
Texture black;

    //sabitler
    private static final float CAMERA_WIDTH = 800f;
    private static final float CAMERA_HEIGHT = 1280f;

    private float calculatedWidth = CAMERA_WIDTH;
    private float calculatedHeight = CAMERA_HEIGHT;

    private World world;
    private Layout layout;
    private PopupMenu popupmenu;

    private OrthographicCamera cam;
    private SpriteBatch spriteBatch;

    private ShapeRenderer shapeRenderer;

    private boolean screenshot = false;

    private boolean debug = false;

    //ilerde... size ayarı için
    private int width;
    private int height;
    private float pputX;  // x ekseninde her birimdeki pixel
    private float pputY;

    float ratioX;
    float ratioY;

    public Renderer(World world, Layout layout, PopupMenu popupmenu, boolean debug){



         ratioX = CAMERA_WIDTH/Gdx.graphics.getWidth();
         ratioY = CAMERA_HEIGHT/Gdx.graphics.getHeight();

        if (ratioX >= ratioY)
        {
            calculatedWidth = CAMERA_WIDTH/ratioX;
            calculatedWidth = Gdx.graphics.getWidth() * (Gdx.graphics.getWidth()/calculatedWidth);
            calculatedHeight = CAMERA_HEIGHT/ratioX;
            calculatedHeight = Gdx.graphics.getHeight() * (Gdx.graphics.getHeight()/calculatedHeight);

        }
        else
        {
            calculatedWidth = CAMERA_WIDTH/ratioY;
            calculatedWidth = Gdx.graphics.getWidth() * (Gdx.graphics.getWidth()/calculatedWidth);
            calculatedHeight = CAMERA_HEIGHT/ratioY;
            calculatedHeight = Gdx.graphics.getHeight() * (Gdx.graphics.getHeight()/calculatedHeight);
        }

        this.cam = new OrthographicCamera(calculatedWidth,calculatedHeight);
        this.cam.setToOrtho(false,calculatedWidth,calculatedHeight);
        this.cam.position.set(Gdx.graphics.getWidth()/2f,Gdx.graphics.getHeight()/2f,0);
        this.cam.update();

        this.debug = debug;
        this.world = world;
        this.layout = layout;
        this.popupmenu = popupmenu;

        //setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        spriteBatch = new SpriteBatch();
        shapeRenderer = new ShapeRenderer();

        black = Assets.manager.get("black.png", Texture.class);

    }

    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        Gdx.gl.glEnable(GL20.GL_BLEND);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glDisable(GL20.GL_BLEND);

        cam.update();

        spriteBatch.setProjectionMatrix(cam.combined);
        spriteBatch.begin();

        //cam.unproject();

        world.drawWorld(spriteBatch);

        if (!screenshot) {
            layout.drawLayout(spriteBatch);
            popupmenu.drawMenu(spriteBatch);
        }

        //BOŞLUKLARI DOLDURMA
        if (ratioX>=ratioY)
        {
            spriteBatch.draw(
                    black,
                    0.0f,
                    +(Gdx.graphics.getHeight()-calculatedHeight)/2,
                    calculatedWidth,
                    -(Gdx.graphics.getHeight()-calculatedHeight)/2
                    );

            spriteBatch.draw(
                    black,
                    0.0f,
                    Gdx.graphics.getHeight(),
                    calculatedWidth,
                    -(Gdx.graphics.getHeight()-calculatedHeight)/2
            );
        }
        else
        {
            spriteBatch.draw(
                    black,
                    (-(Gdx.graphics.getWidth()-calculatedWidth)/2)+(Gdx.graphics.getWidth()-calculatedWidth)/2,
                    0f,
                    (Gdx.graphics.getWidth()-calculatedWidth)/2,
                    calculatedHeight
            );

            spriteBatch.draw(
                    black,
                    Gdx.graphics.getWidth()-(Gdx.graphics.getWidth()-calculatedWidth)/2,
                    0f,
                    (Gdx.graphics.getWidth()-calculatedWidth)/2,
                    calculatedHeight
            );
        }


        spriteBatch.end();

       // drawShape(0f,0f,800f,1000f);



        if(screenshot)
        {
            boolean result = ScreenshotFactory.saveScreenshot();
            screenshot = false;

        }


    }


    public void setSize (float w, float h) {

        float ratioX = CAMERA_WIDTH/Gdx.graphics.getWidth();
        float ratioY = CAMERA_HEIGHT/Gdx.graphics.getHeight();

        if (ratioX >= ratioY)
        {
            calculatedWidth = CAMERA_WIDTH/ratioX;
            calculatedHeight = CAMERA_HEIGHT/ratioX;
        }
        else
        {
            calculatedWidth = CAMERA_WIDTH/ratioY;
            calculatedHeight = CAMERA_HEIGHT/ratioY;
        }


        this.width = (int)calculatedWidth;
        this.height = (int)calculatedHeight;
        pputX = (float) w / CAMERA_WIDTH;
        pputY = (float) h / CAMERA_HEIGHT;
    }

    private void smoothTrack(){
        //float lerp = 0.1f;
        //Vector3 position = cam.position;
        //position.x += (world.getMustafa().getPosition().x - position.x) * lerp;
    }

    public void screenshot()
    {
           screenshot = true;
    }

    private void drawShape(float x1,float y1, float width, float height){



        shapeRenderer.setProjectionMatrix(cam.combined);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);;
        shapeRenderer.setColor(new Color(Color.BLACK));

        shapeRenderer.rect(x1*pputX, y1*pputY, width*pputX, height*pputY);

        shapeRenderer.end();

    }
}


