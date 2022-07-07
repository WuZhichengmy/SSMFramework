package com.wuzhicheng.dao.impl;

import com.wuzhicheng.dao.UserDao;

/**
 * @author wuzhicheng
 * @create 2022-07-07 17:03
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running");
    }
}
