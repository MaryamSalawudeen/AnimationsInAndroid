package com.fragilecoder.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_helloWorld;
    private TextView txt_helloAnimate;

    private boolean ishelloWorldIsShowing;

    private TextView txtAndroid;

    private Button btnAnimate;


    private ImageView imgLion, imgPeacock;

    private boolean isAnimalShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt_helloWorld = findViewById(R.id.txt_helloWorld);
        txt_helloAnimate = findViewById(R.id.txt_helloAnimate);
        txtAndroid = findViewById(R.id.txtAndroid);

        imgLion = findViewById(R.id.imgLion);
        imgPeacock = findViewById(R.id.imgPeacock);

        btnAnimate = findViewById(R.id.btnAnimate);

        txt_helloWorld.setX(2000);
        txt_helloAnimate.setX(-2000);
        txtAndroid.setY(-3000);

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
                    imgLion.animate().alpha(0).translationX(300).rotationY(2000).setDuration(3000);
                    imgPeacock.animate().alpha(1).translationX(-300).rotationY(2000).setDuration(3000);
                    isAnimalShowing = false;
                } else if (!isAnimalShowing) {
                    imgLion.animate().alpha(1).translationX(300).rotationY(2000).setDuration(3000);
                    imgPeacock.animate().alpha(0).translationX(-300).rotationY(2000).setDuration(3000);
                    isAnimalShowing = true;
                }
            }
        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                txtAndroid.animate().translationX(3000f).setDuration(2000);
//                txtAndroid.animate().translationY(3000).setDuration(3000);

//                txtAndroid.animate().translationXBy(200).setDuration(5000);
//
//                txtAndroid.animate().rotation(360).setDuration(5000);


//                txtAndroid.animate().rotationBy(360).setDuration(4000);

                txtAndroid.animate().rotationX(400).translationY(2000).setDuration(3000);
            }
        });

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_helloWorld.animate().translationXBy(-2000).rotation(2000).setDuration(3000);
                txt_helloAnimate.animate().translationXBy(2000).scaleX(200).setDuration(2000);
                txtAndroid.animate().translationYBy(3000).alpha(0.7f).setDuration(4000);
            }
        });

    }
}
