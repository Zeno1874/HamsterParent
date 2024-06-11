package com.zeno.parent.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeno.parent.domain.HamsterDo;
import com.zeno.parent.service.HamsterService;
import com.zeno.parent.mapper.HamsterMapper;
import jakarta.annotation.Resource;
import org.springframework.data.jdbc.core.convert.QueryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author HBWT
* @description 针对表【TblHamster(仓鼠信息表)】的数据库操作Service实现
* @createDate 2024-06-11 16:46:26
*/
@Service
public class HamsterServiceImpl extends ServiceImpl<HamsterMapper, HamsterDo>
    implements HamsterService{

    @Resource
    private HamsterMapper hamsterMapper;

    /**
     * 获取仓鼠列表
     *
     * @return List<HamsterDo> 仓鼠列表
     */
    @Override
    public List<HamsterDo> getHamsterList() {
        QueryWrapper<HamsterDo> wrapper = new QueryWrapper<>();
        return hamsterMapper.selectList(wrapper);
    }
}




