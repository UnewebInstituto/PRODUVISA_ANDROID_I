package com.curso.ejempl02contador;

import android.os.Bundle;
// ----------------------------------------
// 1- Inclusión de dependencias
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// ----------------------------------------

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // ------------------------------------------------------------
    // 2- Declaración de variables para la interface de usuario
    private TextView textViewContador;
    private Button buttonClickMe;
    private int contador = 0;
    // ------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // 3- Inicialización de variables con los recursos de la vista de diseño
        // Obtener los elementos de la interface de usuario en función de su
        // identificador Id
        textViewContador = findViewById(R.id.textViewContador);
        buttonClickMe = findViewById(R.id.buttonClickMe);

        // 4- Captura del evento click
        buttonClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cuando el botón se hace click, se incrementa el contador en 1
                contador++; // equivalente: contador = contandor + 1 o contador += 1;
                // Se actualiza el valor del contador en la vista de texto
                textViewContador.setText("Contador: " + contador);
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