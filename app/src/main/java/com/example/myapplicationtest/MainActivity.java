package com.example.myapplicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {
    TextView textView1;//   生日显示控件
    DatePicker datePicker;//时间选择控件
    Button buttonReach;
    EditText editTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_view);

        //控件绑定
        datePicker = findViewById(R.id.dataPicker1);
        textView1 = findViewById(R.id.textView1);
        buttonReach=findViewById(R.id.button_reach);//确定查询按钮
        editTextName=findViewById(R.id.edit_name);


        LocalDate localDate = LocalDate.now();

        datePicker.init(localDate.getYear(),
                localDate.getMonthValue() - 1,
                localDate.getDayOfMonth(),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker datePicker,
                                              int year, int month, int dayOfMonth) {
                        textView1.setText(year + "年" +
                                (month + 1) + "月" +
                                dayOfMonth + "日");
                    }
                });

        buttonReach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断是否填写名字和生日
                if(textView1.getText().toString().equals("") || editTextName.getText().toString().equals("")){
                    Toast toast = Toast.makeText(MainActivity.this,"身份信息不能为空",Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    Intent i=new Intent(MainActivity.this,ZodiacActivity.class);
                    i.putExtra("name",editTextName.getText().toString());
                    i.putExtra("birthday",datePicker.getYear());
                    startActivity(i);
                }
            }
        });

    }
}