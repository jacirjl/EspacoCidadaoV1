package com.example.jacirjlseae.espacocidadao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button botaoAtivos;
    private Button botaoSemECs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoAtivos = (Button) findViewById(R.id.Ativos);
        botaoAtivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Ativos.class));

            }
        });
        botaoSemECs = (Button) findViewById(R.id.SemECs);
        botaoSemECs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SemECs.class));
            }
        });
//Jacir
    }
}
