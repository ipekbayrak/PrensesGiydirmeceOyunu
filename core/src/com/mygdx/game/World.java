package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by dell on 07.08.2015.
 */
public class World {

    private static final float CAMERA_WIDTH = 800f;
    private static final float CAMERA_HEIGHT = 1280f;

    //resmi çizdirilecekler tanımlanır
    private Texture backgroundTexture;
    private Texture model;
    private Texture model2;
    private Texture peruk;
    private Texture peruk2;
    private Texture up1;
    private Texture up2;
    private Texture up3;
    private Texture but1;
    private Texture but2;
    private Texture hair2;
    private Texture hair3;
    private Texture hair4;


    private Texture necklace1;
    private Texture glasses1;
    private Texture shoes1;
    private Texture socks1;
    private Texture earrings1;
    private Texture hat1;

    private Music menuMusic;
    private boolean isMusic;
    long musicId;

    private int modelId = 0;
    private int hairId = 0;
    private int upId = 0;
    private int butId = 0;
    private int hatId = 0;
    private int earringslId = 0;
    private int necklacelId = 0;
    private int glasseslId = 0;
    private int brackletlId = 0;
    private int makeupId = 0;
    private int socksId = 0;
    private int shoeslId = 0;

    float pputX;
    float pputY;

    private float posX = 0f;
    private float posY = 0f;
    private float stretchX = 1f;
    private float stretchY = 1f;


    World() {
        pputX = (float) Gdx.graphics.getWidth() / CAMERA_WIDTH;
        pputY = (float) Gdx.graphics.getHeight() / CAMERA_HEIGHT;

        loadTextures();
        loadMusic();
    }

    private void loadMusic() {
        menuMusic = Assets.manager.get("sound/music.wav", Music.class);


        menuMusic.setLooping(true);
        menuMusic.play();
        isMusic = true;



    }


    public void drawWorld(SpriteBatch spriteBatch) {
        drawBackground(spriteBatch);
        drawModel(modelId,spriteBatch);
        drawHair(hairId,spriteBatch);
        drawSocks(socksId,spriteBatch);
        drawBut(butId,spriteBatch);
        drawUp(upId,spriteBatch);
        drawHat(hatId,spriteBatch);
        drawBracklet(brackletlId,spriteBatch);
        drawNecklace(necklacelId,spriteBatch);
        drawGlasses(glasseslId,spriteBatch);
        drawMakeup(makeupId,spriteBatch);
        drawShoes(shoeslId,spriteBatch);
        drawEarrings(earringslId,spriteBatch);
    }

    private void loadTextures() {
        backgroundTexture = Assets.manager.get("items/background.png", Texture.class);
        model = Assets.manager.get("items/model.png", Texture.class);
        model2 = Assets.manager.get("items/model2.png", Texture.class);
        peruk = Assets.manager.get("items/peruk.png", Texture.class);
        but1 = Assets.manager.get("items/but1.png", Texture.class);
        but2 = Assets.manager.get("items/but2.png", Texture.class);
        up2 = Assets.manager.get("items/up2.png", Texture.class);
        up1 = Assets.manager.get("items/up1.png", Texture.class);
        hair2 = Assets.manager.get("items/hair2.png", Texture.class);
        hair3 = Assets.manager.get("items/hair3.png", Texture.class);
        hair4 = Assets.manager.get("items/hair4.png", Texture.class);

        necklace1 = Assets.manager.get("items/necklace1.png", Texture.class);
        glasses1 = Assets.manager.get("items/glasses1.png", Texture.class);
        shoes1 = Assets.manager.get("items/shoes1.png", Texture.class);
        socks1 = Assets.manager.get("items/socks1.png", Texture.class);
        earrings1 = Assets.manager.get("items/earrings1.png", Texture.class);
        hat1 = Assets.manager.get("items/hat1.png", Texture.class);
        up3 = Assets.manager.get("items/up3.png", Texture.class);


    }

    private void drawBackground(SpriteBatch spriteBatch) {
        spriteBatch.draw(
                backgroundTexture,
                posX,
                posY,
                CAMERA_WIDTH*pputX*stretchX,
                CAMERA_HEIGHT*pputY*stretchY

        );
    }
    private void drawModel(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {

        }
        else if (id==1)
        {
            spriteBatch.draw(
                    model,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else if (id==2)
        {
            spriteBatch.draw(
                    model2,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else
        {

        }


    }
    private void drawHair(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {

        }
        else if (id==1)
        {
            spriteBatch.draw(
                    peruk,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else if (id==2)
        {
            spriteBatch.draw(
                    hair2,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else if (id==3)
        {
            spriteBatch.draw(
                    hair3,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else if (id==4)
        {
            spriteBatch.draw(
                    hair4,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else
        {

        }


    }
    private void drawBut(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {

        }
        else if (id==1)
        {
            spriteBatch.draw(
                    but1,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else if (id==2)
        {
            spriteBatch.draw(
                    but2,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else
        {

        }


    }
    private void drawHat(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
        else if (id==1)
        {
            spriteBatch.draw(
                    hat1,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else
        {
        }
    }
    private void drawEarrings(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
        else if (id==1)
        {
            spriteBatch.draw(
                    earrings1,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        /*else if (id==2)
        {
            spriteBatch.draw(
                    up2,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
        else
        {
        }
    }
    private void drawNecklace(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
        else if (id==1)
        {
            spriteBatch.draw(
                    necklace1,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
              /*else if (id==2)
        {
            spriteBatch.draw(
                    up2,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
        else
        {
        }
    }
    private void drawGlasses(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
        else if (id==1)
        {
            spriteBatch.draw(
                    glasses1,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
            /*else if (id==2)
        {
            spriteBatch.draw(
                    up2,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
        else
        {
        }
    }
    private void drawBracklet(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
        /*else if (id==1)
        {
            spriteBatch.draw(
                    bracklet1,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
             /*else if (id==2)
        {
            spriteBatch.draw(
                    up2,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
        else
        {
        }
    }
    private void drawMakeup(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
       /* else if (id==1)
        {
            spriteBatch.draw(
                    makeup1,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
            /*else if (id==2)
        {
            spriteBatch.draw(
                    up2,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
        else
        {
        }
    }
    private void drawSocks(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
        else if (id==1)
        {
            spriteBatch.draw(
                    socks1,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
             /*else if (id==2)
        {
            spriteBatch.draw(
                    up2,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
        else
        {
        }
    }
    private void drawShoes(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
        else if (id==1)
        {
            spriteBatch.draw(
                    shoes1,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
              /*else if (id==2)
        {
            spriteBatch.draw(
                    up2,
                    0.0f,
                    0.0f,
                    CAMERA_WIDTH*pputX,
                    CAMERA_HEIGHT*pputY

            );
        }*/
        else
        {
        }
    }
    private void drawUp(int id, SpriteBatch spriteBatch) {
        if (id==0)
        {
        }
        else if (id==1)
        {
            spriteBatch.draw(
                    up1,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
             else if (id==2)
        {
            spriteBatch.draw(
                    up2,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else if (id==3)
        {
            spriteBatch.draw(
                    up3,
                    posX,
                    posY,
                    CAMERA_WIDTH*pputX*stretchX,
                    CAMERA_HEIGHT*pputY*stretchY

            );
        }
        else
        {
        }
    }

    public void setModelId(int id)
    {
        this.modelId = id;
    }
    public void setHairId(int hairId) {
        this.hairId = hairId;
    }
    public void setUpId(int upId) {
        this.upId = upId;
    }
    public void setButId(int butId) {
        this.butId = butId;
    }
    public void setHatId(int hatId) {
        this.hatId = hatId;
    }
    public int getHatId() {
        return hatId;
    }
    public void setEarringslId(int earringslId) {
        this.earringslId = earringslId;
    }
    public int getEarringslId() {
        return earringslId;
    }
    public void setNecklacelId(int necklacelId) {
        this.necklacelId = necklacelId;
    }
    public int getNecklacelId() {
        return necklacelId;
    }
    public void setGlasseslId(int glasseslId) {
        this.glasseslId = glasseslId;
    }
    public int getGlasseslId() {
        return glasseslId;
    }
    public void setBrackletlId(int brackletlId) {
        this.brackletlId = brackletlId;
    }
    public int getBrackletlId() {
        return brackletlId;
    }
    public void setMakeupId(int makeupId) {
        this.makeupId = makeupId;
    }
    public int getMakeupId() {
        return makeupId;
    }
    public void setSocksId(int socksId) {
        this.socksId = socksId;
    }
    public int getSocksId() {
        return socksId;
    }
    public void setShoeslId(int shoeslId) {
        this.shoeslId = shoeslId;
    }
    public int getShoeslId() {
        return shoeslId;
    }

    public void stopMusic() {
        menuMusic.pause();
        isMusic = false;
    }
    public void startMusic() {
        //sound.play();
        menuMusic.play();
        isMusic = true;
    }
    public boolean isMusic(){
        return this.isMusic;
    }

    public int getModelId(){ return this. modelId;}


    public void zoomCam(){
        stretchX = 2f;
        stretchY = 2f;

        posX = -510;
        posY = -1900;

    }

    public void zoomNormal(){
        stretchX = 1f;
        stretchY = 1f;

        posX = 0f;
        posY = 0f;
    }
}
