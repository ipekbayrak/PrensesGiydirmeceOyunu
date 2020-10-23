package com.mygdx.game.UI;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Assets;
import com.mygdx.game.ScreenshotFactory;

import java.util.ArrayList;

/**
 * Created by dell on 08.08.2015.
 */


public class Layout {
    Texture fade;

    Texture layout;
    Texture ileri;
    Texture anna;
    Texture delete;
    Texture peruk_btn;
    Texture back;
    Texture up;
    Texture music_yes;
    Texture music_no;

    Texture hair2_btn;
    Texture hair3_btn;
    Texture up1_btn;
    Texture up2_btn;
    Texture but1_btn ;
    Texture but2_btn ;

    Texture dress_btn;
    Texture dress1_btn;

    //defiene 12 static button
    Texture face_btn ;
    Texture hair_btn ;
    Texture up_btn;
    Texture trousers_btn;
    Texture socks_btn ;
    Texture shoes_btn ;
    Texture hat_btn  ;
    Texture earrings_btn;
    Texture necklace_btn;
    Texture bracklet_btn;
    Texture makeup_btn ;
    Texture glasses_btn;
    Texture up3_btn;
    Texture hair4_btn;

    Texture btn_settings;
    Texture btn_back2;
    Texture btn_save;

    Texture lenses_btn;
    Texture eyeliner_btn;

    Texture bag_btn ;
    Texture bag1_btn ;
    Texture jacket_btn ;
    Texture jacket1_btn ;
    Texture color_cartela_btn;
    Texture accessories_btn;
    Texture blush_btn ;
    Texture blush1_btn ;
    Texture eyehair_btn ;
    Texture eyehair1_btn ;
    Texture hairband_btn ;
    Texture hairband1_btn;
    Texture lipstick_btn ;
    Texture lipstick1_btn ;
    Texture scarf_btn ;
    Texture scarf1_btn ;
    Texture jewelery_btn;
    Texture hairbuckle_btn;

    //selections
    Texture selected_btn;
    Texture selected;

    private boolean isButtonSelected = false;
    private Vector2 btnSelectionPos ;
    private Vector2 btnStaticSelectionPos ;
    private Vector2 btnMakeupSelectionPos ;
    private Vector2 btnAccessorySelectionPos ;

    Sound ses1;
    boolean isMusic;

    float pputX  ;
    float pputY  ;

    boolean makeupMenu = false;
    boolean accessoryMenu = false;
    boolean settingsMenu = false;
    boolean hide_all = false;
    boolean hided = false;
    boolean allow_screenshot = false;

    final float CAMERA_WIDTH = 800f;
    final float CAMERA_HEIGHT = 1280f;

    public static float deltaSlideX =0f;
    public static float deltaSlideY =0f;
    public static float tmpDeltaX = 0f;

    ArrayList<Button> accessoryButtons = new ArrayList<Button>();
    ArrayList<Button> makeupButtons = new ArrayList<Button>();

    ArrayList<Button> buttons = new ArrayList<Button>();
    ArrayList<Button> buttonsStatic = new ArrayList<Button>();

    ArrayList<Button> buttonsMenu = new ArrayList<Button>();
    ArrayList<Button> buttonsMakeup = new ArrayList<Button>();
    ArrayList<Button> buttonsAccessory = new ArrayList<Button>();
    ArrayList<Button> buttonSettings = new ArrayList<Button>();

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


    Vector2 btnPosSpecial=  new Vector2(695.0f,1175.0f);
    Vector2 btnPosSpecialA=  new Vector2(580.0f,1175.0f);
    Vector2 btnPosSpecialB=  new Vector2(580.0f,1060.0f);
    Vector2 btnPosSpecialC=  new Vector2(695.0f,1060.0f);

    public Vector2 btnPosSpecial1=  new Vector2(5.0f,970.0f);
    public Vector2 btnPosSpecial2=  new Vector2(5.0f,845.0f);
    public Vector2 btnPosSpecial3=  new Vector2(5.0f,720.0f);
    public Vector2 btnPosSpecial4=  new Vector2(5.0f,595.0f);
    public Vector2 btnPosSpecial5=  new Vector2(5.0f,470.0f);
    public Vector2 btnPosSpecial6=  new Vector2(5.0f,345.0f);
    public Vector2 btnPosSpecial7=  new Vector2(695.0f,970.0f);
    public Vector2 btnPosSpecial8=  new Vector2(695.0f,845.0f);
    public Vector2 btnPosSpecial9=  new Vector2(695.0f,720.0f);
    public Vector2 btnPosSpecial10=  new Vector2(695.0f,595.0f);
    public Vector2 btnPosSpecial10_1=  new Vector2(590.0f,805.0f);
    public Vector2 btnPosSpecial10_2=  new Vector2(580.0f,700.0f);
    public Vector2 btnPosSpecial10_3=  new Vector2(585.0f,595.0f);
    public Vector2 btnPosSpecial10_4=  new Vector2(580.0f,490.0f);
    public Vector2 btnPosSpecial10_5=  new Vector2(590.0f,385.0f);
    public Vector2 btnPosSpecial10_6=  new Vector2(590.0f,280.0f);

    public Vector2 btnPosSpecial11=  new Vector2(695.0f,470.0f);
    public Vector2 btnPosSpecial12=  new Vector2(695.0f,345.0f);
    public Vector2 btnPosSpecial12_1=  new Vector2(590.0f,805.0f);
    public Vector2 btnPosSpecial12_2=  new Vector2(580.0f,700.0f);
    public Vector2 btnPosSpecial12_3=  new Vector2(585.0f,595.0f);
    public Vector2 btnPosSpecial12_4=  new Vector2(585.0f,490.0f);
    public Vector2 btnPosSpecial12_5=  new Vector2(580.0f,385.0f);



    public ArrayList<Button> getAccessoryButtons(){return accessoryButtons;}

    public ArrayList<Button> getMakeupButtons(){return makeupButtons;}

    public ArrayList<Button> getButtons(){return buttons;}

    public ArrayList<Button> getButtonsStatic(){
        return buttonsStatic;
    }

    public ArrayList<Button> getButtonsMenu(){
        return buttonsMenu;
    }

    public ArrayList<Button> getButtonsMakeup(){
        return buttonsMakeup;
    }

    public ArrayList<Button> getButtonsAccessory(){
        return buttonsAccessory;
    }

    public ArrayList<Button> getButtonSettings(){
        return buttonSettings;
    }


    //layout + buttons
    public Layout(){
        layout = Assets.manager.get("items/layout.png", Texture.class);

        ileri = Assets.manager.get("buttons/ileri.png", Texture.class);
        delete = Assets.manager.get("buttons/delete.png", Texture.class);
        anna = Assets.manager.get("buttons/anna.png", Texture.class);
        back = Assets.manager.get("buttons/back.png", Texture.class);
        peruk_btn = Assets.manager.get("buttons/peruk_btn.png", Texture.class);
        up_btn = Assets.manager.get("buttons/up_btn.png", Texture.class);
        up1_btn= Assets.manager.get("buttons/up1_btn.png", Texture.class);

        dress_btn = Assets.manager.get("buttons/dress_btn.png", Texture.class);
        dress1_btn = Assets.manager.get("buttons/dress1_btn.png", Texture.class);
        lenses_btn = Assets.manager.get("buttons/lenses_btn.png", Texture.class);


        bag_btn = Assets.manager.get("buttons/bag_btn.png", Texture.class);
        bag1_btn = Assets.manager.get("buttons/bag1_btn.png", Texture.class);

        jacket_btn = Assets.manager.get("buttons/jacket_btn.png", Texture.class);
        jacket1_btn = Assets.manager.get("buttons/jacket1_btn.png", Texture.class);

        color_cartela_btn = Assets.manager.get("buttons/color_cartela_btn.png", Texture.class);
        accessories_btn = Assets.manager.get("buttons/accessories_btn.png", Texture.class);

        blush_btn = Assets.manager.get("buttons/blush_btn.png", Texture.class);
        blush1_btn = Assets.manager.get("buttons/blush1_btn.png", Texture.class);

        eyehair_btn = Assets.manager.get("buttons/eyehair_btn.png", Texture.class);
        eyehair1_btn = Assets.manager.get("buttons/eyehair1_btn.png", Texture.class);

        hairband_btn = Assets.manager.get("buttons/hairband_btn.png", Texture.class);
        hairband1_btn = Assets.manager.get("buttons/hairband1_btn.png", Texture.class);

        lipstick_btn = Assets.manager.get("buttons/lipstick_btn.png", Texture.class);
        lipstick1_btn = Assets.manager.get("buttons/lipstick1_btn.png", Texture.class);

        scarf_btn = Assets.manager.get("buttons/scarf_btn.png", Texture.class);
        scarf1_btn = Assets.manager.get("buttons/scarf1_btn.png", Texture.class);

        hairbuckle_btn = Assets.manager.get("buttons/hairbuckle_btn.png", Texture.class);

        hair2_btn = Assets.manager.get("buttons/hair2_btn.png", Texture.class);
        hair3_btn = Assets.manager.get("buttons/hair3_btn.png", Texture.class);
        up2_btn = Assets.manager.get("buttons/up2_btn.png", Texture.class);
        but1_btn = Assets.manager.get("buttons/but1_btn.png", Texture.class);
        but2_btn = Assets.manager.get("buttons/but2_btn.png", Texture.class);
        hair4_btn= Assets.manager.get("buttons/hair4_btn.png", Texture.class);
        //static music
        music_yes = Assets.manager.get("buttons/music_yes.png", Texture.class);
        music_no = Assets.manager.get("buttons/music_no.png", Texture.class);

        //ses
        ses1 = Assets.manager.get("sound/buble.ogg", Sound.class);

        ///////////////////// static 12 button
        face_btn = Assets.manager.get("buttons/face_btn.png", Texture.class);
        hair_btn = Assets.manager.get("buttons/hair_btn.png", Texture.class);
        up_btn = Assets.manager.get("buttons/up_btn.png", Texture.class);
        trousers_btn = Assets.manager.get("buttons/trousers_btn.png", Texture.class);
        socks_btn = Assets.manager.get("buttons/socks_btn.png", Texture.class);
        shoes_btn = Assets.manager.get("buttons/shoes_btn.png", Texture.class);
        hat_btn  = Assets.manager.get("buttons/hat_btn.png", Texture.class);
        earrings_btn = Assets.manager.get("buttons/earrings_btn.png", Texture.class);
        necklace_btn = Assets.manager.get("buttons/necklace_btn.png", Texture.class);
        bracklet_btn = Assets.manager.get("buttons/bracklet_btn.png", Texture.class);
        makeup_btn = Assets.manager.get("buttons/makeup_btn.png", Texture.class);
        glasses_btn = Assets.manager.get("buttons/glasses_btn.png", Texture.class);
        up3_btn = Assets.manager.get("buttons/up3_btn.png", Texture.class);

        eyeliner_btn = Assets.manager.get("buttons/eyeliner_btn.png", Texture.class);

        btn_settings = Assets.manager.get("buttons/settings.png", Texture.class);
        btn_back2 = Assets.manager.get("buttons/back2.png", Texture.class);
        btn_save = Assets.manager.get("buttons/save.png", Texture.class);

        fade = Assets.manager.get("items/fade.png", Texture.class);
        jewelery_btn = Assets.manager.get("buttons/jewelery_btn.png", Texture.class);

        selected = Assets.manager.get("buttons/selected.png", Texture.class);
        selected_btn = Assets.manager.get("buttons/selected_btn.png", Texture.class);

        isMusic = true;

        pputX = (float) Gdx.graphics.getWidth() / CAMERA_WIDTH;
        pputY = (float) Gdx.graphics.getHeight() / CAMERA_HEIGHT;



        //makeup
        buttonsMakeup.add(new Button(btnPosSpecial10_1,boundType2,ses1,color_cartela_btn,1));
        buttonsMakeup.add(new Button(btnPosSpecial10_2,boundType2,ses1,eyehair_btn,2));
        buttonsMakeup.add(new Button(btnPosSpecial10_3,boundType2,ses1,blush_btn,3));
        buttonsMakeup.add(new Button(btnPosSpecial10_4,boundType2,ses1,lenses_btn,4));
        buttonsMakeup.add(new Button(btnPosSpecial10_5,boundType2,ses1,lipstick_btn,5));
        buttonsMakeup.add(new Button(btnPosSpecial10_6,boundType2,ses1,eyeliner_btn,6));

        //accessory
        buttonsAccessory.add(new Button(btnPosSpecial12_1,boundType2,ses1,scarf_btn,1));
        buttonsAccessory.add(new Button(btnPosSpecial12_2,boundType2,ses1,hairband1_btn,2));
        buttonsAccessory.add(new Button(btnPosSpecial12_3,boundType2,ses1,hairbuckle_btn,3));
        buttonsAccessory.add(new Button(btnPosSpecial12_4,boundType2,ses1,hat_btn,4));
        buttonsAccessory.add(new Button(btnPosSpecial12_5,boundType2,ses1,glasses_btn,5));

        //menu & settings
        buttonSettings.add(new Button(btnPosSpecial,boundType2,ses1,btn_settings,0)); //settings menu button
        buttonsMenu.add(new Button(btnPosSpecialA,boundType2,ses1,music_yes,1)); //0 ses
        buttonsMenu.add(new Button(btnPosSpecialB,boundType2,ses1,btn_save,2)); //14 kaydet
        buttonsMenu.add(new Button(btnPosSpecialC,boundType2,ses1,btn_back2,3)); //15 geri


        buttonsStatic.add(new Button(btnPosSpecial1,boundType2,ses1,face_btn,1)); //1  model
        buttonsStatic.add(new Button(btnPosSpecial2,boundType2,ses1,hair_btn,2)); //2  hair
        buttonsStatic.add(new Button(btnPosSpecial3,boundType2,ses1,up_btn,3)); //3  tshirt
        buttonsStatic.add(new Button(btnPosSpecial4,boundType2,ses1,trousers_btn,4)); //4  trousers
        buttonsStatic.add(new Button(btnPosSpecial5,boundType2,ses1,dress_btn,5)); //5  dress
        buttonsStatic.add(new Button(btnPosSpecial6,boundType2,ses1,jacket_btn,6)); //6  jacket
        buttonsStatic.add(new Button(btnPosSpecial7,boundType2,ses1,bag_btn,7)); //7  bag
        buttonsStatic.add(new Button(btnPosSpecial8,boundType2,ses1,socks_btn,8)); //8  socks
        buttonsStatic.add(new Button(btnPosSpecial9,boundType2,ses1,shoes_btn,9)); //9  shoes
        buttonsStatic.add(new Button(btnPosSpecial10,boundType2,ses1,accessories_btn,10)); //10 accesorries
        buttonsStatic.add(new Button(btnPosSpecial11,boundType2,ses1,jewelery_btn,11)); //11 takı
        buttonsStatic.add(new Button(btnPosSpecial12,boundType2,ses1,makeup_btn,12)); //12 makyaj


        buttonsAdd_Stage1();

        btnStaticSelectionPos=btnPosSpecial1;
    }

    public void buttonsAdd_Stage1(){ //model
        buttons.clear();

        buttons.add(new Button(btnPos1,boundType1,ses1,delete,2));
        buttons.add(new Button(btnPos2,boundType1,ses1,anna,1));
        buttons.add(new Button(btnPos3,boundType1,ses1,anna,20));
        //buttons.add(new Button(btnPos4,boundType1,ses1,face,20));

    }

    public void buttonsAdd_Stage2(){ //saç
        buttons.clear();

        buttons.add(new Button(btnPos5,boundType1,ses1,hair4_btn,30));  // peruk3
        buttons.add(new Button(btnPos4,boundType1,ses1,hair3_btn,13));  // peruk3
        buttons.add(new Button(btnPos3,boundType1,ses1,hair2_btn,12));  // peruk2
        buttons.add(new Button(btnPos2,boundType1,ses1,peruk_btn,3));  // peruk1
        buttons.add(new Button(btnPos1,boundType1,ses1,delete,4)); //perukları sil
    }

    public void buttonsAdd_Stage3(){ //üst
        buttons.clear();

        buttons.add(new Button(btnPos3,boundType1,ses1,up2_btn,16));  // giysi2
        buttons.add(new Button(btnPos1,boundType1,ses1,delete,15));  // giysi sil
        buttons.add(new Button(btnPos2,boundType1,ses1,up1_btn,14)); //giysi1
        buttons.add(new Button(btnPos4,boundType1,ses1,up3_btn,29)); //giysi1
    }

    public void buttonsAdd_Stage4(){ //alt
        buttons.clear();

        buttons.add(new Button(btnPos3,boundType1,ses1,but1_btn,17));  // but 1
        buttons.add(new Button(btnPos2,boundType1,ses1,but2_btn,18)); //but 2
        buttons.add(new Button(btnPos1,boundType1,ses1,delete,19)); //but sil
    }

    public void buttonsAdd_Stage5(){ //çorap
        buttons.clear();

        buttons.add(new Button(btnPos2,boundType1,ses1,socks_btn,21));  // but 1
        //buttons.add(new Button(btnPos1,boundType1,ses1,socks_btn,21));  // but 1
    }
    public void buttonsAdd_Stage6(){//ayakkabı
        buttons.clear();

        buttons.add(new Button(btnPos2,boundType1,ses1,shoes_btn,22));  // but 1
    }
    public void buttonsAdd_Stage7(){//şapka
        buttons.clear();

        buttons.add(new Button(btnPos2,boundType1,ses1,hat_btn,23));  // but 1
    }
    public void buttonsAdd_Stage8(){//küpe
        buttons.clear();

        buttons.add(new Button(btnPos2,boundType1,ses1,earrings_btn,24));
    }
    public void buttonsAdd_Stage9(){//kolye
        buttons.clear();

        buttons.add(new Button(btnPos2,boundType1,ses1,necklace_btn,25));
    }
    public void buttonsAdd_Stage10(){//takı
        buttons.clear();

        //buttons.add(new Button(btnPos2,boundType1,ses1,bracklet_btn,26));
    }
    public void buttonsAdd_Stage11(){//makyaj
        buttons.clear();

        //buttons.add(new Button(btnPos2,boundType1,ses1,makeup_btn,27));
    }
    public void buttonsAdd_Stage12(){//gözlük
        buttons.clear();

        buttons.add(new Button(btnPos3,boundType1,ses1,glasses_btn,28));
    }

    public void buttonsAdd_Stage10_1(){
        buttons.clear();

        buttons.add(new Button(btnPos3,boundType1,ses1,glasses_btn,28));
    }

    public void buttonsAdd_Stage10_2(){
        buttons.clear();

        buttons.add(new Button(btnPos3,boundType1,ses1,glasses_btn,28));
    }

    public void buttonsAdd_Stage10_3(){
        buttons.clear();
        buttons.add(new Button(btnPos3,boundType1,ses1,glasses_btn,28));
    }

    public void buttonsAdd_Stage10_4(){
        buttons.clear();

        buttons.add(new Button(btnPos3,boundType1,ses1,glasses_btn,28));
    }

    public void buttonsAdd_Stage10_5(){
        buttons.clear();

        buttons.add(new Button(btnPos2,boundType1,ses1,glasses_btn,28));
    }

    public void buttonsAdd_Stage10_6(){
        buttons.clear();

        buttons.add(new Button(btnPos3,boundType1,ses1,glasses_btn,28));
    }

    public void buttonsAdd_Stage12_1(){
        buttons.clear();


    }

    public void buttonsAdd_Stage12_2(){
        buttons.clear();


    }

    public void buttonsAdd_Stage12_3(){
        buttons.clear();


    }

    public void buttonsAdd_Stage12_4(){
        buttons.clear();


    }

    public void buttonsAdd_Stage12_5(){
        buttons.clear();

        buttons.add(new Button(btnPos3,boundType1,ses1,glasses_btn,28));
    }



     public void drawLayout(SpriteBatch spriteBatch) {


             spriteBatch.draw(
                     layout,
                     0.0f,
                     0.0f,
                     CAMERA_WIDTH*pputX,
                     CAMERA_HEIGHT*pputY

             );



             drawButtons( spriteBatch);

         if(isButtonSelected)
         drawButtonSelect(spriteBatch);

         drawButtonsStatic(spriteBatch);
         drawButtonsStaticSelect(spriteBatch);

         if(accessoryMenu)
         {
             drawButtonsAccessory(spriteBatch);
             drawButtonsAccessorySelect(spriteBatch);
         }

         if(makeupMenu)
         {
             drawButtonsMakeup(spriteBatch);
             drawButtonsMakeupSelect(spriteBatch);
         }

         if (settingsMenu){

             spriteBatch.draw(
                     fade,
                     0.0f,
                     0.0f,
                     CAMERA_WIDTH*pputX,
                     CAMERA_HEIGHT*pputY
             );

             drawButtonsMenu(spriteBatch);


         }


         drawButtonSettings(spriteBatch);



    }

    private void drawButtonsMakeupSelect(SpriteBatch spriteBatch) {
        spriteBatch.draw(
                selected_btn,
                btnMakeupSelectionPos.x*pputX,
                btnMakeupSelectionPos.y*pputY ,
                100f*pputX,
                100f*pputY
        );
    }

    private void drawButtonsAccessorySelect(SpriteBatch spriteBatch) {
        spriteBatch.draw(
                selected_btn,
                btnAccessorySelectionPos.x*pputX,
                btnAccessorySelectionPos.y*pputY ,
                100f*pputX,
                100f*pputY
        );
    }

    private void drawButtonsStaticSelect(SpriteBatch spriteBatch) {
        spriteBatch.draw(
                selected_btn,
                btnStaticSelectionPos.x*pputX,
                btnStaticSelectionPos.y*pputY ,
                100f*pputX,
                100f*pputY
        );
    }

    private void drawButtonSelect(SpriteBatch spriteBatch) {
        spriteBatch.draw(
                selected,
                btnSelectionPos.x*pputX+deltaSlideX*pputX,
                btnSelectionPos.y*pputY ,
                150f*pputX,
                150f*pputY
        );
    }

    public void drawButtons( SpriteBatch spriteBatch){

          for (Button button : this.getButtons()) {

              spriteBatch.draw(
                      button.texture,
                      button.position.x*pputX+deltaSlideX*pputX,
                      button.position.y*pputY ,
                      button.bounds.getX()*pputX,
                      button.bounds.getY()*pputY
              );

          }

      }

    public void drawButtonsMakeup(SpriteBatch spriteBatch){

        for (Button button : this.getButtonsMakeup()) {

            spriteBatch.draw(
                    button.texture,
                    button.position.x*pputX,
                    button.position.y*pputY ,
                    button.bounds.getX()*pputX,
                    button.bounds.getY()*pputY
            );

        }

    }

    public void drawButtonsAccessory( SpriteBatch spriteBatch){

        for (Button button : this.getButtonsAccessory()) {

            spriteBatch.draw(
                    button.texture,
                    button.position.x*pputX,
                    button.position.y*pputY ,
                    button.bounds.getX()*pputX,
                    button.bounds.getY()*pputY
            );

        }

    }

    public void drawButtonsStatic( SpriteBatch spriteBatch){

        for (Button button : this.getButtonsStatic()) {

            spriteBatch.draw(
                    button.texture,
                    button.position.x*pputX,
                    button.position.y*pputY ,
                    button.bounds.getX()*pputX,
                    button.bounds.getY()*pputY
            );

        }

    }

    public void drawButtonsMenu( SpriteBatch spriteBatch){

        for (Button button : this.getButtonsMenu()) {

            spriteBatch.draw(
                    button.texture,
                    button.position.x*pputX,
                    button.position.y*pputY ,
                    button.bounds.getX()*pputX,
                    button.bounds.getY()*pputY
            );

        }

    }

    public void drawButtonSettings( SpriteBatch spriteBatch){

        for (Button button : this.getButtonSettings()) {

            spriteBatch.draw(
                    button.texture,
                    button.position.x*pputX,
                    button.position.y*pputY ,
                    button.bounds.getX()*pputX,
                    button.bounds.getY()*pputY
            );

        }

    }

    public void drawMakeupMenu( SpriteBatch spriteBatch){
        for (Button button : this.getButtonsMenu()) {
            spriteBatch.draw(
                    button.texture,
                    button.position.x*pputX,
                    button.position.y*pputY ,
                    button.bounds.getX()*pputX,
                    button.bounds.getY()*pputY
            );
        }
    }

    public void drawAccessoryMenu( SpriteBatch spriteBatch){
        for (Button button : this.getButtonsMenu()) {
            spriteBatch.draw(
                    button.texture,
                    button.position.x*pputX,
                    button.position.y*pputY ,
                    button.bounds.getX()*pputX,
                    button.bounds.getY()*pputY
            );
        }
    }




    public void setMusicOff() {
        isMusic = false;
        buttonsMenu.get(0).texture = music_no;
    }
    public void setMusicOn() {
        isMusic = true;

        buttonsMenu.get(0).texture = music_yes;


    }

    public void settingsMenuEnable() {

        settingsMenu = true;
    }

    public void settingsMenuDisable() {

        settingsMenu = false;
    }

    public void hide(boolean b) {
        if(b)
        {
            hide_all= true;
        }
        else
        {
            hide_all= false;
        }
    }

    public void makeupMenuEnable(){
        makeupMenu = true;
    }
    public void makeupMenuDisable(){
        makeupMenu = false;
    }

    public boolean isMakeupMenu() {
        return makeupMenu;
    }

    public boolean isAccessoriesMenu(){
        return accessoryMenu;
    }
    public void accessoriesMenuEnable(){
        accessoryMenu = true;
    }
    public void accessoriesMenuMenuDisable(){
        accessoryMenu = false;
    }

    public boolean getAccessoryMenu()
    {
        return accessoryMenu;
    }

    public boolean getMakeupMenu()
    {
        return makeupMenu;
    }

    public void setBtnStaticSelectionPos(Vector2 pos){

        btnStaticSelectionPos = pos;

    }

    public void setBtnSelectionPos(Vector2 pos){
        isButtonSelected = true;
        btnSelectionPos = pos;
    }

    public void setBtnSelectionOff() {
        isButtonSelected = false;

    }

    public void setBtnMakeupSelectionPos(Vector2 btnMakeupSelectionPos) {
        this.btnMakeupSelectionPos = btnMakeupSelectionPos;
    }

    public void setBtnAccessorySelectionPos(Vector2 btnAccessorySelectionPos) {
        this.btnAccessorySelectionPos = btnAccessorySelectionPos;
    }
}
