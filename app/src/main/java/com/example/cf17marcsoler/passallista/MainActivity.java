package com.example.cf17marcsoler.passallista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hora = findViewById(R.id.textView);
        EditText introduirHores = findViewById(R.id.editText);

    }
}
