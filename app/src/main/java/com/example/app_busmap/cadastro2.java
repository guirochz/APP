package com.example.app_busmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cadastro2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);
    }

    public void abrindo_login(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}