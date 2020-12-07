package com.example.culculates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private ImageView crug, cvadrat, pram, triangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Awake();

        crug.setOnClickListener(this);
        pram.setOnClickListener(this);
        cvadrat.setOnClickListener(this);
        triangle.setOnClickListener(this);

        getSupportActionBar().setTitle("Подсчет площали и периметра фигур");

    }

    private void Awake(){
        crug = findViewById(R.id.crug);
        cvadrat = findViewById(R.id.cvadrat);
        pram = findViewById(R.id.pram);
        triangle = findViewById(R.id.triangle);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.pram:
                Intent intent = new Intent(getApplicationContext(), PramActivity.class);
                startActivity(intent);
                break;
            case R.id.cvadrat:
                Intent intent1 = new Intent(getApplicationContext(), CvadratActivity.class);
                startActivity(intent1);
                break;

            case R.id.triangle:
                Intent intent2 = new Intent(getApplicationContext(), TriangleActivity.class);
                startActivity(intent2);
                break;

            case R.id.crug:
                Intent intent3 = new Intent(getApplicationContext(), CrugActivity.class);
                startActivity(intent3);
                break;
        }
    }
}