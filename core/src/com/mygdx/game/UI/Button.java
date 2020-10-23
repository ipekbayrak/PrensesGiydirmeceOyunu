package com.mygdx.game.UI;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.awt.geom.Rectangle2D;

/**
 * Created by dell on 07.08.2015.
 */
public class Button {

    public  Vector2 position = new Vector2();
    public  Rectangle bounds = new Rectangle();
    public  Sound sound ;
    public  Texture texture;
    public  int id;


    Button(Vector2 pos,   Rectangle bounds, Sound sound, Texture texture, int id ){
        this.bounds.setX(bounds.getX());
        this.bounds.setY(bounds.getY());
        this.position = pos;
        this.sound = sound;
        this.texture=texture;
        this.id = id;

    }

    public int getId(){return this.id;}
}
