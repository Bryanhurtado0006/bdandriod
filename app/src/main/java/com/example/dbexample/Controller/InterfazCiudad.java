package com.example.dbexample.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dbexample.Modell.Ciudad;
import com.example.dbexample.Modell.ManagerDb;
import com.example.dbexample.R;

public class InterfazCiudad extends AppCompatActivity {
    EditText Cod_ciudda,IngresaCiudad_dep;
    Button btnGuardar111;
    ManagerDb managerDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ciudad);

        Cod_ciudda=findViewById(R.id.Cod_ciudda);
        IngresaCiudad_dep=findViewById(R.id.IngresaCiudad_dep);
        btnGuardar111=findViewById(R.id.btnGuardar111);



        btnGuardar111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int codigo_ciudad = Integer.parseInt(Cod_ciudda.getText().toString());

                String nom_ciudad= IngresaCiudad_dep.getText().toString();

                managerDb=new ManagerDb(InterfazCiudad.this);

                Ciudad ciudad= new Ciudad(codigo_ciudad,nom_ciudad);
                long resul =managerDb.inserData(ciudad);

                if(resul >0){
                    Toast.makeText(InterfazCiudad.this, "DATOS INSERTADOS SATISFACTORIAMENTE"+ resul, Toast.LENGTH_SHORT).show();
                    Cod_ciudda.setText(" ");
                    IngresaCiudad_dep.setText(" ");
                }
                else{

                    Toast.makeText(InterfazCiudad.this, "Datos no insertados ", Toast.LENGTH_SHORT).show();
                }



            }
        });



    }
}