package com.example.calculadora_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*ArrayList<String> cars = new ArrayList<String>();*/
    int ope1;
    int ope2;
    int resultado;
    String operation = "idle";
    boolean borrar_pantalla = false;
    boolean realizar_operacion = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView pantalla = findViewById((R.id.pantalla));
        final Button boton1 = findViewById(R.id.boton_1);
        final Button boton2 = findViewById(R.id.boton_2);
        final Button boton3 = findViewById(R.id.boton_3);
        final Button boton4 = findViewById(R.id.boton_4);
        final Button boton5 = findViewById(R.id.boton_5);
        final Button boton6 = findViewById(R.id.boton_6);
        final Button boton7 = findViewById(R.id.boton_7);
        final Button boton8 = findViewById(R.id.boton_8);
        final Button boton9 = findViewById(R.id.boton_9);
        final Button boton0 = findViewById(R.id.boton_0);
        final Button boton_igual = findViewById(R.id.boton_igual);
        final Button boton_suma = findViewById(R.id.boton_suma);
        final Button boton_resta = findViewById((R.id.boton_resta));

        boton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton1.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton1.getText().toString());
                }
            }
        });

        boton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (borrar_pantalla) {
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton2.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                } else {
                    pantalla.setText(pantalla.getText().toString() + boton2.getText().toString());
                }
            }
        });

        boton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton3.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton3.getText().toString());
                }
            }
        });

        boton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton4.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton4.getText().toString());
                }
            }
        });

        boton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton5.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton5.getText().toString());
                }
            }
        });

        boton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton6.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton6.getText().toString());
                }
            }
        });

        boton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton7.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton7.getText().toString());
                }
            }
        });

        boton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton8.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton8.getText().toString());
                }
            }
        });

        boton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton9.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton9.getText().toString());
                }
            }
        });

        boton0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(borrar_pantalla){
                    pantalla.setText("");
                    pantalla.setText(pantalla.getText().toString() + boton0.getText().toString());
                    ope1 = resultado;
                    borrar_pantalla = false;
                }
                else{
                    pantalla.setText(pantalla.getText().toString() + boton0.getText().toString());
                }
            }
        });

        boton_igual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                if(operation == "suma"){
                    if(!borrar_pantalla){
                        ope2 = Integer.parseInt(pantalla.getText().toString());
                        resultado = ope1+ope2;
                        pantalla.setText(Integer.toString(resultado));
                        operation = "idle";
                    }
                    else{
                        pantalla.setText(Integer.toString(resultado));
                    }
                }
                if(operation == "resta"){
                    if(!borrar_pantalla){
                        ope2 = Integer.parseInt(pantalla.getText().toString());
                        resultado = ope1-ope2;
                        pantalla.setText(Integer.toString(resultado));
                        operation = "idle";
                    }
                    else{
                        pantalla.setText(Integer.toString(resultado));
                    }
                }
                if(operation == "idle"){
                    pantalla.setText(Integer.toString(resultado));
                }
            }
        });

        boton_suma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (operation == "idle"){
                    operation = "suma";
                    ope1 = Integer.parseInt(pantalla.getText().toString());
                    pantalla.setText("");
                }
                else{
                    if (operation == "suma"){
                        ope2 = Integer.parseInt(pantalla.getText().toString());
                        resultado = ope1 + ope2;
                        pantalla.setText(Integer.toString(resultado));
                        borrar_pantalla = true;
                    }
                    else {
                        ope2 = Integer.parseInt(pantalla.getText().toString());
                        resultado = ope1 - ope2;
                        pantalla.setText(Integer.toString(resultado));
                        borrar_pantalla = true;
                        operation = "suma";
                    }
                }
            }
        });

        boton_resta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (operation == "idle"){
                    operation = "resta";
                    ope1 = Integer.parseInt(pantalla.getText().toString());
                    pantalla.setText("");
                }
                else {
                    if (operation == "resta"){
                        ope2 = Integer.parseInt(pantalla.getText().toString());
                        resultado = ope1 - ope2;
                        pantalla.setText(Integer.toString(resultado));
                        borrar_pantalla = true;
                    }
                    else {
                        ope2 = Integer.parseInt(pantalla.getText().toString());
                        resultado = ope1 + ope2;
                        pantalla.setText(Integer.toString(resultado));
                        borrar_pantalla = true;
                        operation = "resta";
                    }
                }
            }
        });
    }
}
