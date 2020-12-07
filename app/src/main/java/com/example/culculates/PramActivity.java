package com.example.culculates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PramActivity extends AppCompatActivity implements View.OnClickListener {
private float num1, num2;
private TextView p, s;
private EditText etNum1, etNum2;
private Button btnCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pram);

        Awake();

        btnCount.setOnClickListener(this);
        getSupportActionBar().setTitle("Прямоугольник");
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        if(v.getId() == R.id.btnCount){
            p.setText(toString().valueOf(num1 + num2 + num1 + num2) + "(см)");
            s.setText(toString().valueOf(num1 * num2) + "(см в квадрате)");
        }
    }

    private void Awake(){
        etNum1 = findViewById(R.id.height);
        etNum2 = findViewById(R.id.width);
        btnCount = findViewById(R.id.btnCount);

        p = findViewById(R.id.p);
        s = findViewById(R.id.s);
    }
}