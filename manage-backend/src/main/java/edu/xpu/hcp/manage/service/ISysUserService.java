package edu.xpu.hcp.manage.service;

import edu.xpu.hcp.manage.model.SysUser;

import java.util.List;

public interface ISysUserService {
    /**
     * 查找所有用户
     */
    List<SysUser> findAll();

}
