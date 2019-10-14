package edu.xpu.hcp.manage.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ____________________
 * _                _                                                           < 神兽护体，永无bug! >
 * | |__  _   _  ___| |__   ___ _ __   __ _ _ __   ___ _ __   __ _                --------------------
 * | '_ \| | | |/ __| '_ \ / _ \ '_ \ / _` | '_ \ / _ \ '_ \ / _` |                       \   ^__^
 * | | | | |_| | (__| | | |  __/ | | | (_| | |_) |  __/ | | | (_| |                        \  (oo)\_______
 * |_| |_|\__,_|\___|_| |_|\___|_| |_|\__, | .__/ \___|_| |_|\__, |                           (__)\       )\/\
 * |___/|_|                |___/                                ||----w |
 * ||     ||
 *
 * @author hcp
 * @version 1.0.0
 * @create 16:28 2019/10/14
 */

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "恭喜你！项目初始化成功了^_^";
    }
}
