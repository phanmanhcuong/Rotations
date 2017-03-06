package com.example.cuongphan.rotations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RorationsActivity extends AppCompatActivity {
    private String mStr = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotations);
    }

    public void getString(View view){
        EditText editText = (EditText) findViewById(R.id.et);
        mStr = editText.getText().toString();
        displayString(mStr);
    }

    private void displayString(String str){
        TextView textView = (TextView)findViewById(R.id.tv);
        textView.setText(str);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("string", mStr);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        mStr = savedInstanceState.getString("string");
        if(!mStr.isEmpty()){
            displayString(mStr);
        }
    }
}
