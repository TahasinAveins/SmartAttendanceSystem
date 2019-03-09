package com.example.smartcardattendancesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Report extends AppCompatActivity {

    private Button back_BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        back_BTN = (Button)findViewById(R.id.report_back);


        back_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Report.this,MainActivity.class));
            }
        });

    }
}
