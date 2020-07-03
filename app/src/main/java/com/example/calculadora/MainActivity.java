package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero ="";
    private double n1 = 0;
    private double n2 = 0;
    private String s;

    // Variables
    private TextView solucion;
    private Button keyPad0, keyPad1,keyPad2,keyPad3,keyPad4, keyPad5,keyPad6,keyPad7, keyPad8, keyPad9;
    private Button keyPadSum, keyPadSubstract, keyPadMultiply, keyPadDivision, keyPadClear, keyPadEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Bienvenido!!!", Toast.LENGTH_SHORT).show();


        solucion =  findViewById(R.id.ps);

        keyPad1 = findViewById(R.id.num_uno);
        keyPad2 = findViewById(R.id.num_dos);
        keyPad3 = findViewById(R.id.num_tres);
        keyPad4 = findViewById(R.id.num_cuatro);
        keyPad5 = findViewById(R.id.num_cinco);
        keyPad6 = findViewById(R.id.num_seis);
        keyPad7 = findViewById(R.id.num_siete);
        keyPad8 = findViewById(R.id.num_ocho);
        keyPad9 = findViewById(R.id.num_nueve);
        keyPad0 = findViewById(R.id.num_cero);




        keyPadSum = findViewById(R.id.suma);
        keyPadSubstract = findViewById(R.id.menos);
        keyPadMultiply = findViewById(R.id.num_x);
        keyPadDivision = findViewById(R.id.num_division);
        keyPadClear = findViewById(R.id.igual);
        keyPadEqual = findViewById(R.id.clear);
        //listener for button

        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);




        keyPadSum.setOnClickListener(this);
        keyPadSubstract.setOnClickListener(this);
        keyPadMultiply.setOnClickListener(this);
        keyPadDivision.setOnClickListener(this);
        keyPadClear.setOnClickListener(this);
        keyPadEqual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                solucion.setText(numero);
                break;

            case R.id.num_uno:
                numero = numero + "1";
                solucion.setText(numero );
                break;

            case R.id.num_dos:
                numero  = numero + "2";
                solucion.setText(numero);
                break;

            case R.id.num_tres:
                numero = numero + "3";
                solucion.setText(numero);
                break;

            case R.id.num_cuatro:
                numero = numero + "4";
                solucion.setText(numero);
                break;

            case R.id.num_cinco:
                numero = numero + "5";
                solucion.setText(numero);
                break;

            case R.id.num_seis:
                numero = numero + "6";
                solucion.setText(numero);
                break;

            case R.id.num_siete:
                numero = numero + "7";
                solucion.setText(numero);
                break;

            case R.id.num_ocho:
                numero = numero + "8";
                solucion.setText(numero);
                break;

            case R.id.num_nueve:
                numero = numero + "9";
                solucion.setText(numero);
                break;

            case R.id.suma:
                s = "+";
                n1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.menos:
                s = "-";
                n1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.num_division:
                s = "/";
                n1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.num_x:
                s = "X";
                n1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.clear:
                s = "";
                n1 = 0;
                n2 = 0;
                numero = "";
                solucion.setText("");
                break;

            case R.id.igual:
                n2 = Integer.parseInt(numero);

                switch (s){
                    case "+":
                        solucion.setText(" " + (n1 + n2));
                        break;
                    case "-":
                        solucion.setText(" " + (n1 - n2));
                        break;
                    case "/":
                        solucion.setText(" " + (n1 / n2));
                        break;
                    case "X":
                        solucion.setText(" " + (n1 * n2));
                        break;
                }

                n1 = 0;
                n2 = 0;
                numero = "";

                break;



        }
    }
}
