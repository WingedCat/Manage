package edu.xpu.hcp.manage.service.impl;

import edu.xpu.hcp.manage.dao.SysUserMapper;
import edu.xpu.hcp.manage.model.SysUser;
import edu.xpu.hcp.manage.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysUserService")
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
