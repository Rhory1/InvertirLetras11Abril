package com.example.a11abril;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //atributos-variables
    private TextView txtResultado;
    private EditText etPalabra;
    private Button btnProcesar;

    private String palabra;

    //metodos - funciones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        //2222
        /*
        al configurar un boton para decirle que este pendiente al evento clicj de ese boton en pantalla
        con el uso del metodo .setOnClickListener()
        Lo que ese mètodo esta esperando como parametro o argunmento es una funcion que serà
        la funciòn click que activara las funciones a realizar cuando se presione el boton.
        CuANDO SE PASA UNA FUNCION COMO PARAMENTRO ESTAS GENERALMENTE SON CONOCIDAD COMO FUNCINES ANONIMAS
        la idea es que esa funcion ejecute su proceimiento a partir del metodo que la recibe como parametro.
         */

        //this: ambito o contexto de la misma clase.  busca la respuesta en la clase

        btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Este metodo onclick solo existe en el ambito del boton btnProcesar, lo que se haga a ca solo sirve para ese boton
                recibirInformacion();
                invertirPalabra();
            }
        });
    }

    private void invertirPalabra() {
        //Una manera directa de inveritr una cadena
        //Netamente codigo java
        // palabra = new StringBuilder(palabra).reverse().toString();
        // Invertir palabra paso a paso
        String invertido ="";
        // la idea es que traten la cadena string como si fuera un Array
        // donde cada letra esta en una posciion del array partiendo desde 0
        // para tal efecto los strings tiene un metodo que les permite devolver un caracter
        // de una posicion como si fuera un array
        // El metodo se llama charAt

        for (int i = this.palabra.length() - 1; i >= 0 ; i--) {
            invertido += this.palabra.charAt(i);


        }
        if(invertido.equals(palabra)) {
            txtResultado.setText("Es palindromo");
        }
        else {
            txtResultado.setText("No es palindromo");
        }
    }

    private void recibirInformacion() {
        palabra = etPalabra.getText().toString();
    }

    private void inicializarVistas() {
        txtResultado = findViewById(R.id.txtResultado);
        etPalabra = findViewById(R.id.etPalabra);
        etPalabra = findViewById(R.id.etPalabra);
        btnProcesar = findViewById(R.id.btnProcesar);
    }


}