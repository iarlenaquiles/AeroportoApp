package com.tecnologia.aquiles.aeroportoapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    ImageView image;
    TextView texto;
    Animation aparece;
    Animation some;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.minhaImagem);
        texto = findViewById(R.id.meuTexto);
        texto.setText("Toque para continuar.");
        aparece = new AlphaAnimation(0,1);
        some = new AlphaAnimation(1,0);

        some.setDuration(500);
        aparece.setDuration(500);
    }

    public void clicouTela(View view) {
        if(Math.random() < 0.5) {
            texto.setText("Siga para Esquerda");
            image.setScaleX(1f);
        } else {
            texto.setText("Siga para Direita");
            image.setScaleX(-1f);
        }
        image.startAnimation(some);
    }
}
