package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout ll;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(LinearLayout)findViewById(R.id.ll);
        i1=(ImageView)findViewById(R.id.i1);
        ll.setOnClickListener(this);
        i1.setOnClickListener(this);
    }
     public void onClick(View v)
     {
         if(v.getId()==R.id.ll)
         {
             ll.setVisibility(View.GONE);
             i1.setVisibility(View.VISIBLE);

         }
         else {
             i1.setVisibility(View.GONE);
             ll.setVisibility(View.VISIBLE);

         }
     }

}
