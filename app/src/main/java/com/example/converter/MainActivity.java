package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
        private Button convert;
        private TextView result;
        private double dollars;
        private double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();



        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                result.setText(String.valueOf(ans));

            }
        });
    }

    private void setupUIViews()
    {
        convert=(Button)findViewById(R.id.btnconvert);
        result=(TextView)findViewById(R.id.tvdollars);
    }
    private void compute()
    {
        dollars=Double.parseDouble(result.getText().toString());
        ans=dollars*70.51;
    }
}
