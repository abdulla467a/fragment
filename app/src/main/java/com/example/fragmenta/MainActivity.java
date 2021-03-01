package com.example.fragmenta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonFunction(View view) {
        Fragment myfragment;

        if (view.getId()==R.id.fragmentBDButton_id){
            myfragment=new bdFragment();

        }
        else{
            myfragment=new inFragment();
        }
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.myFragmentAreaID,myfragment);
        ft.commit();
    }
}