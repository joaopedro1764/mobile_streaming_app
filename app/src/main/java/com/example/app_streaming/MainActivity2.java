package com.example.app_streaming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Certifique-se de que EdgeToEdge está configurado corretamente ou remova
        // EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main2);

        // Configurar botão para voltar à MainActivity
        Button botaoActivityMain2 = findViewById(R.id.button_conteudo);
        botaoActivityMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navega para MainActivity
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
