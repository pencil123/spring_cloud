package com.cn.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lyzhang
 * @since 2019/9/29 13:47
 */
@Controller
public class DemoController {
  @RequestMapping("say.html")
  public @ResponseBody String say() {
    return "hello world";
  }
}
