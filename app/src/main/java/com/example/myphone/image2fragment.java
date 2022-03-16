package com.example.myphone;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class image2fragment extends Fragment {
EditText editText,editText1;
Button button;

    public image2fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view1= inflater.inflate(R.layout.fragment_image2fragment, container, false);

        editText=view1.findViewById(R.id.editText);
        editText1=view1.findViewById(R.id.editText1);
        button=view1.findViewById(R.id.buttonS);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone=editText.getText().toString();
                String msg=editText1.getText().toString();
                Intent intent=new Intent(getActivity().getApplicationContext(),MainActivity.class);
                PendingIntent pendingIntent=PendingIntent.getActivity(getActivity().getApplicationContext(),0,intent,0);
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phone,null,msg,pendingIntent,null);
                Toast.makeText(getActivity(), "Sms Sucessfull", Toast.LENGTH_SHORT).show();


            }
        });

        return view1;
    }
}