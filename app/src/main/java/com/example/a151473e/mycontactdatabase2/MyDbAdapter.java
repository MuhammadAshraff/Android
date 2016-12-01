package com.example.a151473e.mycontactdatabase2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDbAdapter
{
    private static final String DATABASE_NAME = "test.db";
    private static final String DATABASE_TABLE = "myTestDb";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase _db;
    private final Context context;

    public static final String KEY_ID = "_id";
    public static final int COLUMN_KEY_ID = 0;
    public static final String ENTRY_NAME = "entry_name";
    public static final int COLUMN_NAME_ID = 1;
    public static final String ENTRY_TEL = "entry_telephone";
    public static final int COLUMN_TEL_ID = 2;

    protected static final String DATABASE_CREATE = "create table " + DATABASE_TABLE + " " + "(" + KEY_ID + " integer primary key autoincrement, " + ENTRY_NAME + " Text, "
            + ENTRY_TEL + " text not null);";

    private String MYDBADAPTER_LOG_CAT = "MY_LOG";

    private MyDBOpenHelper dbHelper;

    public MyDbAdapter(Context _context)
    {
        this.context = _context;

        //step 16 - create MyDBOpenHelper object




    }

    public void close()
    {
        //step 17 - close db

    }

    public void open() throws SQLiteException
    {
        //step 18 - open db


    }

    public long insertEntry(String entryName, String entryTel)
    {
        //step 19 - insert record into table

        return 0;
    }

    public boolean removeEntry(long _rowIndex)
    {
        //step 20 - remove record from table


        return true;

    }

    public boolean updateEntry(long _rowIndex, String entryName, String entryTel)
    {



        return false;
    }

    public Cursor retrieveAllEntriesCursor() {
        //step 21 - retrieve all records from table




        return null;
    }

    public class MyDBOpenHelper extends SQLiteOpenHelper
    {
        public MyDBOpenHelper(Context context, String name, CursorFactory factory, int version)
        {
            super(context, name, factory, version);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            // TODO Auto-generated method stub

            //step 14 - execute create sql statement



        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            // TODO Auto-generated method stub

        }

    } // End of myDBOpenHelper

}// End of myDBAdapter

