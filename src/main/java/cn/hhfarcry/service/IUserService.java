package cn.hhfarcry.service;


import cn.hhfarcry.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * @program: springbootmybatis
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-08 13:16
 */
public interface IUserService {
    int insertUser(Map<String, String> param);
    List<UserEntity> getlist(Map<String, String> param);

}
