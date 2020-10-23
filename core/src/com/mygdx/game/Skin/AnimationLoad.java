package com.mygdx.game.Skin;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by dell on 08.09.2015.
 */
public class AnimationLoad {

    private static final float RUNNING_FRAME_DURATION = 0.06f;
    private Animation walkRightAnimation;
    private TextureAtlas atlas;
    //private String filepath; //"textures/texturePack.atlas"
    //private int frameNumber;
    //private String regionName; //adam

    public AnimationLoad(String filepath, String regionName,int frameNumber)
    {

        this.atlas = new TextureAtlas(Gdx.files.internal(filepath));

        TextureRegion[] animationFrames = new TextureRegion[frameNumber];
        for (int i = 0; i < frameNumber; i++) {
            animationFrames[i] = atlas.findRegion(regionName, i+1);
        }
        this.walkRightAnimation = new Animation(RUNNING_FRAME_DURATION, animationFrames);
    }


    public Animation getAnimation()
    {
        return this.walkRightAnimation;
    }

}
