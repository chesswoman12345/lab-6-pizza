package com.example.pizzaaarecipe.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaaarecipe.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lancerCompteur();
    }

    private void lancerCompteur() {
        Thread temporisateur = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent intention = new Intent(SplashActivity.this, ListPizzaActivity.class);
                startActivity(intention);
                finish();
            }
        });
        temporisateur.start();
    }
}