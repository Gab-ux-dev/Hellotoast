package com.example.skt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button zeroButton;
private Button countButton;
private int mCount=0;
private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.show_count);
        countButton= findViewById(R.id.button_count);
        zeroButton=findViewById(R.id.zero);
    }
    public void showToast(View view){
        Toast toast= Toast.makeText(this,"Hello TOO",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view){
        mCount++;
        if(mShowCount !=null){
            mShowCount.setText(String.format(Integer.toString(mCount)));
            zeroButton.setBackgroundColor(0xFF4EF329);
            if(mCount%2 !=1){
                view.setBackgroundColor(0xFF6200EE);
            }
            else{
                view.setBackgroundColor(Color.RED);
            }
        }
    }
public void setZero(View view){
        mCount=0;
        mShowCount.setText(String.format(Integer.toString(mCount)));
        view.setBackgroundColor(0xFF707070);
        countButton.setBackgroundColor(0xFF6200EE);
}
}