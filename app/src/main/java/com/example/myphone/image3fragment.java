package com.example.myphone;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class image3fragment extends Fragment {
EditText editText,editText1,editText2;
Button button;

    public image3fragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_image3fragment, container, false);

        editText=view.findViewById(R.id.editText);
        editText1=view.findViewById(R.id.editText1);
        editText2=view.findViewById(R.id.editText2);
        button=view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone=editText.getText().toString();
                String sub=editText1.getText().toString();
                String msg=editText2.getText().toString();
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{phone});
                intent.putExtra(Intent.EXTRA_SUBJECT,sub);
                intent.putExtra(Intent.EXTRA_TEXT,msg);
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Choose Email Client"));
            }
        });

        return view;
    }
}