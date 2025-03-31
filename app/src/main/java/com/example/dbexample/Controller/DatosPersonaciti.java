package com.example.dbexample.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dbexample.Modell.ManagerDb;
import com.example.dbexample.R;

public class DatosPersonaciti extends AppCompatActivity {
    EditText cod_dato,cod_citi,name_person,last_name_person;
    Button btnGuardar33;

    ManagerDb managerDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_datos);

        cod_dato =findViewById(R.id.cod_dato);
        cod_citi =findViewById(R.id.cod_citi);
        name_person =findViewById(R.id.name_person);
        last_name_person =findViewById(R.id.last_name_person);

        btnGuardar33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                managerDb=new ManagerDb(DatosPersonaciti.this);
            }
        });





    }
}