package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] images = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final ImageView shownImage = findViewById(R.id.shown_eight_ball);
        Button askButton = findViewById(R.id.ask_button);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MagicEightBall", "Ask button clicked.");

                Random rng = new Random();

                int number = rng.nextInt(5);

                shownImage.setImageResource(images[number]);
            }
        });
    }
}
