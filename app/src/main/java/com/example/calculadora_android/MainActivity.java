package com.example.calculadora_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    /*ArrayList<String> cars = new ArrayList<String>();*/
    double ope1;
    double ope2;
    double resultado;
    String operation = "idle";
    boolean borrar_pantalla = false;
    boolean iniciar_operacion = false;
    boolean inicio = false;
    DecimalFormat decimales = new DecimalFormat("#.000");

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
        final Button boton_resta = findViewById(R.id.boton_resta);
        final Button boton_producto = findViewById(R.id.boton_producto);
        final Button boton_borrar = findViewById(R.id.boton_borrar);
        final Button boton_division = findViewById(R.id.boton_division);
        final Button boton_punto = findViewById(R.id.boton_punto);
        final Button boton_seno = findViewById(R.id.boton_seno);
        final Button boton_coseno = findViewById(R.id.boton_coseno);
        final Button boton_tangente = findViewById(R.id.boton_tangente);


        boton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton1.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton1.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + boton1.getText().toString());
                    }
                }
            }
        });

        boton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton2.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton2.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + boton2.getText().toString());
                    }
                }
            }
        });

        boton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton3.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton3.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + boton3.getText().toString());
                    }
                }
            }
        });

        boton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton4.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton4.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + boton4.getText().toString());
                    }
                }
            }
        });

        boton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton5.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton5.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + boton5.getText().toString());
                    }
                }
            }
        });

        boton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton6.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton6.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + boton6.getText().toString());
                    }
                }
            }
        });

        boton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton7.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton7.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + boton7.getText().toString());
                    }
                }
            }
        });

        boton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton8.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton8.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + boton8.getText().toString());
                    }
                }
            }
        });

        boton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton9.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton9.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    } else {
                        pantalla.setText(pantalla.getText().toString() + boton9.getText().toString());
                    }
                }
            }
        });

        boton0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                inicio = true;

                if (iniciar_operacion) {
                    operation = "idle";
                    borrar_pantalla = false;
                    pantalla.setText(boton0.getText().toString());
                    iniciar_operacion = false;
                }
                else {
                    if (borrar_pantalla) {
                        pantalla.setText("");
                        pantalla.setText(pantalla.getText().toString() + boton0.getText().toString());
                        ope1 = resultado;
                        borrar_pantalla = false;
                    }
                    else {
                        pantalla.setText(pantalla.getText().toString() + boton0.getText().toString());
                    }
                }
            }
        });

        boton_seno.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else{
                    if(operation=="idle"){
                        //cogemos el valor en la pantalla y hacemos el seno
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Hacemos seno",
                                Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        toast1.show();
                    }
                    else    {
                        Toast toast1 = Toast.makeText(getApplicationContext(), "No hacemos seno",
                                Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        toast1.show();
                    }
                }
            }
        });

        boton_coseno.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else{
                    if(operation=="idle"){
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Hacemos coseno",
                                Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        toast1.show();
                    }
                    else    {
                        Toast toast1 = Toast.makeText(getApplicationContext(), "No hacemos coseno",
                                Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        toast1.show();
                    }
                }
            }
        });

        boton_tangente.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else{
                    if(operation=="idle"){
                        //cogemos el valor en la pantalla y hacemos el seno
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Hacemos tangente",
                                Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        toast1.show();
                    }
                    else    {
                        Toast toast1 = Toast.makeText(getApplicationContext(), "No hacemos tangente",
                                Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                        toast1.show();
                    }
                }
            }
        });

        boton_punto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){

                    pantalla.setText("0.");
                }
                else {

                    if (iniciar_operacion) {
                        operation = "idle";
                        borrar_pantalla = false;
                        pantalla.setText("0.");
                        iniciar_operacion = false;
                    } else {
                        if (borrar_pantalla) {
                            pantalla.setText("");
                            pantalla.setText("0,");
                            ope1 = resultado;
                            borrar_pantalla = false;
                        } else {
                            pantalla.setText(pantalla.getText().toString() + ".");
                        }
                    }
                }
            }
        });

        boton_borrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operation = "idle";
                borrar_pantalla = false;
                iniciar_operacion = false;
                pantalla.setText("");
            }
        });



        boton_igual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else {

                    iniciar_operacion = true;

                    if (operation == "suma") {
                        if (!borrar_pantalla) {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(Double.toString(resultado));
                            operation = "idle";
                        } else {
                            pantalla.setText(Double.toString(resultado));
                        }
                    } else if (operation == "producto") {
                        if (!borrar_pantalla) {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(Double.toString(resultado));
                            operation = "idle";
                        } else {
                            pantalla.setText(Double.toString(resultado));
                        }
                    } else if (operation == "resta") {
                        if (!borrar_pantalla) {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(Double.toString(resultado));
                            operation = "idle";
                        } else {
                            pantalla.setText(Double.toString(resultado));
                        }
                    } else if (operation == "division") {
                        if (!borrar_pantalla) {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(Double.toString(resultado));
                            operation = "idle";
                        } else {
                            pantalla.setText(Double.toString(resultado));
                        }
                    } else {
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros o ya has realizado una operacion. Realiza otra operacion para continuar",
                                Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast1.show();
                    }
                }
            }
        });

        boton_suma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = false;

                    if (operation == "idle") {
                        operation = "suma";
                        ope1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("");
                    } else {
                        if (operation == "resta") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "suma";
                        } else if (operation == "producto") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "suma";
                        } else if (operation == "division") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "suma";
                        } else {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                        }
                    }
                }
            }
        });

        boton_resta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = false;

                    if (operation == "idle") {
                        operation = "resta";
                        ope1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("");
                    } else {
                        if (operation == "suma") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "resta";
                        } else if (operation == "producto") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "resta";
                        } else if (operation == "division") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "resta";
                        } else {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                        }
                    }
                }
            }
        });

        boton_producto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (pantalla.getText().toString() == null || pantalla.getText().toString() == "" || !inicio) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = false;

                    if (operation == "idle") {
                        operation = "producto";
                        ope1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("");
                    } else {
                        if (operation == "suma") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "producto";
                        } else if (operation == "resta") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "producto";
                        } else if (operation == "division") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "producto";
                        } else {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                        }
                    }
                }
            }
        });

        boton_division.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan parámetros",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                else {
                    iniciar_operacion = false;

                    if (operation == "idle") {
                        operation = "division";
                        ope1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("");
                    } else {
                        if (operation == "suma") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 + ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "division";
                        } else if (operation == "resta") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 - ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "division";
                        } else if (operation == "producto") {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 * ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                            operation = "division";
                        } else {
                            ope2 = Double.parseDouble(pantalla.getText().toString());
                            resultado = ope1 / ope2;
                            pantalla.setText(Double.toString(resultado));
                            borrar_pantalla = true;
                        }
                    }
                }
            }
        });
    }
}
