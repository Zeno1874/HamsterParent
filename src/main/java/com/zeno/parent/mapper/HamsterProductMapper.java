package com.zeno.parent.mapper;

import com.zeno.parent.domain.HamsterProductDo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HBWT
* @description 针对表【TblHamsterProduct(仓鼠用品表)】的数据库操作Mapper
* @createDate 2024-06-11 16:46:26
* @Entity com.zeno.parent.domain.HamsterProductDo
*/
@Mapper
public interface HamsterProductMapper extends BaseMapper<HamsterProductDo> {

}




