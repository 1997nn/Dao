package com.example.administrator.dao;

import android.app.Application;
import android.content.Context;

import com.example.administrator.dao.gen.DabaseHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/8/13.
 */

public class MyApp extends Application {
    public static MyApp myApp;
    @Override
    public void onCreate() {
        super.onCreate();
        myApp=this;
        List<Daobeans> students=new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            students.add(new Daobeans(null,"liangxq  "));
        }
        DabaseHelper.getInstance().insertALL(students);
    }

    public static Context getInstance(){
        return myApp;
    }
}
