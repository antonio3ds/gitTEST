package com.antonioesposito.it.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button mybutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mybutton = (Button) findViewById(R.id.mybutton);

      mybutton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Log.d("mybutton_setOnClickListener","Click");
          }
      });
       //  mybutton.setOnClickListener(new );
    }
}
