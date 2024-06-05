package com.dogukangunduz.a4ilemuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toplama(View view){
        Intent goToToplamaMenu = new Intent(this, MainActivity3.class );
        startActivity(goToToplamaMenu);
    }
    public void cikarma(View view){
        Intent goToCikarmaMenu = new Intent(this, MainActivity2.class );
        startActivity(goToCikarmaMenu);
    }
    public void bolme(View view){
        Intent goToBolmeMenu = new Intent(this, MainActivity5.class );
        startActivity(goToBolmeMenu);
    }
    public void carpma(View view){
        Intent goToCarpmaMenu = new Intent(this, MainActivity4.class );
        startActivity(goToCarpmaMenu);
    }
}