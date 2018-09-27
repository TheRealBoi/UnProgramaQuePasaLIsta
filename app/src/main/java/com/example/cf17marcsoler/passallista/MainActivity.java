package com.example.cf17marcsoler.passallista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int modul;
    String parseString;
    Horario horario = new Horario(6877);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hora = findViewById(R.id.textView);
        TextView hores = findViewById(R.id.Hores);
        EditText introduirHores = findViewById(R.id.editText);




        for(int i = 0; i < horario.horas.length; i++ ){
            introduirHores.setText("Hora", TextView.BufferType.EDITABLE);
            parseString = introduirHores.getText().toString();
            horario.guardarHora(i, modul);
        }
        hora.setText(horario.toString());
        String TAG = "HORA";
        Log.i(TAG, horario.toString());
    }
}
