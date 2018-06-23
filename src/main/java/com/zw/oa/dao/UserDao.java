package com.zw.oa.dao;

import com.zw.oa.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @program: oa_ssm
 * @description: 用户Dao实现类
 * @author: zhang wei
 * @create: 2018-06-20 22:56
 **/
@Repository
public interface UserDao {
    /**
    * @Description: 获取单条数据
    */
    User get(String id);
}
