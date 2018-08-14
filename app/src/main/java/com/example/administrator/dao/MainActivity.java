package com.example.administrator.dao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.administrator.dao.ISopercve.Soprevce;
import com.example.administrator.dao.MainView.ISoView;
import com.example.administrator.dao.Mainmodule.SoModule;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ISoView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SoModule soModule = new SoModule();
        Soprevce soprevce = new Soprevce(soModule,this);
        soprevce.getList();
        setContentView(R.layout.activity_main);

    }

    @Override
    public void showList(List<Daobeans> daobeans) {
        Log.e("11111111111111111",daobeans.get(1).getUrl());
    }
}
