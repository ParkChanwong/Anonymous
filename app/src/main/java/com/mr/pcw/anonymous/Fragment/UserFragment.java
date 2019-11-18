package com.mr.pcw.anonymous.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mr.pcw.anonymous.R;

public class UserFragment extends Fragment {
    EditText etNickName;
    TextView tvNickName;
    ImageView ivChangeNickname;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_user_fragment, container, false);

        final AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        final View v= getLayoutInflater().inflate(R.layout.dialog, null,false);
        etNickName= v.findViewById(R.id.et_nickName);
        tvNickName= v.findViewById(R.id.tv_nickName);
        ivChangeNickname= view.findViewById(R.id.iv_changeNickname);
        ivChangeNickname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            builder.setView(v);

            builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //tvNickName.setText(etNickName.getText().toString());
                    tvNickName.setText("AAA");
                }
            });

            builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });

            AlertDialog dialog= builder.create();
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();
                }
            });

        return view;
    }



    public void clickProfileImage(View view) {
    }

//    public void clickChangeNickName(View view) {
//        AlertDialog.Builder builder= new AlertDialog.Builder(getContext());
//        View v= getLayoutInflater().inflate(R.layout.dialog, null);
//        etNickName= v.findViewById(R.id.et_nickName);
//        tvNickName= v.findViewById(R.id.tv_nickName);
//        builder.setView(v);
//
//        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                tvNickName.setText(etNickName.getText().toString());
//            }
//        });
//
//        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//            }
//        });
//
//        AlertDialog dialog= builder.create();
//        dialog.setCanceledOnTouchOutside(false);
//        dialog.show();
//    }
}
