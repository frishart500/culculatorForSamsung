package com.example.culculates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CvadratActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnCount;
private TextView p, s;
private float num;
private EditText etNum1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvadrat);

        Awake();

        btnCount.setOnClickListener(this);
        getSupportActionBar().setTitle("Квадрат");
    }

    private void Awake(){
        btnCount = findViewById(R.id.btnCount);
        p = findViewById(R.id.p);
        s = findViewById(R.id.s);
        etNum1 = findViewById(R.id.a);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCount){
            if (TextUtils.isEmpty(etNum1.getText().toString())) {
                return;
            }

            num = Float.parseFloat(etNum1.getText().toString());
            p.setText(toString().valueOf(num + num + num + num) + "(см)");
            s.setText(toString().valueOf(num * num) + "(см в квадрате)");
        }
    }
}