package com.zeno.parent.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeno.parent.domain.UserDo;
import com.zeno.parent.service.UserService;
import com.zeno.parent.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author HBWT
* @description 针对表【TblUser(用户信息表)】的数据库操作Service实现
* @createDate 2024-06-11 16:46:26
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDo>
    implements UserService{

}




