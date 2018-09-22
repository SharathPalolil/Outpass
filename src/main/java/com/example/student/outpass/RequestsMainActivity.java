package com.example.student.outpass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RequestsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests_main);
    }

    public void mainreq(View view) {
        Intent mreq = new Intent(this,mainRequestactivity.class);
        this.setVisible(false);
        startActivity(mreq);
    }
}
