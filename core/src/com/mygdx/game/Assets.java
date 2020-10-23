package com.mygdx.game; /**
 * Created by dell on 07.08.2015.
 */
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public class Assets {
    public static AssetManager manager = new AssetManager();

    public static void queueLoading() {
        manager.load("sound/music.wav", Music.class);
        manager.load("sound/buble.ogg", Sound.class);

        manager.load("black.png", Texture.class);
        manager.load("items/background.png", Texture.class);
        manager.load("button.png", Texture.class);
        manager.load("items/fade.png", Texture.class);

        manager.load("buttons/anna.png", Texture.class);
        manager.load("buttons/ileri.png", Texture.class);
        manager.load("items/layout.png", Texture.class);
        manager.load("items/model.png", Texture.class);
        manager.load("buttons/delete.png", Texture.class);
        manager.load("items/peruk.png", Texture.class);
        manager.load("buttons/back.png", Texture.class);
        manager.load("buttons/peruk_btn.png", Texture.class);
        manager.load("buttons/music_yes.png", Texture.class);
        manager.load("buttons/music_no.png", Texture.class);
        manager.load("buttons/up1_btn.png", Texture.class);
        manager.load("items/up1.png", Texture.class);

        manager.load("items/but1.png", Texture.class);
        manager.load("buttons/but1_btn.png", Texture.class);
        manager.load("items/but2.png", Texture.class);
        manager.load("buttons/but2_btn.png", Texture.class);
        manager.load("items/up2.png", Texture.class);
        manager.load("buttons/up2_btn.png", Texture.class);
        manager.load("buttons/hair3_btn.png", Texture.class);
        manager.load("items/hair3.png", Texture.class);
        manager.load("items/hair2.png", Texture.class);
        manager.load("buttons/hair2_btn.png", Texture.class);
        manager.load("items/model2.png", Texture.class);

        //

        manager.load("items/necklace1.png", Texture.class);
        manager.load("items/glasses1.png", Texture.class);
        manager.load("items/shoes1.png", Texture.class);
        manager.load("items/socks1.png", Texture.class);
        manager.load("items/earrings1.png", Texture.class);
        manager.load("items/hat1.png", Texture.class);
        manager.load("items/up3.png", Texture.class);
        manager.load("buttons/up3_btn.png", Texture.class);
        manager.load("items/hair4.png", Texture.class);
        manager.load("buttons/hair4_btn.png", Texture.class);
        //12 static button load

        manager.load("buttons/face_btn.png", Texture.class);
        manager.load("buttons/hair_btn.png", Texture.class);
        manager.load("buttons/up_btn.png", Texture.class);
        manager.load("buttons/trousers_btn.png", Texture.class);
        manager.load("buttons/socks_btn.png", Texture.class);
        manager.load("buttons/shoes_btn.png", Texture.class);
        manager.load("buttons/hat_btn.png", Texture.class);
        manager.load("buttons/earrings_btn.png", Texture.class);
        manager.load("buttons/necklace_btn.png", Texture.class);
        manager.load("buttons/bracklet_btn.png", Texture.class);
        manager.load("buttons/makeup_btn.png", Texture.class);
        manager.load("buttons/glasses_btn.png", Texture.class);
        manager.load("buttons/lenses_btn.png", Texture.class);
        manager.load("buttons/eyeliner_btn.png", Texture.class);
        manager.load("buttons/dress_btn.png", Texture.class);
        manager.load("buttons/dress1_btn.png", Texture.class);
        manager.load("buttons/hairbuckle_btn.png", Texture.class);
        manager.load("buttons/bag_btn.png", Texture.class);
        manager.load("buttons/bag1_btn.png", Texture.class);

        manager.load("buttons/color_cartela_btn.png", Texture.class);
        manager.load("buttons/accessories_btn.png", Texture.class);
        manager.load("buttons/jewelery_btn.png", Texture.class);

        manager.load("buttons/jacket_btn.png", Texture.class);
        manager.load("buttons/jacket1_btn.png", Texture.class);

        manager.load("buttons/blush_btn.png", Texture.class);
        manager.load("buttons/blush1_btn.png", Texture.class);

        manager.load("buttons/eyehair_btn.png", Texture.class);
        manager.load("buttons/eyehair1_btn.png", Texture.class);

        manager.load("buttons/eyeliner_btn.png", Texture.class);
        manager.load("buttons/eyeliner1_btn.png", Texture.class);

        manager.load("buttons/hairband_btn.png", Texture.class);
        manager.load("buttons/hairband1_btn.png", Texture.class);

        manager.load("buttons/lipstick_btn.png", Texture.class);
        manager.load("buttons/lipstick1_btn.png", Texture.class);

        manager.load("buttons/scarf_btn.png", Texture.class);
        manager.load("buttons/scarf1_btn.png", Texture.class);


        manager.load("buttons/back2.png", Texture.class);
        manager.load("buttons/save.png", Texture.class);
        manager.load("buttons/settings.png", Texture.class);

        //selections
        manager.load("buttons/selected.png", Texture.class);
        manager.load("buttons/selected_btn.png", Texture.class);

    }

    public static boolean update() {
        return manager.update();
    }
}
