package com.example.student.outpass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class TeacherMainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_main);
        lv=(ListView)findViewById(R.id.myList);
        MyAdapter adapter=new MyAdapter(this);
        lv.setAdapter(adapter);
    }


    public void Request(View view) {
        Intent req = new Intent(this,RequestsMainActivity.class);
        this.setVisible(false);
        startActivity(req);
    }
}
