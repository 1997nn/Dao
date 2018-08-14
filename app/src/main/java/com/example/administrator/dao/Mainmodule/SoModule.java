package com.example.administrator.dao.Mainmodule;

import com.example.administrator.dao.Daobeans;
import com.example.administrator.dao.gen.DabaseHelper;

import java.util.List;

/**
 * Created by Administrator on 2018/8/13.
 */

public class SoModule implements ISoModyle {
    @Override
    public void getList(CallBack callBack) {
        List<Daobeans> list = DabaseHelper.getInstance().selectAll();
        callBack.getdaolist(list);
    }
}
