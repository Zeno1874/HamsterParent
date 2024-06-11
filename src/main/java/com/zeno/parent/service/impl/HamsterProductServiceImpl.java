package com.zeno.parent.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeno.parent.domain.HamsterProductDo;
import com.zeno.parent.service.HamsterProductService;
import com.zeno.parent.mapper.HamsterProductMapper;
import org.springframework.stereotype.Service;

/**
* @author HBWT
* @description 针对表【TblHamsterProduct(仓鼠用品表)】的数据库操作Service实现
* @createDate 2024-06-11 16:46:26
*/
@Service
public class HamsterProductServiceImpl extends ServiceImpl<HamsterProductMapper, HamsterProductDo>
    implements HamsterProductService{

}




