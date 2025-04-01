package com.example.dbexample.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dbexample.Modell.ManagerDb;
import com.example.dbexample.Modell.Regis;
import com.example.dbexample.R;

public class Registraduria extends AppCompatActivity {
    EditText cod_regist, documentt, date_nacimi, expedi;
    Button btnGuardar44;
    ManagerDb managerDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registraduria);

        cod_regist=findViewById(R.id.cod_regist);
        documentt=findViewById(R.id.documentt);
        date_nacimi=findViewById(R.id.date_nacimi);
        expedi=findViewById(R.id.expedi);
        btnGuardar44=findViewById(R.id.btnGuardar44);
        managerDb=new ManagerDb(Registraduria.this);

        btnGuardar44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cod_registtt = Integer.parseInt(cod_regist.getText().toString());
                int docuu = Integer.parseInt(documentt.getText().toString());
                String naciminto = (date_nacimi.getText().toString());
                String expedii = (expedi.getText().toString());

                Regis regis=new Regis(cod_registtt,docuu,naciminto,expedii);
                long resulRegist=managerDb.DatosRegist(regis);

                if(resulRegist >0){
                    Toast.makeText(Registraduria.this, "DATOS INSERTADOS SATISFACTORIAMENTE"+ resulRegist, Toast.LENGTH_SHORT).show();
                    cod_regist.setText(" ");
                    documentt.setText(" ");
                    date_nacimi.setText(" ");
                    expedi.setText(" ");
                }
                else{

                    Toast.makeText(Registraduria.this, "Datos no insertados ", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}