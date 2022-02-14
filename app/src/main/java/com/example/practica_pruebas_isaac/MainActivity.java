package com.example.practica_pruebas_isaac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author Isaac Gallardo Herrera isaacgallardo@iesflorenciopintado.es
 * @version 1.0
 *
 * Clase MainActivity donde realizamos la función de los botones para que nos haga
 * las transformaciones de una unidad de medida a otra, comprobando posibles errores
 *
 *
 */
public class MainActivity extends AppCompatActivity {

    EditText Operador;
    Button buttonMillas, buttonKms, buttonC, buttonF;
    TextView textViewSolucion;

    /**
     * Clase que nos crea nuestro Activity_main con las funciones que queramos
     *
     * @param savedInstanceState Excatamente no se para que sirve esto pero lo comento
     */
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

        /**
         * Botón que nos pasa de Kilómetros a Millas, le pasamos un String
         * y nos devuelve el resultado en otro String
         */
        buttonMillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSolucion.setText(operaciones.kmsAm(Operador.getText().toString()));
            }
        });

        /**
         * Botón que nos pasa de Millas a Kilómetros, le pasamos un String
         * y nos devuelve el resultado en otro String
         */
        buttonKms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSolucion.setText(operaciones.mAKms(Operador.getText().toString()));
            }
        });

        /**
         * Botón que nos pasa de Grados Celsius a Farengeing, le pasamos un String
         * y nos devuelve el resultado en otro String
         */
        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSolucion.setText(operaciones.CaF(Operador.getText().toString()));
            }
        });

        /**
         * Botón que nos pasa de Farengeing a Grados Celsius, le pasamos un String
         * y nos devuelve el resultado en otro String
         */
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSolucion.setText(operaciones.FaC(Operador.getText().toString()));
            }
        });
    }
}