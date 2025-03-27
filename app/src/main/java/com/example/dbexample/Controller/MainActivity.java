package com.example.dbexample.Controller;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dbexample.Modell.BdHelper;
import com.example.dbexample.Modell.ManagerDb;
import com.example.dbexample.R;

public class MainActivity extends AppCompatActivity {
    ManagerDb managerDb;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        managerDb = new ManagerDb(MainActivity.this);


        long resul = managerDb.inserData();
        long resull = managerDb.Inserdatados();

        if (resul > 0) {
            Toast.makeText(this, "Datos insertados" + resul, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Datos no insertados" + resul, Toast.LENGTH_SHORT).show();
        }
        if (resull > 0) {
            Toast.makeText(this, "Datos insertados" + resull, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Datos no insertados" + resull, Toast.LENGTH_SHORT).show();
        }


    }
}