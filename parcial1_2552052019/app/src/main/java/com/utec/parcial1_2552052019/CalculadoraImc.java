package com.utec.parcial1_2552052019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraImc extends AppCompatActivity {

    EditText editAltura, editPeso;
    TextView viewImc;
    Button btnImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_imc);

        this.editAltura = findViewById(R.id.editAltura);
        this.editPeso = findViewById(R.id.editPeso);
        this.viewImc = findViewById(R.id.viewImc);
        this.btnImc = findViewById(R.id.btnImc);
    }

    public void calcularIMC(View v){

        String resp ="";
        double altura =  Double.parseDouble(editAltura.getText().toString());
        double peso = Double.parseDouble(editPeso.getText().toString());

        double imc = (peso) /( (altura/100) * (altura / 100));

        if(imc < 10.5){
            resp ="Críticamente Bajo de Peso";
        }else if(imc < 15.9){
            resp ="Severamente Bajo de Peso";
        }else if(imc < 18.5){
            resp ="Bajo de Peso";
        }else if(imc < 25){
            resp = "Normal (peso saludable)";
        }else if(imc < 30){
            resp ="Sobrepeso";
        }else if(imc < 35){
            resp ="Obesidad Clase 1 - Moderadamente Obeso";
        }else if(imc < 35){
            resp ="Obesidad Clase 2 - Severamente Obeso";
        }else{
            resp ="Obesidad Clase 3 - Críticamente Obeso";
        }

        this.viewImc.setText(resp);
    }
}