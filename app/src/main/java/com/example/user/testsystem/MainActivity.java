package com.example.user.testsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements OnClickListene {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.buttonTest1);
        final Button button1 = (Button)findViewById(R.id.radioButtonTest1);
        final Button button2 = (Button)findViewById(R.id.radioButtonTest2);
        final Button button3 = (Button)findViewById(R.id.radioButtonTest3);

        //________________________________________________________
        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
        button3.setOnClickListener((View.OnClickListener) this);

        //_______________________________________________________
        button1 radionButtonTest1;
        radionButtonTest1 = new button (MainActivity.this, Qutions.class);
        startActivity(button1);



    }
}
