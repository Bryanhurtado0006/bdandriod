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
    public  long Inserdatados(Datos datos){
        openDNWRITE();
        ContentValues values= new ContentValues();
        values.put("cod",datos.getCod_dato());
        values.put("cod_CUIDAD",datos.getCodigo_citi());
        values.put("nombre",datos.getNombre_persona());
        values.put("apellido",datos.getApellido_persona());
        long resull = db.insert("DATOS",null,values);
        return resull;
    }

    public  long DatosRegist(Regis regis){
        openDNWRITE();
        ContentValues values=new ContentValues();
        values.put("cod",regis.getCodi_regis());
        values.put("Documento",regis.getDocumenti());
        values.put("Fecha de nacimiento",regis.getFecha_naci());
        values.put("expedicion",regis.getExpedicion());
        long resulRegist=db.insert("REGISTRADURIA",null,values);
        return resulRegist;



    }



}
