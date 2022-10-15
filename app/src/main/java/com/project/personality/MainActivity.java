package com.project.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTR, btnTL, btnBR;
    Button btnHealth, btnGo, btnFun, btnStudy, btnHelp, btnHappy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTR = findViewById(R.id.btnTR);
        btnTL = findViewById(R.id.btnTL);
        btnBR = findViewById(R.id.btnBR);
        btnHealth = findViewById((R.id.btnHealth));
        btnGo = findViewById(R.id.btnGo);
        btnFun = findViewById(R.id.btnFun);
        btnStudy = findViewById(R.id.btnStudy);
        btnHelp = findViewById(R.id.btnHelp);
        btnHappy = findViewById(R.id.btnHappy);

        btnTR.setOnClickListener(this);
        btnTL.setOnClickListener(this);
        btnBR.setOnClickListener(this);
        btnHealth.setOnClickListener(this);
        btnGo.setOnClickListener(this);
        btnFun.setOnClickListener(this);
        btnStudy.setOnClickListener(this);
        btnHelp.setOnClickListener(this);
        btnHappy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Animation crash = AnimationUtils.loadAnimation(this, R.anim.crash);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        switch (view.getId()) {
            case (R.id.btnTR):
                Toast.makeText(this, "Переходим в настройки", Toast.LENGTH_LONG).show();
                break;
            case (R.id.btnTL):
                Toast.makeText(this, "Переходим в статистику", Toast.LENGTH_LONG).show();
                break;
            case (R.id.btnBR):
                break;
            case (R.id.btnHealth):
                if(btnHealth.getTag().toString().equals("off")) {
                    btnHealth.setBackgroundResource(R.drawable.btn_rectangle_final);
                    btnHealth.setTag("on");
                    btnHealth.startAnimation(rotate);
                } else {
                    btnHealth.setBackgroundResource(R.drawable.btn_rectangle_base);
                    btnHealth.setTag("off");
                }
                break;
            case (R.id.btnGo):
                if(btnGo.getTag().toString().equals("off")) {
                    btnGo.setBackgroundResource(R.drawable.btn_rectangle_final);
                    btnGo.setTag("on");
                    btnGo.startAnimation(crash);
                } else {
                    btnGo.setBackgroundResource(R.drawable.btn_rectangle_base);
                    btnGo.setTag("off");
                }
                break;
            case (R.id.btnFun):
                if(btnFun.getTag().toString().equals("off")) {
                    btnFun.setBackgroundResource(R.drawable.btn_rectangle_final);
                    btnFun.setTag("on");
                    btnFun.startAnimation(rotate);
                } else {
                    btnFun.setBackgroundResource(R.drawable.btn_rectangle_base);
                    btnFun.setTag("off");
                }
                break;
            case (R.id.btnStudy):
                if(btnStudy.getTag().toString().equals("off")) {
                    btnStudy.setBackgroundResource(R.drawable.btn_rectangle_final);
                    btnStudy.setTag("on");
                    btnStudy.startAnimation(rotate);
                } else {
                    btnStudy.setBackgroundResource(R.drawable.btn_rectangle_base);
                    btnStudy.setTag("off");
                }
                break;
            case (R.id.btnHelp):
                if(btnHelp.getTag().toString().equals("off")) {
                    btnHelp.setBackgroundResource(R.drawable.btn_rectangle_final);
                    btnHelp.setTag("on");
                    btnHelp.startAnimation(rotate);
                } else {
                    btnHelp.setBackgroundResource(R.drawable.btn_rectangle_base);
                    btnHelp.setTag("off");
                }
                break;
            case (R.id.btnHappy):
                if(btnHappy.getTag().toString().equals("off")) {
                    btnHappy.setBackgroundResource(R.drawable.btn_rectangle_final);
                    btnHappy.setTag("on");
                    btnHappy.startAnimation(rotate);
                } else {
                    btnHappy.setBackgroundResource(R.drawable.btn_rectangle_base);
                    btnHappy.setTag("off");
                }
                break;
        }
    }
}