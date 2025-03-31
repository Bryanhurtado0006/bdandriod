package com.example.dbexample.Controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dbexample.Modell.ManagerDb;
import com.example.dbexample.R;

public class MainActivity extends AppCompatActivity {
    ManagerDb managerDb;
    Button Ciudadesid,DatosID,RegistID;

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        managerDb = new ManagerDb(MainActivity.this);
        Ciudadesid=findViewById(R.id.Ciudadesid);
        DatosID=findViewById(R.id.DatosID);
        RegistID=findViewById(R.id.RegistID);

        Ciudadesid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir_a_ciudades = new Intent(MainActivity.this, InterfazCiudad.class);
                startActivity(ir_a_ciudades);
            }
        });
        DatosID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir_a_datos = new Intent(MainActivity.this, DatosPersonaciti.class);
                startActivity(ir_a_datos);
            }
        });
        RegistID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir_a_registra = new Intent(MainActivity.this,Registraduria.class);
                startActivity(ir_a_registra);
            }
        });








    }
}