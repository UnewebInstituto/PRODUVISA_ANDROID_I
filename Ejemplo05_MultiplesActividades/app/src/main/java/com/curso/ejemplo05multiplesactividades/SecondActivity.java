package com.curso.ejemplo05multiplesactividades;

import android.os.Bundle;
import android.util.Log; // Importar la clase Log
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivityLifeCycle"; // Constante para el Logcat

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        Log.d(TAG, "onCreate() llamado."); // Mensaje en Logcat
        Button buttonGoToTerceraActividad = findViewById(R.id.buttonGoToTerceraActividad);
        Button buttonGotoMainActivity = findViewById(R.id.buttonGoToMainActivity);

        buttonGoToTerceraActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, TerceraActivity.class);
                startActivity(intent);
            }
        });

        buttonGotoMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra actividad y regresa a la anterior
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
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() llamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() llamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() llamado.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() llamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() llamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() llamado.");
    }

}