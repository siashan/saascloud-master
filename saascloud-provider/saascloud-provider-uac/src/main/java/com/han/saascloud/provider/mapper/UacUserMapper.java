package com.han.saascloud.provider.mapper;

import com.han.saascloud.core.mybatis.MyMapper;
import com.han.saascloud.provider.model.domain.UacUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UacUserMapper extends MyMapper<UacUser> {
    UacUser findByLoginName(String loginName);

    UacUser findUserInfoByUserId(Integer id);
}