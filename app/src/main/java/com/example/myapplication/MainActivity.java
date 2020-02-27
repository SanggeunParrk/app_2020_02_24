package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements Fragment1.OnDataPass{
    private DatePickerDialog.OnDateSetListener callbackMethod;
    String mInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment1 fragment1 = new Fragment1();
        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment1).commit();
        Toast.makeText(getApplicationContext(),mInfo,Toast.LENGTH_LONG).show();

    }
    public void onDataPass(String info){
        mInfo = info;
    }

}
