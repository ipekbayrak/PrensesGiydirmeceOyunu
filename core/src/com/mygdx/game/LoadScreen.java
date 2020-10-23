package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.mygdx.game.Skin.AnimatedImage;
import com.mygdx.game.Skin.AnimationLoad;

/**
 * Created by dell on 07.08.2015.
 */
public class LoadScreen implements Screen {

    private Animation loadAnimation ;
    private Image splashImage;
    private Texture background;
    private Stage stage;
    private Label label;

    Table buttonTable;

    public boolean animationDone = false;

    float width;
    float height;

    LoadScreen(){
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();

        loadAnimation = new AnimationLoad("loading/loadingPack.atlas", "loading", 12).getAnimation();

        background =  new Texture(Gdx.files.internal("background.png"));

        BitmapFont font = new BitmapFont(Gdx.files.internal("bitmapFonts/kaushan.fnt"),
                Gdx.files.internal("bitmapFonts/kaushan.png"), false);

        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.fontColor = Color.WHITE;
        labelStyle.font = font;
        //labelStyle.background =  new TextureRegionDrawable(new TextureRegion(new Texture("background.png")));

        label = new Label("Loading...",labelStyle);

        splashImage =  new AnimatedImage(loadAnimation);

        buttonTable = new Table();
        buttonTable.setBounds(width /3f, height / 3f, width/ 3f, height / 3f);

        stage = new Stage();
        buttonTable.add(splashImage).width(300f).height(300f);
        buttonTable.row();
        buttonTable.add(label).padBottom(70).row();
        stage.addActor(buttonTable);
    }



    @Override
    public void show() {
        //splashImage.setDrawable(new SpriteDrawable(new Sprite(texture)));


        splashImage.addAction(Actions.sequence(Actions.alpha(0)
                , Actions.fadeIn(0.75f), Actions.delay(1.5f), Actions.run(new Runnable() {
            @Override
            public void run() {
                animationDone = true;
            }
        })));

        Assets.queueLoading();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        splashImage.act(delta);

        stage.act();
        stage.draw();
        if(Assets.update()){ // check if all files are loaded

            if(animationDone){ // when the animation is finished, go to MainMenu()
                //Assets.setMenuSkin(); // uses files to create menuSkin
                ((Game)Gdx.app.getApplicationListener()).setScreen(new GameMenu());
            }
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        //splashImage.dispose();
        stage.dispose();
    }
}
