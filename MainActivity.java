package com.example.alensh.layoutinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
 LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       LayoutInflater li = getLayoutInflater();
        View v =li.inflate(R.layout.sub_layout,null);


        ll= (LinearLayout) findViewById(R.id.linear);
        ll.addView(v);

    }
}
