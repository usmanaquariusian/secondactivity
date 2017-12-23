package com.example.usmanahmed.secondactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    Animation obj;
    ImageView myimage;
    Button btn,btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myimage=(ImageView)findViewById(R.id.imageView);
        btn=(Button)findViewById(R.id.button);
        btn1=(Button)findViewById(R.id.button2);
        btn2=(Button)findViewById(R.id.button3);
        btn3=(Button)findViewById(R.id.button4);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation obj= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);
                myimage.startAnimation(obj);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation obj1= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomout);
                myimage.startAnimation(obj1);


            }
        });
        /*btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getAnimation().cancel();
                v.clearAnimation();


            }
        });*/
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation obj2= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotation);
                myimage.startAnimation(obj2);
                obj2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        myimage.startAnimation(obj2);

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });

    }
}
