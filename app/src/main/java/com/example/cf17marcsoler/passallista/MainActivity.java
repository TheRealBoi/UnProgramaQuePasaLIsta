package com.example.cf17marcsoler.passallista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int modul;
    String parseString;
    Dia horario = new Dia(6877);
    Spinner desplegable1hora;
    Spinner desplegable2hora;
    Spinner desplegable3hora;
    Spinner desplegable4hora;
    Spinner desplegable5hora;
    Spinner desplegable6hora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextView hora = findViewById(R.id.textView);
        TextView hores = findViewById(R.id.textView);


        EditText introduirHores = findViewById(R.id.editText);

        desplegable1hora = findViewById(R.id.desp1);
        desplegable2hora = findViewById(R.id.desp2);
        desplegable3hora = findViewById(R.id.desp3);
        desplegable4hora = findViewById(R.id.desp4);
        desplegable5hora = findViewById(R.id.desp5);
        desplegable6hora = findViewById(R.id.desp6);

        ArrayAdapter<CharSequence> desplegables= ArrayAdapter.createFromResource(
                this, R.array.Desplegable, android.R.layout.simple_spinner_dropdown_item);
        desplegables.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        desplegable1hora.setAdapter(desplegables);
        desplegable2hora.setAdapter(desplegables);
        desplegable3hora.setAdapter(desplegables);
        desplegable4hora.setAdapter(desplegables);
        desplegable5hora.setAdapter(desplegables);
        desplegable6hora.setAdapter(desplegables);


        for(int i = 0; i < horario.horas.length; i++ ){
            introduirHores.setText("Hora", TextView.BufferType.EDITABLE);
            parseString = introduirHores.getText().toString();
            horario.guardarHora(i, modul);
        }
        hores.setText(horario.toString());
        String TAG = "HORA";
        Log.i(TAG, horario.toString());
    }
}
