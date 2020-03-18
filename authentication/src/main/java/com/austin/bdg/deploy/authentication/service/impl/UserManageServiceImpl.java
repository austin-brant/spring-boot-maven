package com.austin.bdg.deploy.authentication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.austin.bdg.deploy.authentication.model.BaseUser;
import com.austin.bdg.deploy.authentication.service.UserManagerService;

/**
 * 用户信息查询服务实现
 *
 * @author austin
 * @since 2018/10/22 15:50
 */
@Service
public class UserManageServiceImpl implements UserManagerService {

    /**
     * 根据前缀查询用户详情列表
     *
     * @param username 用户名
     */
    @Override
    public List<BaseUser> getUserInfosByPrefix(String username) {
        return null;
    }

    /**
     * 根据前缀查询用户名列表
     *
     * @param username 用户名
     */
    @Override
    public List<String> getUsernamesByPrefix(String username) {
        return null;
    }

    /**
     * 查询用户详情
     *
     * @param username 用户名
     */
    @Override
    public BaseUser getUserInfo(String username) {
        BaseUser user = new BaseUser();
        user.setUsername("austin");
        user.setChineseName("austin");
        user.setDepartment("China");
        user.setEmail("austin@baidu.com");
        return user;
    }
}
