package com.example.dbexample.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dbexample.Modell.Datos;
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
                int cod_datoo= Integer.parseInt(cod_dato.getText().toString());
                int codigo_city= Integer.parseInt(cod_citi.getText().toString());
                String nombre_person=(name_person.getText().toString());
                String apellio= (last_name_person.getText().toString());

                managerDb=new ManagerDb(DatosPersonaciti.this);

                Datos datos=new Datos(cod_datoo,codigo_city,nombre_person,apellio);
                long resull=managerDb.Inserdatados(datos);

                if(resull >0){
                    Toast.makeText(DatosPersonaciti.this, "DATOS INSERTADOS SATISFACTORIAMENTE"+ resull, Toast.LENGTH_SHORT).show();
                    cod_dato.setText(" ");
                    cod_citi.setText(" ");
                    name_person.setText(" ");
                    last_name_person.setText(" ");
                }
                else{

                    Toast.makeText(DatosPersonaciti.this, "Datos no insertados ", Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}