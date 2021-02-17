package com.example.lenovo.animalsounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HutanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hutan);

        final MediaPlayer
                lionSoundMP = MediaPlayer.create(this, R.raw.singa),
                elephantSoundMP = MediaPlayer.create(this, R.raw.gajah);

        Button
                playSinga = (Button) this.findViewById(R.id.btn_singa),
                playGajah = (Button) this.findViewById(R.id.btn_gajah);

        playSinga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lionSoundMP.start();
            }
        });

        playGajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elephantSoundMP.start();
            }
        });

    }
}
