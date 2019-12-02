package com.mr.pcw.anonymous;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class WriteActivity extends AppCompatActivity {
    EditText et_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        et_write= findViewById(R.id.et_write);

    }

    public void clickPosting(View view) {
        String Post= et_write.getText().toString();

        FirebaseDatabase firebaseDatabase= FirebaseDatabase.getInstance();
        DatabaseReference rootRef= firebaseDatabase.getReference();

        WriteVO Write= new WriteVO(Post);

        final DatabaseReference writeRef= rootRef.child("Posts");
        writeRef.push().setValue(Write);

        writeRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                StringBuffer buffer = new StringBuffer();
                for(DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    for(DataSnapshot ds : dataSnapshot.getChildren()) {
                        WriteVO write= snapshot.getValue(WriteVO.class);
                        buffer.append(write+"\n");
                    }
                    buffer.append("\n");
                }
                finish();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void clickHashtag(View view) {
    }

    public void clickCancel(View view) {
        finish();
    }
}
