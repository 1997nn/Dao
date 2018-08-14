package com.example.administrator.dao.gen;

import com.example.administrator.dao.Daobeans;
import com.example.administrator.dao.MyApp;

import java.util.List;

/**
 * Created by Administrator on 2018/8/13.
 */

public class DabaseHelper {
    public static DabaseHelper dabaseHelper;
    private final DaobeansDao studentDao;

    private DabaseHelper() {
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(MyApp.getInstance(), "liangxq.db");
        DaoMaster daoMaster = new DaoMaster(openHelper.getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        studentDao = daoSession.getDaobeansDao();

    }

    public static DabaseHelper getInstance() {
        if (dabaseHelper == null) {
            synchronized (DabaseHelper.class) {
                if (dabaseHelper == null) {
                    dabaseHelper = new DabaseHelper();
                }
            }

        }

        return dabaseHelper;
    }

    /**
     * 插入方法
     * @param students
     */
    public void insertALL(List<Daobeans>students){
        studentDao.insertInTx(students);

    }

    /**
     * 查询
     * @return
     */
    public List<Daobeans>  selectAll(){
        return studentDao.queryBuilder().list();
    }


}
