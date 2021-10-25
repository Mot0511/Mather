package com.matveysuvorov.mather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<result_sp> extends AppCompatActivity {

    TextView main_text;
    float c1 = 0;
    int d = 0;
    float result = 0;
    float result_sp = 0;
    Button btnActTwo;

    EditText first_vklad;
    EditText second_vklad;
    EditText percent;
    EditText srok;
    float mounth;
    float ft;
    float st;
    float p;
    float s;
    TextView result_sp_text;
    float sum;

    Switch sw;
    Switch sw2;

    boolean isSw1 = false;
    boolean isSw2 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_text = findViewById(R.id.main_text);

        first_vklad = findViewById(R.id.first_vklad);
        second_vklad = findViewById(R.id.second_vklad);
        percent = findViewById(R.id.percent);
        srok = findViewById(R.id.srok);
//        sw = (Switch) findViewById(R.id.switch1);
//        sw2 = (Switch) findViewById(R.id.switch2);
        result_sp_text = findViewById(R.id.result_sp);


//        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    isSw1 = true;
//                } else {
//                    isSw1 = false;
//                }
//            }
//        });
//
//        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    isSw2 = true;
//                } else {
//                    isSw2 = false;
//                }
//            }
//        });

    }

    public void get_percent(View view){
        result_sp = 0;
        ft = Float.parseFloat(String.valueOf(first_vklad.getText()));
        st = Float.parseFloat(String.valueOf(second_vklad.getText()));
        p = Float.parseFloat(String.valueOf(percent.getText()));
        s = Float.parseFloat(String.valueOf(srok.getText()));

        p /= 12;

        result_sp += ft;

        for (int i = 0; i < s; i++){
            result_sp = (result_sp + st) + ((result_sp + st) / 100 * p);
        }

        result_sp_text.setText(Float.toString(result_sp));

    }
//        p = p / 12;

//        for (int i = 0; i < s; i++){
//            if (i == 0){
//                result_sp = ft + (ft / 100 + p);
//            }
//            else{
//                result_sp = result_sp + st + ((result_sp + st) / 100 * p);
//            }
//        }
//
//
//        float delta;
//        if (isSw1){
//            mounth = s * 12;
//            delta = mounth / s;
//            result_sp = result_sp * delta;
//        }

    public void dot(View view){
        if (main_text.getText().toString() != "0"){
            main_text.setText(main_text.getText().toString() + ".");
        }

    }

    public void _result(View view){
        if (d == 1){
            result = c1 - Float.parseFloat(main_text.getText().toString());
            main_text.setText(Float.toString(result));
        }
        else if (d == 2){
            result = c1 + Float.parseFloat(main_text.getText().toString());
            main_text.setText(Float.toString(result));
        }
        else if (d == 3){
            result = c1 / Float.parseFloat(main_text.getText().toString());
            main_text.setText(Float.toString(result));
        }
        else if (d == 4){
            result = c1 * Float.parseFloat(main_text.getText().toString());
            main_text.setText(Float.toString(result));
        }
    }
    public void _plus(View view){
        c1 = Float.parseFloat(main_text.getText().toString());
        d = 2;
        main_text.setText("0");
    }
    public void _minus(View view){
        c1 = Float.parseFloat(main_text.getText().toString());
        d = 1;
        main_text.setText("0");
    }
    public void _split(View view){
        c1 = Float.parseFloat(main_text.getText().toString());
        d = 3;
        main_text.setText("0");
    }
    public void _mult(View view){
        c1 = Float.parseFloat(main_text.getText().toString());
        d = 4;
        main_text.setText("0");
    }
    public void reset(View view){
        main_text.setText("0");
        c1 = 0;
        d = 0;
    }
    public void _1(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "1");
    }
    public void _2(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "2");
    }
    public void _3(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "3");
    }
    public void _4(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "4");
    }
    public void _5(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "5");
    }
    public void _6(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "6");
    }
    public void _7(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "7");
    }
    public void _8(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "8");
    }
    public void _9(View view){
        if (main_text.getText().toString() == "0"){
            main_text.setText("");
        }
        main_text.setText(main_text.getText().toString() + "9");
    }
    public void _0(View view){
        if (main_text.getText().toString() != "0"){
            main_text.setText(main_text.getText().toString() + "0");
        }

    }


}