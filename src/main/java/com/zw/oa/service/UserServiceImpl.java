package com.zw.oa.service;

import com.zw.oa.dao.UserDao;
import com.zw.oa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: oa_ssm
 * @description: 用户业务接口实现类
 * @author: zhang wei
 * @create: 2018-06-21 12:28
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * @Description: 查找单个对象
     */
    @Override
    public User get(String id, String pass) {
        User user = userDao.get(id);
        if (user == null) {
            // 用户名不存在
        }
        if (user.getPassword() != null && user.getPassword().equals(pass)) {
            // 登录成功
        }
        //登录失败
        return null;
    }
}
