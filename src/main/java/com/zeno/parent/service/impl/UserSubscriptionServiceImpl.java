package com.zeno.parent.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeno.parent.domain.UserSubscriptionDo;
import com.zeno.parent.service.UserSubscriptionService;
import com.zeno.parent.mapper.UserSubscriptionMapper;
import org.springframework.stereotype.Service;

/**
* @author HBWT
* @description 针对表【TblUserSubscription(用户订阅表)】的数据库操作Service实现
* @createDate 2024-06-11 16:46:26
*/
@Service
public class UserSubscriptionServiceImpl extends ServiceImpl<UserSubscriptionMapper, UserSubscriptionDo>
    implements UserSubscriptionService{

}




