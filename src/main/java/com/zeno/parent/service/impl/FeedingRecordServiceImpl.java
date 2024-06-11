package com.zeno.parent.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeno.parent.domain.FeedingRecordDo;
import com.zeno.parent.service.FeedingRecordService;
import com.zeno.parent.mapper.FeedingRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author HBWT
* @description 针对表【TblFeedingRecord(喂养记录表)】的数据库操作Service实现
* @createDate 2024-06-11 16:46:26
*/
@Service
public class FeedingRecordServiceImpl extends ServiceImpl<FeedingRecordMapper, FeedingRecordDo>
    implements FeedingRecordService{

}




