package cn.hhfarcry.service.impl;


import cn.hhfarcry.dao.UserDao;
import cn.hhfarcry.entity.UserEntity;
import cn.hhfarcry.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @program: springbootmybatis
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-08 13:16
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public int insertUser(Map<String, String> param) {
        return userDao.insertUser(param);
    }

    @Override
    public List<UserEntity> getlist(Map<String, String> param) {
        return userDao.getlist(param);
    }
}
