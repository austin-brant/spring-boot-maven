package com.austin.bdg.deploy.authentication.model;

import java.io.Serializable;
import java.util.Set;

import lombok.Data;

/**
 * 用户基本信息
 *
 * @author austin
 * @since 2018/10/22 15:44
 */
@Data
public class BaseUser implements Serializable {

    private static final long serialVersionUID = 2446937645913956659L;

    private String username;
    private String chineseName;
    private String email;
    private String phone;
    private String mobilePhone;
    private String department;
    private String extension;
    private Set<String> roles;
    private Set<String> groups;
    private Set<String> pdbIds;
}
