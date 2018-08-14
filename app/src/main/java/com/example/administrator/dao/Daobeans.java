package com.example.administrator.dao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/8/13.
 */
@Entity
public class Daobeans {

    @Id(autoincrement = true)
    Long id;
    String url;
    @Generated(hash = 2091470786)
    public Daobeans(Long id, String url) {
        this.id = id;
        this.url = url;
    }
    @Generated(hash = 1593505020)
    public Daobeans() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
}
