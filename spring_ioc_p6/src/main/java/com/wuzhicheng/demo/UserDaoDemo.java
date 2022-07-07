package com.wuzhicheng.demo;

import com.wuzhicheng.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuzhicheng
 * @create 2022-07-07 17:07
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");//填配置文件中的id
        userDao.save();
    }
}
