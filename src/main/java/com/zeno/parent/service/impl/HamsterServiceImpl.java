package com.zeno.parent.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeno.parent.domain.HamsterDo;
import com.zeno.parent.service.HamsterService;
import com.zeno.parent.mapper.HamsterMapper;
import org.springframework.stereotype.Service;

/**
* @author HBWT
* @description 针对表【TblHamster(仓鼠信息表)】的数据库操作Service实现
* @createDate 2024-06-11 16:46:26
*/
@Service
public class HamsterServiceImpl extends ServiceImpl<HamsterMapper, HamsterDo>
    implements HamsterService{

}




