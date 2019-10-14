package edu.xpu.hcp.manage.admin.service.impl;

import edu.xpu.hcp.manage.admin.service.ISysUserService;
import edu.xpu.hcp.manage.admin.dao.SysUserMapper;
import edu.xpu.hcp.manage.admin.model.SysUser;
import edu.xpu.hcp.manage.core.page.MybatisPageHelper;
import edu.xpu.hcp.manage.core.page.PageRequest;
import edu.xpu.hcp.manage.core.page.PageResult;
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

    @Override
    public int save(SysUser record) {
        return 0;
    }

    @Override
    public int delete(SysUser record) {
        return 0;
    }

    @Override
    public int delete(List<SysUser> records) {
        return 0;
    }

    @Override
    public SysUser findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest,sysUserMapper);
    }
}
