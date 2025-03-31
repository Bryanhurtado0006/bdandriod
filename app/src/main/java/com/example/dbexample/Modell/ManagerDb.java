package com.example.dbexample.Modell;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ManagerDb {
    BdHelper bdHelper;
    SQLiteDatabase db;

    public  ManagerDb(Context context){
        bdHelper=new BdHelper(context);
    }
    public void openDNWRITE(){
        db = bdHelper.getWritableDatabase();
    }
    public void openDbRd(){
        db=bdHelper.getReadableDatabase();
    }

    public long inserData(Ciudad ciudad){
        //abrir mi db en modo escritura
        openDNWRITE();
        //contenedor de valores
        ContentValues values = new ContentValues();

        values.put("cod",ciudad.getCod());
        values.put("nombre",ciudad.getName());

        long resul = db.insert("Ciudad",null,values);
        return resul;

    }
    public  long Inserdatados(Datos datos{
        openDNWRITE();
        ContentValues values= new ContentValues();
        values.put("cod",datos.getCod_dato());
        values.put("cod_CUIDAD",1);
        values.put("nombre","ABERLARDO");
        values.put("apellido","khalifa");
        long resull = db.insert("DATOS",null,values);
        return resull;
    }

    public  long DatosRegist(){
        openDNWRITE();
        ContentValues values=new ContentValues();
        values.put();
        values



        long resulRegist=db.insert("REGISTRADURIA",null,values);
        return resulRegist;



    }



}
