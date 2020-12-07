package com.example.culculates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CrugActivity extends AppCompatActivity implements View.OnClickListener {
    private float r;
    private TextView p, s;
    private EditText etNum1;
    private Button btnCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crug);

        getSupportActionBar().setTitle("Круг");

        Awake();

        btnCount.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etNum1.getText().toString())){
            return;
        }

        r = Float.parseFloat(etNum1.getText().toString());

        if(v.getId() == R.id.btnCount){
            p.setText(toString().valueOf(r * 2 * 3.14f) + "(см)");
            s.setText(toString().valueOf(3.14f * Math.pow(r, 2)) + "(см в квадрате)");
        }
    }

    private void Awake(){
        etNum1 = findViewById(R.id.r);

        btnCount = findViewById(R.id.btnCount);
        p = findViewById(R.id.p);
        s = findViewById(R.id.s);
    }
}