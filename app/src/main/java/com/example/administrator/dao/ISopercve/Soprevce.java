package com.example.administrator.dao.ISopercve;

import android.app.Activity;

import com.example.administrator.dao.Daobeans;
import com.example.administrator.dao.MainActivity;
import com.example.administrator.dao.Mainmodule.ISoModyle;
import com.example.administrator.dao.Mainmodule.SoModule;

import org.greenrobot.greendao.annotation.Id;

import java.util.List;

/**
 * Created by Administrator on 2018/8/13.
 */

public class Soprevce implements IsoPresenter {
    private ISoModyle iSoModyle;
    private MainActivity mview;

    public Soprevce(ISoModyle iSoModyle, MainActivity mview) {
        this.iSoModyle = iSoModyle;
        this.mview = mview;
    }

    @Override
    public void getList() {
        if (iSoModyle != null) {
            iSoModyle.getList(new ISoModyle.CallBack() {
                @Override
                public void getdaolist(List<Daobeans> daobeans) {
                    mview.showList(daobeans);
                }
            });
        }
    }
}
