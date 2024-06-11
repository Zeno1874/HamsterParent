package com.zeno.parent.controller;

import com.zeno.parent.vo.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hamster")
@Slf4j
public class HamsterController {
    @GetMapping("test")
    public R<String> test(){
        return R.ok("接口返回成功");
    }
}
