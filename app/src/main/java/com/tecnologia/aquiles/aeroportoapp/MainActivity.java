package com.tecnologia.aquiles.aeroportoapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    ImageView image;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.minhaImagem);
        texto = findViewById(R.id.meuTexto);
        texto.setText("Toque para continuar.");
    }

    public void clicouTela(View view) {
        image.setScaleX(-1f);
    }
}
