package com.mygdx.game.UI;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Assets;
import com.mygdx.game.Skin.FontLoad;

import java.util.ArrayList;

/**
 * Created by dell on 06.10.2015.
 */
public class PopupMenu {

    Texture fade;
    Texture button;

    float pputX  ;
    float pputY  ;

    Sound ses1;
    boolean isMusic;

    String title = "";
    Vector2 titlePosition;
    Rectangle titleType;
    int titleId;



    final float CAMERA_WIDTH = 800f;
    final float CAMERA_HEIGHT = 1280f;

    boolean popupmenu = false;

    ArrayList<Button> buttons = new ArrayList<Button>();
    ArrayList<String> texts = new ArrayList<String>();

    BitmapFont font;

    Rectangle boundType1 = new Rectangle(175.0f,175.0f,0f,0f);
    Rectangle boundType2 = new Rectangle(100.0f,100.0f,0f,0f);

    Vector2 btnPos1 = new Vector2(25    ,25.0f);
    Vector2 btnPos2=  new Vector2(225.0f,25.0f);
    Vector2 btnPos3=  new Vector2(425.0f,25.0f);
    Vector2 btnPos4=  new Vector2(625.0f,25.0f);
    Vector2 btnPos5 = new Vector2(825.0f,25.0f);
    Vector2 btnPos6=  new Vector2(1025.0f,25.0f);
    Vector2 btnPos7=  new Vector2(1225.0f,25.0f);
    Vector2 btnPos8=  new Vector2(1425.0f,25.0f);
    Vector2 btnPos9 = new Vector2(1625.0f,25.0f);
    Vector2 btnPos10=  new Vector2(1825.0f,25.0f);
    Vector2 btnPos11=  new Vector2(2025.0f,25.0f);
    Vector2 btnPos12=  new Vector2(2225.0f,25.0f);


    public ArrayList<Button> getButtons(){
        return buttons;
    }


    //layout + buttons
    public PopupMenu(){
        pputX = (float) Gdx.graphics.getWidth() / CAMERA_WIDTH;
        pputY = (float) Gdx.graphics.getHeight() / CAMERA_HEIGHT;


        fade = Assets.manager.get("items/fade.png", Texture.class);
        button = Assets.manager.get("button.png", Texture.class);

        ses1 = Assets.manager.get("sound/buble.ogg", Sound.class);

        font = new FontLoad().getFont();
    }

    public void buttonsAdd(Vector2 position,Rectangle type,int id, String text){ //model

        buttons.add(new Button(position,type,ses1,button,id));
        texts.add(new String(text));

    }

    public void titleAdd(Vector2 position,Rectangle type, String text){ //model

        title = text;
        titlePosition = position;
        titleType = type;

    }


    public void drawMenu(SpriteBatch spriteBatch) {

        if (popupmenu) {

            spriteBatch.draw(
                    fade,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH * pputX,
                    CAMERA_HEIGHT * pputY
            );

            font.draw(spriteBatch,title, (titlePosition.x*pputX), (titlePosition.y*pputY));

            drawButtons(buttons, spriteBatch);

        }

    }

    public void drawButtons(ArrayList<Button> buttons, SpriteBatch spriteBatch){

        int i = 0;
        for (Button button : this.getButtons()) {

            spriteBatch.draw(
                    button.texture,
                    button.position.x*pputX,
                    button.position.y*pputY ,
                    button.bounds.getX()*pputX,
                    button.bounds.getY()*pputY
            );

            font.draw(spriteBatch,texts.get(i), (button.position.x*pputX)+90f, (button.position.y*pputY)+100f);

        i++;
        }

    }

    public void setMenuStatus(boolean status){
        popupmenu = status;
    }


    public void close() {
        popupmenu = false;
        buttons.clear();
        texts.clear();
    }
}
