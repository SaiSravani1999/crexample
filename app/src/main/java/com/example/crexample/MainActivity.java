package com.example.crexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5;
    Button btn;
    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        et5=(EditText)findViewById(R.id.et5);
        btn=(Button) findViewById(R.id.b1);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= et1.getText().toString().trim();
                String phn=et2.getText().toString().trim();
                String add=et3.getText().toString().trim();
                String prb=et4.getText().toString().trim();
                String result= "name: "+ name+"\n"+"phn no: "+phn+"\n"+"address: "+add+"\n"+"problem: "+prb;
                tv1.setText(result);
                tv2.setText(tv1.getText().toString());
            }
        });
    }
    public void sendsms(View v)
    {
        SmsManager sManager=SmsManager.getDefault();
        sManager.sendTextMessage(et5.getText().toString(),et2.getText().toString() ,tv1.getText().toString(),null,null);
        Toast.makeText(MainActivity.this,"Message sent",Toast.LENGTH_LONG).show();

    }

}
