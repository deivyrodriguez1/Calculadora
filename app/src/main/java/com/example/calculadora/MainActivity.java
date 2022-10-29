package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Crear los objetos que se enlazarán a los controles
    EditText numero1;
    EditText numero2;
    Button bSumar;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        bSumar = findViewById(R.id.bSumar);
    }

    public void sumar(View v){
        int x = Integer.parseInt(this.numero1.getText().toString());
        int y = Integer.parseInt(this.numero2.getText().toString());
        int suma = x+y;
        this.resultado.setText(String.valueOf(suma));
    }
}