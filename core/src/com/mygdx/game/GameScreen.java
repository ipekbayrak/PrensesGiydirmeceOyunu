package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.UI.Layout;
import com.mygdx.game.UI.PopupMenu;
import com.sun.corba.se.impl.oa.poa.POAPolicyMediator;

import javax.swing.Popup;

/**
 * Created by dell on 07.08.2015.
 */

public class GameScreen  implements Screen {

    private World world;
    private Renderer renderer;
    private Controller controller;
    private Layout layout;
    private PopupMenu popupmenu;


    @Override
    public void show() {
        world = new World();
        layout = new Layout();
        popupmenu = new PopupMenu();
        renderer = new Renderer(world,layout, popupmenu, true);
        controller = new Controller(layout,world,popupmenu,renderer);


        Gdx.input.setInputProcessor(controller);
        Gdx.input.setCatchBackKey(true);
    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //render the game
        //control the game
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        //renderer.setSize(width,height);
        //this.width = width;
        //this.height = height;
    }

    @Override
    public void pause() {
        //when game paused
        //empty
    }

    @Override
    public void resume() {
        //when the game resumed
    }

    @Override
    public void hide() {

        //Gdx.input.setInputProcessor(null);
    }

    @Override
    public void dispose() {
        Gdx.input.setInputProcessor(null);
        Assets.manager.dispose();
    }
}
