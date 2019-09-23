package edu.xpu.hcp.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*                                                                              ____________________
  _                _                                                            < 神兽护体，永无bug! >
 | |__  _   _  ___| |__   ___ _ __   __ _ _ __   ___ _ __   __ _                --------------------
 | '_ \| | | |/ __| '_ \ / _ \ '_ \ / _` | '_ \ / _ \ '_ \ / _` |                       \   ^__^
 | | | | |_| | (__| | | |  __/ | | | (_| | |_) |  __/ | | | (_| |                        \  (oo)\_______
 |_| |_|\__,_|\___|_| |_|\___|_| |_|\__, | .__/ \___|_| |_|\__, |                           (__)\       )\/\
                                    |___/|_|               |___/                                ||----w |
                                                                                                ||     ||
 */
/**
 * @author hcp
 * @version 1.0
 * @create 20:15 2019/9/23
 */

@RestController
public class HelloController {
    
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
