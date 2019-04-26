package com.len.controller;

import com.len.service.GoodService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xu on 2019/4/25.
 */
@Controller
@RequestMapping("/good")
public class GoodController {

    @Autowired
    GoodService goodService;

    /**
     * 打开列表查询页面
     * @return
     */
    @GetMapping(value = "showGood")
    @RequiresPermissions("good:show")
    public String showGood(){
        return "/system/good/goodList";
    }



}
