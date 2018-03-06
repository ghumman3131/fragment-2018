package com.inception.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void open_chat(View view) {


        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();

        ChatFragment chat_fragment = new ChatFragment();

        ft.replace(R.id.main_frame , chat_fragment );

        ft.commit();

    }

    public void open_status(View view) {

        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();

        StatusFragment status_fragment = new StatusFragment();

        ft.replace(R.id.main_frame , status_fragment );

        ft.commit();
    }

    public void open_call(View view) {
    }
}
