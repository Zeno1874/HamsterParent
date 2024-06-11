package com.zeno.parent.mapper;

import com.zeno.parent.domain.UserSubscriptionDo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HBWT
* @description 针对表【TblUserSubscription(用户订阅表)】的数据库操作Mapper
* @createDate 2024-06-11 16:46:26
* @Entity com.zeno.parent.domain.UserSubscriptionDo
*/
@Mapper
public interface UserSubscriptionMapper extends BaseMapper<UserSubscriptionDo> {

}




