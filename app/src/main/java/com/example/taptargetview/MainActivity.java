package com.example.taptargetview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetSequence;


public class MainActivity extends AppCompatActivity {


    Button btn1 , btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn0);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ppppppllllfafac", Toast.LENGTH_SHORT).show();
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "heeeeeelllllllllllloo", Toast.LENGTH_SHORT).show();
            }
        });


              new TapTargetSequence(this)
                .targets(
                        TapTarget.forView(findViewById(R.id.btn0), "Text" ,"Hello World"),
                        TapTarget.forView(findViewById(R.id.btn1), "Button1", "Click on button ang get money"),
                        TapTarget.forView(findViewById(R.id.btn2), "Button2","Fuck youu")
                                .drawShadow(true)
                                .tintTarget(false)
                                .transparentTarget(true)
                                .dimColor(android.R.color.background_dark)
                                .outerCircleColor(R.color.colorPrimaryDark)
                                .targetCircleColor(R.color.colorAccent)
                                .textColor(android.R.color.white)


                )
                .listener(new TapTargetSequence.Listener() {
                    // This listener will tell us when interesting(tm) events happen in regards
                    // to the sequence
                    @Override
                    public void onSequenceFinish() {
                        Toast.makeText(MainActivity.this, "Let Start ", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSequenceStep(TapTarget lastTarget, boolean targetClicked) {



                    }


                    @Override
                    public void onSequenceCanceled(TapTarget lastTarget) {

                    }
                }).start();

    }
}