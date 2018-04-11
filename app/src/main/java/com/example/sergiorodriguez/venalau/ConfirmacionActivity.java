package com.example.sergiorodriguez.venalau;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConfirmacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);
        setUpActionBar();

    }

    private void setUpActionBar(){
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

    }
    public void OnClickBotonConfirmacion(View v) {
        Intent intencion = new Intent(getApplicationContext(),ReservasActivity.class);
        startActivity(intencion);
    }

}
