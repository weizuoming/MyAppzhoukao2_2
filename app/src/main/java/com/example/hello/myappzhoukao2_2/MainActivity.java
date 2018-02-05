package com.example.hello.myappzhoukao2_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radio_group);

        //默认显示
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new F1()).commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new F1()).commit();
                        break;
                    case R.id.rb2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragment6()).commit();
                        break;
                    case R.id.rb3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FragmentMarket()).commit();
                        break;
                    case R.id.rb4:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FragmentNotify()).commit();
                        break;
                    case R.id.rb5:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragment5()).commit();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
