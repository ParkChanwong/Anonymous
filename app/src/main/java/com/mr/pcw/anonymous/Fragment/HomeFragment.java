package com.mr.pcw.anonymous.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mr.pcw.anonymous.R;
import com.mr.pcw.anonymous.WriteActivity;

public class HomeFragment extends Fragment {
    ImageView ivWrite;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.activity_home_fragment, container, false);
        ivWrite= view.findViewById(R.id.iv_write);
        ivWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(), WriteActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
