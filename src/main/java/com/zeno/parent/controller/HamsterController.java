package com.zeno.parent.controller;

import com.zeno.parent.common.response.R;
import com.zeno.parent.domain.HamsterDo;
import com.zeno.parent.service.HamsterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "仓鼠接口")
@RestController
@RequestMapping("api/hamster")
@Slf4j
public class HamsterController {
    @Resource
    private HamsterService hamsterService;

    @Operation(summary = "测试成功")
    @GetMapping("testSuccess")
    public R<String> testSuccess(){
        return R.ok("接口返回成功");
    }

    @Operation(summary = "测试失败")
    @GetMapping("testFail")
    public R<String> testFail(){
        return R.fail("接口返回失败");
    }

    @Operation(summary = "获取仓鼠列表")
    @PostMapping("getHamster")
    public R<List<HamsterDo>> getHamster(){
        List<HamsterDo> hamsters = hamsterService.getHamsterList();
        // TODO 数据额外处理
        return R.ok(hamsters);
    }
}
