package com.mr.pcw.anonymous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class WriteActivity extends AppCompatActivity {
    EditText et_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        et_write= findViewById(R.id.et_write);

    }

    public void clickPosting(View view) {
    }

    public void clickHashtag(View view) {
    }

    public void clickCancel(View view) {
        finish();
    }
}
