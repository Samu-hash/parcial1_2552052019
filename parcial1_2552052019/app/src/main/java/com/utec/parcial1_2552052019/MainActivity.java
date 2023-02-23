package com.utec.parcial1_2552052019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText editUser, editPass;

    TextView viewResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editUser = findViewById(R.id.editUser);
        this.editPass = findViewById(R.id.editPass);
        this.viewResp = findViewById(R.id.viewResp);
    }

    public void iniciarSesion(View v){

        String u = this.editUser.getText().toString();
        String p = this.editPass.getText().toString();

        if(!u.isEmpty() && !p.isEmpty()){

            if(u.equals("parcialETps1") && p.equals("p4rC14l#tp$")){
                startActivity(new Intent(MainActivity.this, CalculadoraImc.class));
            }else{
                this.viewResp.setText("contraseña y usuario no son correctos");
            }
        }else {
            this.viewResp.setText("Debe llenar los campo de usuario y clave");
        }
    }
}