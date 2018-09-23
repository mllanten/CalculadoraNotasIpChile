package com.example.pablo.calculadoranotasipchile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculador extends AppCompatActivity {

    private EditText epr1;
    private EditText epe1;
    private EditText epr2;
    private EditText epe2;
    private EditText evas;
    private EditText examen;
    private TextView notaPres;
    private TextView notaFinal;
    private Button btnCalcula;

    //------------------------------------------ VARIABLES DE RESULTADO--------------------------------------------------//

    private Double repr1;
    private Double repe1;
    private Double repr2;
    private Double repe2;
    private Double revas;
    private Double rexamen;
    private Double resultado;
    private Double resultadoFinal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculador);



        epr1 = (EditText) findViewById(R.id.epr1);
        epe1 = (EditText) findViewById(R.id.epe1);
        epr2 = (EditText) findViewById(R.id.epr2);
        epe2 = (EditText) findViewById(R.id.epe2);
        evas = (EditText) findViewById(R.id.evas);
        notaPres = (TextView) findViewById(R.id.notaPres);
        notaFinal = (TextView) findViewById(R.id.notaFinal);
        examen = (EditText) findViewById(R.id.examen);
        btnCalcula = (Button) findViewById(R.id.btnCalcula);


        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double notaepr1 = Double.parseDouble(epr1.getText().toString());
                Double notaepe1 = Double.parseDouble(epe1.getText().toString());
                Double notaepr2 = Double.parseDouble(epr2.getText().toString());
                Double notaepe2 = Double.parseDouble(epe2.getText().toString());
                Double notaevas = Double.parseDouble(evas.getText().toString());
                Double notaexamen = Double.parseDouble(examen.getText().toString());

                repr1 = notaepr1 * 0.10;
                repe1 = notaepe1 * 0.15;
                repr2 = notaepr2 * 0.20;
                repe2 = notaepe2 * 0.25;
                revas = notaevas * 0.30;

                resultado = repr1 + repe1 + repr2 + repe2 + revas;

                rexamen = notaexamen * 0.30;

                resultadoFinal = (resultado * 0.70) + rexamen;

                notaPres.setText(Double.toString(resultado));
                notaFinal.setText(Double.toString(resultadoFinal));

            }
        });

    }
}
