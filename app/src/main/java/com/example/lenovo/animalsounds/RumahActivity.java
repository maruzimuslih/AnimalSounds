package com.example.lenovo.animalsounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RumahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah);

        final MediaPlayer
                catSoundMP = MediaPlayer.create(this, R.raw.kucing),
                dogSoundMP = MediaPlayer.create(this, R.raw.anjing);

        Button
                playKucing = (Button) this.findViewById(R.id.btn_kucing),
                playAnjing = (Button) this.findViewById(R.id.btn_anjing);

        playKucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catSoundMP.start();
            }
        });

        playAnjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogSoundMP.start();

            }
        });


    }
}
