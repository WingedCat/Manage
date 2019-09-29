package edu.xpu.hcp.manage.controller;
import edu.xpu.hcp.manage.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sysuser/")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("findall")
    public Object findAll(){
        return sysUserService.findAll();
    }

}
