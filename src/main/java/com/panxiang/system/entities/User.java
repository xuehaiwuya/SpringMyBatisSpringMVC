package com.panxiang.system.entities;

/**
 * @author panxiang
 * @date 2017-01-03.
 * @vertion 1.0
 */
public class User {
    private Long id; //主键
    private String name; //用户名
    private String pwd; //密码

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
