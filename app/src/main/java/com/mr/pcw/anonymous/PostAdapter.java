package com.mr.pcw.anonymous;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter {
    ArrayList<WriteVO> postDatas;
    Context context;

    public PostAdapter(ArrayList<WriteVO> postDatas, Context context) {
        this.postDatas = postDatas;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);

        View itemview= inflater.inflate(R.layout.post_item, parent, false);
        VH vh= new VH(itemview);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH)holder;

        WriteVO write= postDatas.get(position);

        vh.et_write.setText(write.Post);

    }

    @Override
    public int getItemCount() {
        return postDatas.size();
    }

    class VH extends RecyclerView.ViewHolder {
        EditText et_write;

        public VH(@NonNull View itemView) {
            super(itemView);

            et_write= itemView.findViewById(R.id.et_write);
        }
    }
}
