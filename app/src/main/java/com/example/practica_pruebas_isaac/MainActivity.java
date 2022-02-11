package com.example.practica_pruebas_isaac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Operador;
    Button buttonMillas, buttonKms, buttonC, buttonF;
    TextView textViewSolucion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Operador=findViewById(R.id.editTextOperador);
        buttonMillas=findViewById(R.id.buttonMillas);
        buttonKms=findViewById(R.id.buttonKms);
        buttonC=findViewById(R.id.buttonC);
        buttonF=findViewById(R.id.buttonF);
        textViewSolucion=findViewById(R.id.textViewResultado);

        Operaciones operaciones = new Operaciones();
        buttonMillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSolucion.setText(operaciones.kmsAm(Operador.getText().toString()));
            }
        });

        buttonKms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSolucion.setText(operaciones.mAKms(Operador.getText().toString()));
            }
        });

        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSolucion.setText(operaciones.CaF(Operador.getText().toString()));
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSolucion.setText(operaciones.FaC(Operador.getText().toString()));
            }
        });
    }
}