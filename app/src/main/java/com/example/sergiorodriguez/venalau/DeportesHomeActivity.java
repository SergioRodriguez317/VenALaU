package com.example.sergiorodriguez.venalau;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeportesHomeActivity extends AppCompatActivity {
    Button btnReservas;
    Button btnEstadoCuenta;
    Button btnImplementos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpActionBar();
        setContentView(R.layout.activity_deportes_home);

        btnReservas=(Button)findViewById(R.id.btnReservas);
        btnEstadoCuenta=(Button)findViewById(R.id.btnCuenta);
        btnImplementos=(Button)findViewById(R.id.btnImplementos);

        btnReservas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(DeportesHomeActivity.this,ReservasActivity.class);
                startActivity(intent);
            }
        });

        btnEstadoCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(DeportesHomeActivity.this,EstadoCuentaActivity.class);
                startActivity(intent);
            }
        });
        btnImplementos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(DeportesHomeActivity.this,ImplementosActivity.class);
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
