package com.mygdx.game;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.UI.Button;
import com.mygdx.game.UI.Layout;
import com.mygdx.game.UI.PopupMenu;

import java.util.ArrayList;

/**
 * Created by dell on 08.08.2015.
 */
public class TapProcesser {

    World world;
    Layout layout;
    PopupMenu popupMenu;
    Renderer renderer;
    int menuType;
    boolean settingsMenuOpen = false;

    DataBase db;

    Vector2 marks[] = new Vector2[12];

    Vector2 marks10[] = new Vector2[6];
    Vector2 marks12[] = new Vector2[5];



    ArrayList<Button> buttons = new ArrayList<Button>();
    ArrayList<Button> buttonsStatic = new ArrayList<Button>();
    ArrayList<Button> buttonSettings = new ArrayList<Button>();
    ArrayList<Button> buttonsMenu = new ArrayList<Button>();
    ArrayList<Button> buttonsMakeup   = new ArrayList<Button>();
    ArrayList<Button> buttonsAccessory = new ArrayList<Button>();

    ArrayList<Button> menubuttons = new ArrayList<Button>();

    boolean menuOpen = false;

    TapProcesser(Layout layout,World world,PopupMenu popupMenu, Renderer renderer) {


        this.layout = layout;
        this.world = world;
        this.popupMenu = popupMenu;
        this.renderer = renderer;

        buttons = layout.getButtons();
        buttonsStatic = layout.getButtonsStatic();
        buttonSettings = layout.getButtonSettings();
        buttonsMenu = layout.getButtonsMenu();
        buttonsMakeup = layout.getButtonsMakeup();
        buttonsAccessory = layout.getButtonsAccessory();

        db = new DataBase();

        if (db.isMusicON()) {
            //world.startMusic();
            //layout.setMusicOn();

        }
        else
        {
            world.stopMusic();
            layout.setMusicOff();
        }
    }

    public void tap(int x, int y) {

        if (menuOpen == true && settingsMenuOpen == false)
        {
            menubuttons = popupMenu.getButtons();

            for (Button button : menubuttons) {
                if (x < button.position.x + button.bounds.getX() && button.position.x < x) {
                    if (y < button.position.y + button.bounds.getY() && button.position.y < y) {

                        if (menuType == 1) {// model sil
                            if (button.id == 0)//no
                            {
                                button.sound.play(1.0f);

                                menuOpen = false;

                                popupMenu.close();
                                break;

                            } else if (button.id == 1) { //yes
                                button.sound.play(1.0f);


                                world.setModelId(0);
                                world.setUpId(0);
                                world.setBrackletlId(0);
                                world.setButId(0);
                                world.setEarringslId(0);
                                world.setGlasseslId(0);
                                world.setHairId(0);
                                world.setHatId(0);
                                world.setMakeupId(0);
                                world.setNecklacelId(0);
                                world.setShoeslId(0);
                                world.setSocksId(0);

                                menuOpen = false;

                                popupMenu.close();

                                break;

                            } else {
                            }
                        }
                        else if (menuType == 1){
                            if (button.id == 0)//no
                            {
                                button.sound.play(1.0f);

                                menuOpen = false;

                                popupMenu.close();
                                break;

                            }
                            else
                            {

                            }


                        }
                    }
                }
            }
        }

        if (menuOpen == false )
        if (y > 200)
        {
            if(settingsMenuOpen == false)
            for (Button button : buttonsStatic) {
                if (x < button.position.x + button.bounds.getX() && button.position.x < x) {
                    if (y < button.position.y + button.bounds.getY() && button.position.y < y) {
                        boolean btnPressed = true;

                        layout.tmpDeltaX = 0f;
                        layout.deltaSlideX = 0f;

                        if (button.id==1)
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage1();
                            layout.setBtnStaticSelectionPos(layout.btnPosSpecial1);
                            if (marks[0]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks[0]);
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==2)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage2();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial2);
                                if (marks[1]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[1]);
                                }

                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();

                        }
                        else if (button.id==3)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage3();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial3);
                                if (marks[2]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[2]);
                                }
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==4)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage4();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial4);
                                if (marks[3]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[3]);
                                }
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==5)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage5();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial5);
                                if (marks[4]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[4]);
                                }
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==6)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage6();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial6);
                                if (marks[5]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[5]);
                                }
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==7)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage7();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial7);
                                if (marks[6]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[6]);
                                }
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==8)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage8();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial8);
                                if (marks[7]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[7]);
                                }
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==9)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage9();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial9);
                                if (marks[8]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[8]);
                                }
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==10)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                if(!layout.getMakeupMenu())
                                {

                                    button.sound.play(1.0f);
                                    layout.buttonsAdd_Stage10();

                                    layout.setBtnMakeupSelectionPos(layout.btnPosSpecial10_1);
                                    layout.buttonsAdd_Stage10_1();

                                    layout.makeupMenuEnable();

                                    layout.setBtnStaticSelectionPos(layout.btnPosSpecial10);
                                    if (marks10[0]==null)
                                    {
                                        layout.setBtnSelectionOff();
                                    }
                                    else
                                    {
                                        layout.setBtnSelectionPos(marks10[0]);
                                    }
                                    world.zoomCam();

                                }
                                else
                                {
                                    button.sound.play(1.0f);
                                    layout.makeupMenuDisable();
                                    world.zoomNormal();
                                }

                            }

                            layout.accessoriesMenuMenuDisable();

                        }
                        else if (button.id==11)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                button.sound.play(1.0f);
                                layout.buttonsAdd_Stage11();
                                layout.setBtnStaticSelectionPos(layout.btnPosSpecial11);

                                if (marks[10]==null)
                                {
                                    layout.setBtnSelectionOff();
                                }
                                else
                                {
                                    layout.setBtnSelectionPos(marks[10]);
                                }
                            }

                            world.zoomNormal();
                            layout.accessoriesMenuMenuDisable();
                            layout.makeupMenuDisable();
                        }
                        else if (button.id==12)
                        {
                            if (world.getModelId() == 0)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Lütfen önce model seçin!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                if(!layout.getAccessoryMenu())
                                {
                                    button.sound.play(1.0f);
                                    layout.buttonsAdd_Stage12();

                                    layout.buttonsAdd_Stage12_1();
                                    layout.setBtnAccessorySelectionPos(layout.btnPosSpecial12_1);

                                    layout.accessoriesMenuEnable();
                                    world.zoomCam();
                                    layout.setBtnStaticSelectionPos(layout.btnPosSpecial12);
                                    if (marks[11]==null)
                                    {
                                        layout.setBtnSelectionOff();
                                    }
                                    else
                                    {
                                        layout.setBtnSelectionPos(marks[11]);
                                    }
                                }
                                else
                                {
                                    button.sound.play(1.0f);
                                    layout.accessoriesMenuMenuDisable();
                                    world.zoomNormal();

                                }

                            }

                            layout.makeupMenuDisable();
                        }
                        else
                        {


                        }
                    }
                }
            }
            if(settingsMenuOpen == true)
            for (Button button : buttonsMenu) {
                if (x < button.position.x + button.bounds.getX() && button.position.x < x) {
                    if (y < button.position.y + button.bounds.getY() && button.position.y < y) {

                        if (button.id == 1) //ses
                        {
                            if (world.isMusic()) {
                                world.stopMusic();
                                layout.setMusicOff();

                                db.setMusicStateOFF();

                            } else {
                                world.startMusic();
                                layout.setMusicOn();

                                db.setMusicStateON();
                            }

                            break;
                        }
                        else if (button.id == 2) //kaydet
                        {

                            settingsMenuOpen = false;
                            renderer.screenshot();
                            layout.settingsMenuDisable();


                            if (true)
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"ekran görüntüsü kaydedildi!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),0,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }
                            else
                            {
                                popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"görüntü kaydedilemedi!");
                                popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),0,"Tamam");
                                popupMenu.setMenuStatus(true);
                                menuType = 1;
                                menuOpen = true;
                            }

                            break;
                        }
                        else if (button.id == 3) //geri
                        {
                            if(settingsMenuOpen)
                            {
                                layout.settingsMenuDisable();
                                settingsMenuOpen = false;
                            }
                            else
                            {
                                layout.settingsMenuEnable();
                                settingsMenuOpen = true;
                            }
                            break;
                        }

                    }
                }
            }


                for (Button button : buttonSettings) {
                if (x < button.position.x + button.bounds.getX() && button.position.x < x) {
                    if (y < button.position.y + button.bounds.getY() && button.position.y < y) {

                        if (button.id == 0) //settings menu
                        {
                            if(settingsMenuOpen)
                            {
                                layout.settingsMenuDisable();
                                settingsMenuOpen = false;
                            }
                            else
                            {
                                layout.settingsMenuEnable();
                                settingsMenuOpen = true;


                                //AYARLAR MENÜSÜ AÇIIIIIIIIIIIIIIIIIIIIIIIIIIK
                            }
                        }


                    }
                }
            }
            if(layout.isMakeupMenu())
            if(settingsMenuOpen == false)
            for (Button button : buttonsMakeup) {
                if (x < button.position.x + button.bounds.getX() && button.position.x < x) {
                    if (y < button.position.y + button.bounds.getY() && button.position.y < y) {


                        if (button.id == 1) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage10_1();

                            layout.setBtnMakeupSelectionPos(layout.btnPosSpecial10_1);

                            if (marks10[0]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks[0]);
                            }

                            break;
                        }
                        else if (button.id == 2) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage10_2();
                            layout.setBtnMakeupSelectionPos(layout.btnPosSpecial10_2);

                            if (marks10[1]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks[1]);
                            }

                            break;
                        }
                        else if (button.id == 3) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage10_3();
                            layout.setBtnMakeupSelectionPos(layout.btnPosSpecial10_3);

                            if (marks10[2]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks[2]);
                            }

                            break;
                        }
                        else if (button.id == 4) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage10_4();
                            layout.setBtnMakeupSelectionPos(layout.btnPosSpecial10_4);

                            if (marks10[3]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks[3]);
                            }

                            break;
                        }
                        else if (button.id == 5) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage10_5();
                            layout.setBtnMakeupSelectionPos(layout.btnPosSpecial10_5);

                            if (marks10[4]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks[4]);
                            }

                            break;
                        }else if (button.id == 6) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage10_6();
                            layout.setBtnMakeupSelectionPos(layout.btnPosSpecial10_6);

                            if (marks10[5]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks[5]);
                            }

                            break;
                        }

                    }
                }
            }

            if(layout.isAccessoriesMenu())
            if(settingsMenuOpen == false)
            for (Button button : buttonsAccessory) {
                if (x < button.position.x + button.bounds.getX() && button.position.x < x) {
                    if (y < button.position.y + button.bounds.getY() && button.position.y < y) {


                        if (button.id == 1) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage12_1();
                            layout.setBtnAccessorySelectionPos(layout.btnPosSpecial12_1);

                            if (marks10[0]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks[0]);
                            }

                            break;
                        }
                        else if (button.id == 2) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage12_2();
                            layout.setBtnAccessorySelectionPos(layout.btnPosSpecial12_2);

                            if (marks12[1]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks12[1]);
                            }

                            break;
                        }
                        else if (button.id == 3) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage12_3();
                            layout.setBtnAccessorySelectionPos(layout.btnPosSpecial12_3);

                            if (marks12[2]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks12[2]);
                            }

                            break;
                        }
                        else if (button.id == 4) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage12_4();
                            layout.setBtnAccessorySelectionPos(layout.btnPosSpecial12_4);

                            if (marks12[3]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks12[3]);
                            }

                            break;
                        }
                        else if (button.id == 5) //
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage12_5();
                            layout.setBtnAccessorySelectionPos(layout.btnPosSpecial12_5);

                            if (marks12[4]==null)
                            {
                                layout.setBtnSelectionOff();
                            }
                            else
                            {
                                layout.setBtnSelectionPos(marks12[4]);
                            }

                            break;
                        }
                    }
                }
            }


        }
        else if (y<200 && settingsMenuOpen == false)
        {

            for (Button button : buttons) {
                if (x<button.position.x+layout.deltaSlideX+button.bounds.getX() &&  button.position.x+layout.deltaSlideX < x)
                {
                    if(y<button.position.y*world.pputY+button.bounds.getY()*world.pputY &&  button.position.y*world.pputY <y)
                    {

                        boolean btnPressed = true;

                        if(button.id==0)// bölüm 2
                        {
                            layout.buttonsAdd_Stage2();
                            button.sound.play(1.0f);

                        }
                        else if (button.id==1) // model 1
                        {
                            button.sound.play(1.0f);
                            world.setModelId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[0]=button.position;
                        }
                        else if (button.id==2) // model sil
                        {
                            button.sound.play(1.0f);

                            popupMenu.titleAdd(new Vector2(300,700.0f),new Rectangle(180.0f,100.0f,0f,0f),"Tüm Seçimler Silinecek!");
                            popupMenu.buttonsAdd(new Vector2(320,550.0f),new Rectangle(180.0f,100.0f,0f,0f),1,"Evet");
                            popupMenu.buttonsAdd(new Vector2(320,440.0f),new Rectangle(180.0f,100.0f,0f,0f),0,"Hayır");
                            popupMenu.setMenuStatus(true);
                            menuType = 1;
                            menuOpen = true;
                            marks[0]=null;
                            layout.setBtnSelectionOff();

                        }
                        else if (button.id==3) // saç 1
                        {
                            button.sound.play(1.0f);
                            world.setHairId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[1]=button.position;
                        }
                        else if (button.id==4)// saç sil
                        {
                            button.sound.play(1.0f);
                            world.setHairId(0);
                            layout.setBtnSelectionOff();
                            marks[1]=null;
                        }
                        else if (button.id==5)// bölüm 1 geri
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage1();
                        }
                        else if (button.id==6) //bölüm 3
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage3();
                        }
                        else if (button.id==7)//bölüm 4
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage4();
                        }
                        else if (button.id==8)//bölüm 5
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage5();
                        }
                        else if (button.id==9)//bölüm 2 geri
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage1();
                        }
                        else if (button.id==10)//bölüm 3 geri
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage3();
                        }
                        else if (button.id==11)//bölüm 4 geri
                        {
                            button.sound.play(1.0f);
                            layout.buttonsAdd_Stage4();
                        }
                        else if (button.id==12)//saç 2
                        {
                            button.sound.play(1.0f);
                            world.setHairId(2);
                            layout.setBtnSelectionPos(button.position);
                            marks[1]=button.position;
                        }
                        else if (button.id==13)//saç 3
                        {
                            button.sound.play(1.0f);
                            world.setHairId(3);
                            layout.setBtnSelectionPos(button.position);
                            marks[1]=button.position;
                        }
                        else if (button.id==14)//giysi 1
                        {
                            button.sound.play(1.0f);
                            world.setUpId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[2]=button.position;
                        }
                        else if (button.id==15)//giysi sil
                        {
                            button.sound.play(1.0f);
                            world.setUpId(0);
                            layout.setBtnSelectionOff();
                            marks[2]=null;

                        }
                        else if (button.id==16)//giysi 2
                        {
                            button.sound.play(1.0f);
                            world.setUpId(2);
                            layout.setBtnSelectionPos(button.position);
                            marks[2]=button.position;
                        }
                        else if (button.id==17)//but 1
                        {
                            button.sound.play(1.0f);
                            world.setButId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[3]=button.position;

                        }
                        else if (button.id==18)//but 2
                        {
                            button.sound.play(1.0f);
                            world.setButId(2);
                            layout.setBtnSelectionPos(button.position);
                            marks[3]=button.position;
                        }
                        else if (button.id==19) // but sil
                        {
                            button.sound.play(1.0f);
                            world.setButId(0);
                            layout.setBtnSelectionOff();
                            marks[3]=null;
                        }
                        else if (button.id==20)//model2
                        {
                            button.sound.play(1.0f);
                            world.setModelId(2);
                            layout.setBtnSelectionPos(button.position);
                            marks[0]=button.position;
                        }
                        else if (button.id==21)//elbise
                        {
                            button.sound.play(1.0f);
                            world.setSocksId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[4]=button.position;

                        }
                        else if (button.id==22)//ceket
                        {
                            button.sound.play(1.0f);
                            world.setShoeslId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[5]=button.position;
                        }
                        else if (button.id==23)//çanta
                        {
                            button.sound.play(1.0f);
                            world.setHatId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[6]=button.position;
                        }
                        else if (button.id==24)//çorap
                        {
                            button.sound.play(1.0f);
                            world.setEarringslId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[7]=button.position;
                        }
                        else if (button.id==25)//ayakkabı
                        {
                            button.sound.play(1.0f);
                            world.setNecklacelId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[8]=button.position;
                        }
                        else if (button.id==26)//model2
                        {
                            button.sound.play(1.0f);
                            //world.setBrackletlId(1);
                        }
                        else if (button.id==27)//model2
                        {
                            button.sound.play(1.0f);
                            //world.setMakeupId(1);
                        }
                        else if (button.id==28)//takı
                        {
                            button.sound.play(1.0f);
                            world.setGlasseslId(1);
                            layout.setBtnSelectionPos(button.position);
                            marks[11]=button.position;
                        }
                        else if (button.id==29)//model2
                        {
                            button.sound.play(1.0f);
                            world.setUpId(3);
                            layout.setBtnSelectionPos(button.position);
                            marks[2]=button.position;
                        }
                        else if (button.id==30)//model2
                        {
                            button.sound.play(1.0f);
                            world.setHairId(4);
                            layout.setBtnSelectionPos(button.position);
                            marks[1]=button.position;
                        }
                        else
                        {
                            btnPressed = false;
                        }
                        if (btnPressed)
                        {
                            break;
                        }
                    }

                }


            }
        }

    }
}
