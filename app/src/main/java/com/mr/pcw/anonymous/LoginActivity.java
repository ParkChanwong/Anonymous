package com.mr.pcw.anonymous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void clickAnonymous(View view) {
        Intent intent= new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void clickGearing(View view) {
    }
}
