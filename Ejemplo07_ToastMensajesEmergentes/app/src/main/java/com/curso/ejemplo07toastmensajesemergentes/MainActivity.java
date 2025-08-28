package com.curso.ejemplo07toastmensajesemergentes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;  // Dependencia para los mensajes emergentes.

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 1- Buscar el control que corresponde al botón
        Button showToastButton = findViewById(R.id.showToastButton);

        // 2- Asignar una accióm para detecta el evento click y disparar el mensaje emergente
        showToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hola, soy una notificación emergente (Toast)", Toast.LENGTH_LONG).show();
            }
        });

        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        */
    }
}