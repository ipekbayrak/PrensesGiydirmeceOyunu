package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.sql.Database;
import com.badlogic.gdx.sql.DatabaseCursor;
import com.badlogic.gdx.sql.DatabaseFactory;
import com.badlogic.gdx.sql.SQLiteGdxException;

public class DataBase  {

    Database dbHandler;

    public static final String TABLE_SETTINGS = "settings";
    public static final String TABLE_PRINCESS = "princess";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_MUSIC = "music";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_ATTRIBUTE1 = "attribute1";
    public static final String COLUMN_ATTRIBUTE2 = "attribute2";
    public static final String COLUMN_ATTRIBUTE3 = "attribute3";
    public static final String COLUMN_ATTRIBUTE4 = "attribute4";
    public static final String COLUMN_ATTRIBUTE5 = "attribute5";
    public static final String COLUMN_ATTRIBUTE6 = "attribute6";
    public static final String COLUMN_ATTRIBUTE7 = "attribute7";
    public static final String COLUMN_ATTRIBUTE8 = "attribute8";
    public static final String COLUMN_ATTRIBUTE9 = "attribute9";
    public static final String COLUMN_ATTRIBUTE10_1 = "attribute10_1";
    public static final String COLUMN_ATTRIBUTE10_2 = "attribute10_2";
    public static final String COLUMN_ATTRIBUTE10_3 = "attribute10_3";
    public static final String COLUMN_ATTRIBUTE10_4 = "attribute10_4";
    public static final String COLUMN_ATTRIBUTE10_5 = "attribute10_5";
    public static final String COLUMN_ATTRIBUTE10_6 = "attribute10_6";
    public static final String COLUMN_ATTRIBUTE11 = "attribute11";
    public static final String COLUMN_ATTRIBUTE12_1 = "attribute12_1";
    public static final String COLUMN_ATTRIBUTE12_2 = "attribute12_2";
    public static final String COLUMN_ATTRIBUTE12_3 = "attribute12_3";
    public static final String COLUMN_ATTRIBUTE12_4 = "attribute12_4";
    public static final String COLUMN_ATTRIBUTE12_5 = "attribute12_5";








    private static final String DATABASE_NAME = "prensesgiydirmece.db";
    private static final int DATABASE_VERSION = 1;

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table if not exists "
            + TABLE_SETTINGS + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_MUSIC
            + " text not null);";

    private static final String TABLE_CREATE_PRINCESS = "create table if not exists "
            + TABLE_PRINCESS +
            "(" +
            COLUMN_ID  +           "integer primary key autoincrement, " +
            COLUMN_NAME +          "text not null, " +
            COLUMN_ATTRIBUTE1 +    "integer not null, " +
            COLUMN_ATTRIBUTE2 +    "integer , " +
            COLUMN_ATTRIBUTE3 +    "integer , " +
            COLUMN_ATTRIBUTE4 +    "integer , " +
            COLUMN_ATTRIBUTE5 +    "integer , " +
            COLUMN_ATTRIBUTE6 +    "integer , " +
            COLUMN_ATTRIBUTE7 +    "integer , " +
            COLUMN_ATTRIBUTE8 +    "integer , " +
            COLUMN_ATTRIBUTE9 +    "integer , " +
            COLUMN_ATTRIBUTE10_1 + "integer , " +
            COLUMN_ATTRIBUTE10_2 + "integer , " +
            COLUMN_ATTRIBUTE10_3 + "integer , " +
            COLUMN_ATTRIBUTE10_4 + "integer , " +
            COLUMN_ATTRIBUTE10_5 + "integer , " +
            COLUMN_ATTRIBUTE10_6 + "integer , " +
            COLUMN_ATTRIBUTE11 +   "integer , " +
            COLUMN_ATTRIBUTE12_1 + "integer , " +
            COLUMN_ATTRIBUTE12_2 + "integer , " +
            COLUMN_ATTRIBUTE12_3 + "integer , " +
            COLUMN_ATTRIBUTE12_4 + "integer , " +
            COLUMN_ATTRIBUTE12_5 + "integer   " +
            ");";

    private static final String INSERT_SETTINGS = "  INSERT INTO settings(music) " +
            "SELECT '1' " +
            "WHERE NOT EXISTS(SELECT 1 FROM settings WHERE id = 1 ); " ;

    // get music state
    private static final String MUSIC_STATE = "select music from settings ORDER BY ROWID ASC LIMIT 1;";

    //update music on
    private static final String MUSIC_ON = "UPDATE settings " +
            "SET music = '1' " +
            "WHERE music = '0';";

    //update music off
    private static final String MUSIC_OFF = "UPDATE settings " +
            "SET music = '0' " +
            "WHERE music = '1';";

    public DataBase() {
        DatabaseOpen();

    }

    public void DatabaseOpen(){

        dbHandler = DatabaseFactory.getNewDatabase(DATABASE_NAME,
                DATABASE_VERSION, DATABASE_CREATE, null);

        dbHandler.setupDatabase();
        try {
            dbHandler.openOrCreateDatabase();
            dbHandler.execSQL(DATABASE_CREATE);
            dbHandler.execSQL(TABLE_CREATE_PRINCESS);
            System.out.println("-----------------------------------------database created");
        } catch (SQLiteGdxException e) {
            System.out.println("-----------------HAHTA");
            e.printStackTrace();
        }

        try {
            dbHandler.closeDatabase();
            System.out.println("database closed");
        } catch (SQLiteGdxException e) {
            e.printStackTrace();
        }
        dbHandler = null;

        Run_Sql_Code(INSERT_SETTINGS);




    }



    public void Run_Sql_Code(String code){
        dbHandler = DatabaseFactory.getNewDatabase(DATABASE_NAME,
                DATABASE_VERSION, DATABASE_CREATE, null);

        dbHandler.setupDatabase();
        try {
            dbHandler.openOrCreateDatabase();
            dbHandler.execSQL(code);
        } catch (SQLiteGdxException e) {
            e.printStackTrace();
            System.out.println("---------------------------_HATA---------------");
        }

        try {
            dbHandler.closeDatabase();
        } catch (SQLiteGdxException e) {
            e.printStackTrace();
        }
        dbHandler = null;
    }


    public void Add_Princess(String name,int a1,int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10_1,int a10_2,int a10_3, int a10_4,int a10_5, int a10_6, int a11, int a12_1, int a12_2, int a12_3, int a12_4, int a12_5){
        dbHandler = DatabaseFactory.getNewDatabase(DATABASE_NAME,
                DATABASE_VERSION, DATABASE_CREATE, null);

        dbHandler.setupDatabase();
        try {
            dbHandler.openOrCreateDatabase();
            dbHandler.execSQL("insert into ");
        } catch (SQLiteGdxException e) {
            e.printStackTrace();
            System.out.println("---------------------------_HATA---------------");
        }

        try {
            dbHandler.closeDatabase();
        } catch (SQLiteGdxException e) {
            e.printStackTrace();
        }
        dbHandler = null;
    }

    public String return_Sql(String text){
        dbHandler = DatabaseFactory.getNewDatabase(DATABASE_NAME,
                DATABASE_VERSION, DATABASE_CREATE, null);

        DatabaseCursor cursor = null;

        dbHandler.setupDatabase();
        try {
            dbHandler.openOrCreateDatabase();
            cursor = dbHandler.rawQuery(text);
        } catch (SQLiteGdxException e) {
            e.printStackTrace();
        }
        cursor.next();


        String result = String.valueOf(cursor.getString(0));

        try {
            dbHandler.closeDatabase();
        } catch (SQLiteGdxException e) {
            e.printStackTrace();
        }
        dbHandler = null;

        return result;
    }

    public boolean isMusicON(){
        String a = return_Sql(MUSIC_STATE);
        System.out.println("'"+a+"'");
        if (a.equals("1"))
        {

            return true;
        }
        else
        {

            return false;
        }

    }

    public void setMusicStateON(){
        Run_Sql_Code(MUSIC_ON);
    }

    public void setMusicStateOFF(){
        Run_Sql_Code(MUSIC_OFF);

    }

}