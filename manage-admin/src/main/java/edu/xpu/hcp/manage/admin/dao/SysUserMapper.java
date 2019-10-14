package edu.xpu.hcp.manage.admin.dao;

import edu.xpu.hcp.manage.admin.model.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 查询全部
     *
     * @return
     */
    List<SysUser> findAll();

    /**
     * 分页chax
     */
    List<SysUser> findPage();
}