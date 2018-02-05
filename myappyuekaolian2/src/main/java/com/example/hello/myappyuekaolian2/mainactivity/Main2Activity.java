package com.example.hello.myappyuekaolian2.mainactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.hello.myappyuekaolian2.R;
import com.example.hello.myappyuekaolian2.frment.Fragmenthome;
import com.example.hello.myappyuekaolian2.frment.Fragmenttext;
import com.example.hello.myappyuekaolian2.frment.Fragmentuser;

public class Main2Activity extends AppCompatActivity {
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);

        //默认显示
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmenthome()).commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmenthome()).commit();
                        break;
                    case R.id.rb2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmenttext()).commit();
                        break;
                    case R.id.rb3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmentuser()).commit();
                        break;

                    default:
                        break;
                }
            }
        });
    }


}
