package com.example.lenovo.animalsounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PeternakanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peternakan);

        final MediaPlayer
                sheepSoundMP = MediaPlayer.create(this, R.raw.kambing),
                horseSoundMP = MediaPlayer.create(this, R.raw.kuda);

        Button
                playKambing = (Button) this.findViewById(R.id.btn_kambing),
                playKuda = (Button) this.findViewById(R.id.btn_kuda);


        playKambing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sheepSoundMP.start();
            }
        });

        playKuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horseSoundMP.start();
            }
        });
    }
}
