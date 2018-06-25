package com.example.krish.checkboxcolour_change;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox checkBox = (CheckBox)findViewById(R.id.cb);
        final TextView textView = (TextView)findViewById(R.id.textView2);




        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                if(b==true)
                {
                    compoundButton.setBackgroundColor(Color.GREEN);
                    textView.setText("Checked ");

                }
                else{
                    compoundButton.setBackgroundColor(Color.WHITE);
                     textView.setText("unchecked ");
                }
            }
        });




    }


}
