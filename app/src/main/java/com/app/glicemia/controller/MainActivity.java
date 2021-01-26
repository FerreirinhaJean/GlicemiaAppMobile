package com.app.glicemia.controller;

import android.os.Bundle;

import com.app.glicemia.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        addSlide(new SimpleSlide.Builder()
                .title("Titulo")
                .description("descricao")
                .image(R.drawable.ic_launcher_background)
                .background(android.R.color.background_dark)
                .build()
        );
    }
}
