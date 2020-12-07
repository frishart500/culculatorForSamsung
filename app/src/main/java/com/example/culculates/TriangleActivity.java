package com.example.culculates;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TriangleActivity extends AppCompatActivity implements View.OnClickListener {
private EditText a, b, c;
private Button btnCount;
private TextView p, s;
private float num1, num2, num3, perimetr, halfPerimetr, sNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        Awake();

        btnCount.setOnClickListener(this);
        getSupportActionBar().setTitle("Треугольник");
    }
    private void Awake(){
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);

        btnCount = findViewById(R.id.btnCount);
        p = findViewById(R.id.p);
        s = findViewById(R.id.s);
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(a.getText().toString())
                || TextUtils.isEmpty(b.getText().toString())
                || TextUtils.isEmpty(c.getText().toString())){
            return;
        }

        num1 = Float.parseFloat(a.getText().toString());
        num2 = Float.parseFloat(b.getText().toString());
        num3 = Float.parseFloat(c.getText().toString());

        perimetr = num1 + num2 + num3;
        halfPerimetr = perimetr/2;
        sNum = (float) Math.sqrt(halfPerimetr * (halfPerimetr - num1) * (halfPerimetr - num2) * (halfPerimetr - num3));

        if(v.getId() == R.id.btnCount){
            p.setText(toString().valueOf(perimetr) + "(см)");
            s.setText(toString().valueOf(sNum) + "(см в квадрате)");
        }
    }
}