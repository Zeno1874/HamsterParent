package com.zeno.parent.mapper;

import com.zeno.parent.domain.UserDo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HBWT
* @description 针对表【TblUser(用户信息表)】的数据库操作Mapper
* @createDate 2024-06-11 16:46:26
* @Entity com.zeno.parent.domain.UserDo
*/
@Mapper
public interface UserMapper extends BaseMapper<UserDo> {

}




