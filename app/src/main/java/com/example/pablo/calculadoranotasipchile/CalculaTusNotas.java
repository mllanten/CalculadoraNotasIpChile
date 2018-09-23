package com.example.pablo.calculadoranotasipchile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculaTusNotas extends AppCompatActivity {

    Button Ingresar;
    Button Acerca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcula_tus_notas);

        Ingresar = (Button)findViewById(R.id.Ing);
        Acerca = (Button)findViewById(R.id.Acerca);

        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Ingresar = new Intent(CalculaTusNotas.this, Calculador.class);
                startActivity(Ingresar);

            }
        });

        Acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Acerca = new Intent(CalculaTusNotas.this, AcercaDe.class);
                startActivity(Acerca);
            }
        });

    }
}
