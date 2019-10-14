package edu.xpu.hcp.manage.admin.service;

import edu.xpu.hcp.manage.admin.model.SysUser;
import edu.xpu.hcp.manage.core.service.CurdService;

import java.util.List;

public interface ISysUserService extends CurdService<SysUser>{
    /**
     * 查找所有用户
     */
    List<SysUser> findAll();

}
