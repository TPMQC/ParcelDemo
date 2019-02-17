package com.example.BundleDemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.BundleDemo.model.Reminder;

public class DetailActivity extends AppCompatActivity {
    private Reminder reminder;
    private TextView tv_note, time, priority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();
        //TODO extract object passed from the reminder adapter

        display();
    }

    private void init() {
        tv_note = findViewById(R.id.tv_note_content);
        time = findViewById(R.id.time_content);
        priority = findViewById(R.id.tv_priority_content);
    }

    private void display() {
        tv_note.setText(reminder.getTittle());
        time.setText(reminder.getTime());
        priority.setText(reminder.getPriority());
    }
}
