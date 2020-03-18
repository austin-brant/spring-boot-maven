package com.austin.bdg.deploy.authentication.service;

import java.util.List;

import com.austin.bdg.deploy.authentication.model.BaseUser;

/**
 * 用户信息管理服务接口
 *
 * @author austin
 * @since 2018/10/22 15:42
 */
public interface UserManagerService {
    /**
     * 根据前缀查询用户详情列表
     *
     * @param username 用户名
     */
    List<BaseUser> getUserInfosByPrefix(String username);

    /**
     * 根据前缀查询用户名列表
     *
     * @param username 用户名
     */
    List<String> getUsernamesByPrefix(String username);

    /**
     * 查询用户详情
     *
     * @param username 用户名
     */
    BaseUser getUserInfo(String username);
}
