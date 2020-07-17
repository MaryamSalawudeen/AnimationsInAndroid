package com.fragilecoder.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_helloWorld;
    private TextView txt_helloAnimate;

    private boolean ishelloWorldIsShowing;


    private ImageView imgLion, imgPeacock;

    private boolean isAnimalShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt_helloWorld = findViewById(R.id.txt_helloWorld);
        txt_helloAnimate = findViewById(R.id.txt_helloAnimate);

        imgLion = findViewById(R.id.imgLion);
        imgPeacock = findViewById(R.id.imgPeacock);

        txt_helloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Log.i("MyTag", "I love Mustie");

//                txt_helloWorld.animate().alpha(0).setDuration(3000);
//                txt_helloAnimate.animate().alpha(1).setDuration(3000);
                if (ishelloWorldIsShowing == true) {
                    txt_helloWorld.animate().alpha(0).setDuration(3000);
                    txt_helloAnimate.animate().alpha(1).setDuration(3000);
                    ishelloWorldIsShowing = false;
                }
                else if (!ishelloWorldIsShowing) {
                    txt_helloAnimate.animate().alpha(0).setDuration(3000);
                    txt_helloWorld.animate().alpha(1).setDuration(3000);
                    ishelloWorldIsShowing = true;
                }

            }
        });


        imgLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isAnimalShowing == true) {
                    imgLion.animate().alpha(0).setDuration(3000);
                    imgPeacock.animate().alpha(1).setDuration(3000);
                    isAnimalShowing = false;
                } else if (!isAnimalShowing) {
                    imgLion.animate().alpha(1).setDuration(3000);
                    imgPeacock.animate().alpha(0).setDuration(3000);
                    isAnimalShowing = true;
                }
            }
        });



    }
}
