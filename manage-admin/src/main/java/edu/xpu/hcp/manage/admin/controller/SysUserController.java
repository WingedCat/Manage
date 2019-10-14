package edu.xpu.hcp.manage.admin.controller;

import edu.xpu.hcp.manage.admin.service.ISysUserService;
import edu.xpu.hcp.manage.core.http.HttpResult;
import edu.xpu.hcp.manage.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysuser/")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("findall")
    public Object findAll() {
        return sysUserService.findAll();
    }

    @PostMapping("findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest){
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }

}
