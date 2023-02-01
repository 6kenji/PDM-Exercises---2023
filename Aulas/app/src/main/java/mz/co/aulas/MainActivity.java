package mz.co.aulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mz.co.aulas.Aulas.Aula1;
import mz.co.aulas.Aulas.Aula2;
import mz.co.aulas.Aulas.Aula3;
import mz.co.aulas.Aulas.Aula4_TPC;
import mz.co.aulas.Aulas.Aula5_ShareDataIntent;
import mz.co.aulas.Aulas.Aula6;
import mz.co.aulas.Aulas.Aula7_RecyclerView;

public class MainActivity extends AppCompatActivity {

    Button btnCambio, btnIMC, btnCalculadora, btnLayoutTest, btnBindingIntent, btnEventos, btnRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCambio = findViewById(R.id.btnAula1);
        btnIMC = findViewById(R.id.btnAula2);
        btnCalculadora = findViewById(R.id.btnAula3);
        btnLayoutTest = findViewById(R.id.btnTPClifecycle);
        btnBindingIntent = findViewById(R.id.btnAula5);
        btnEventos = findViewById(R.id.btnAula6);
        btnRecycler = findViewById(R.id.btnAula7);

        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Aula1.class);
                startActivity(intent);
            }
        });

        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Aula2.class);
                startActivity(intent);
            }
        });

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Aula3.class);
                startActivity(intent);
            }
        });

        btnLayoutTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Aula4_TPC.class);
                startActivity(intent);
            }
        });

        btnBindingIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Aula5_ShareDataIntent.class);
                startActivity(intent);
            }
        });

        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Aula6.class);
                startActivity(intent);
            }
        });

        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Aula7_RecyclerView.class);
                startActivity(intent);
            }
        });
    }
}