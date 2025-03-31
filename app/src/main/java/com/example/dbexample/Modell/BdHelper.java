package com.example.dbexample.Modell;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BdHelper extends SQLiteOpenHelper {
    public BdHelper(@Nullable Context context) {
        super(context, Constantes.NAME_DB, null, Constantes.NAME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Constantes.SENTENCIACIUDAD);
        sqLiteDatabase.execSQL(Constantes.SENTENCIASDATOS);
        sqLiteDatabase.execSQL(Constantes.SENTENCIAREGISTRADURIA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Ciudad");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS DATOS");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS REGISTRADURIA");
        onCreate(sqLiteDatabase);

    }
}
