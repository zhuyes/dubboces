package com.dubbo.entity;

import java.io.Serializable;

/**
 * @author zhuyeshen
 * @version 1.0
 * @date 2020/5/23 9:29
 */
public class People implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1415852192397895853L;
    // 人员编号
    private int id;
    // 姓名
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People [id=" + id + ", name=" + name + "]";
    }

}

