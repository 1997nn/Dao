package com.example.administrator.dao.Mainmodule;

import com.example.administrator.dao.Daobeans;

import java.util.List;

/**
 * Created by Administrator on 2018/8/13.
 */

public interface ISoModyle {
    void  getList(CallBack callBack);
    interface CallBack{
        void getdaolist(List<Daobeans> daobeans);
    }
}
