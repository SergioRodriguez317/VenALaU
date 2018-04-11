package com.example.sergiorodriguez.venalau;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnRegistro;
    Button btnInicioSesion;
    Button btnEventos;
    Button btnDeportes;
    Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpActionBar();

        btnRegistro=(Button)findViewById(R.id.btnReservas);
        btnInicioSesion=(Button)findViewById(R.id.btnImplementos);
        btnEventos=(Button)findViewById(R.id.btnCursos);
        btnDeportes=(Button)findViewById(R.id.btnPiscina);
        btnAbout=(Button)findViewById(R.id.btnAbout);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,RegistroActivity.class);
                startActivity(intent);
            }
        });
        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,IniciarSesionActivity.class);
                startActivity(intent);
            }
        });
        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,EventosActivity.class);
                startActivity(intent);
            }
        });
       btnDeportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,DeportesHomeActivity.class);
                startActivity(intent);
            }
        });
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });
    }
    private void setUpActionBar(){
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

    }
}
