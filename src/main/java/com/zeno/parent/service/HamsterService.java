package com.zeno.parent.service;

import com.zeno.parent.domain.HamsterDo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author HBWT
* @description 针对表【TblHamster(仓鼠信息表)】的数据库操作Service
* @createDate 2024-06-11 16:46:26
*/
public interface HamsterService extends IService<HamsterDo> {
    /**
     * 获取仓鼠列表
     * @return List<HamsterDo> 仓鼠列表
     */

    List<HamsterDo> getHamsterList();
}
