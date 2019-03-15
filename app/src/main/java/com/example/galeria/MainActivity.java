package com.example.galeria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Integer> lista = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista.add(R.drawable.a1);
        lista.add(R.drawable.a2);
        lista.add(R.drawable.a3);

        ImageView view1 = findViewById(R.id.img_1);
        ImageView view2 = findViewById(R.id.img_2);
        ImageView view3 = findViewById(R.id.img_3);
        ImageView view4 = findViewById(R.id.img_4);
        ImageView view5 = findViewById(R.id.img_5);
        ImageView view6 = findViewById(R.id.img_6);
        ImageView view7 = findViewById(R.id.img_7);
        ImageView view8 = findViewById(R.id.img_8);
        ImageView view9 = findViewById(R.id.img_9);
        ImageView view10 = findViewById(R.id.img_10);
        ImageView view11 = findViewById(R.id.img_11);
        ImageView view12 = findViewById(R.id.img_12);
        ImageView view13 = findViewById(R.id.img_13);
        ImageView view14 = findViewById(R.id.img_14);
        ImageView view15 = findViewById(R.id.img_15);

        view1.setOnClickListener(this);
        view2.setOnClickListener(this);
        view3.setOnClickListener(this);
        view4.setOnClickListener(this);
        view5.setOnClickListener(this);
        view6.setOnClickListener(this);
        view7.setOnClickListener(this);
        view8.setOnClickListener(this);
        view9.setOnClickListener(this);
        view10.setOnClickListener(this);
        view11.setOnClickListener(this);
        view12.setOnClickListener(this);
        view13.setOnClickListener(this);
        view14.setOnClickListener(this);
        view15.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ImageView imagen = findViewById(v.getId());
        int num = (int)(Math.random()*3);
        imagen.setImageResource(lista.get(num));
    }
}
