package com.example.myphone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class image1fragment extends Fragment {

Button button;
EditText editText;
    public image1fragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_image1fragment, container, false);

        button=rootView.findViewById(R.id.buttonC);
        editText=rootView.findViewById(R.id.editTextC);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
                Intent intent =new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+s));
                startActivity(intent);
            }
        });
    return rootView;
    }
}