package com.example.temperaturechirp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDesc , tvAns;
    EditText etTemp;
    Button btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDesc = findViewById(R.id.tvDesc);
        tvAns = findViewById(R.id.tvAns);
        etTemp = findViewById(R.id.etTemp);
        btnSub= findViewById(R.id.btnSub);

       btnSub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String temp = etTemp.getText().toString();
               int tem = Integer.parseInt(temp);
               tem = tem/3 + 4;
               tvAns.setText("temperature is " + String.valueOf(tem) + " Celcius");
               /* int temp = Integer.parseInt(etTemp.getText().toString());
                tv.Ans.setText(tem/3+4);*/
           }
       });

    }
}
