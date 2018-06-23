package com.zw.oa.service;

import com.zw.oa.entity.User;

/**
* @Description: 用户业务接口
*/
public interface UserService {
    /**
    * @Description: 查找单个对象
    */
    User get(String id, String pass);
}
