package com.austin.bdg.deploy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.austin.bdg.deploy.authentication.model.BaseUser;
import com.austin.bdg.deploy.authentication.service.UserManagerService;

/**
 * 根路由
 *
 * @author austin
 * @since 2018/10/19 17:17
 */
@RequestMapping("/")
@RestController
public class IndexController {

    @Autowired
    private UserManagerService userManagerService;

    @GetMapping(value = "/")
    public String index() {
        return "Hello";
    }

    @GetMapping("/detail")
    public Object userInfo(@RequestParam String username) {
        BaseUser baseUser = userManagerService.getUserInfo(username);
        return baseUser;
    }
}
