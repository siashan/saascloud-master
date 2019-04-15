package com.han.saascloud.provider.service.impl;

import com.han.saascloud.provider.mapper.UacUserMapper;
import com.han.saascloud.provider.model.domain.UacUser;
import com.han.saascloud.provider.service.UacUserService;
import com.han.saascloud.security.core.SecurityUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/4 14:34
 * @Modified By:
 */
@Service
public class UacUserServiceImpl implements UacUserService {

    @Resource
    private UacUserMapper uacUserMapper;

    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public UacUser findByLoginName(String loginName) {
        return uacUserMapper.findByLoginName(loginName);
    }

    @Override
    public void handlerLoginData(OAuth2AccessToken token, SecurityUser principal, HttpServletRequest request) {

    }

    @Override
    public UacUser findUserInfoByUserId(Integer id) {
        return uacUserMapper.findUserInfoByUserId(id);
    }

    @Override
    public Collection<GrantedAuthority> loadUserAuthorities(Integer id) {
        return null;
    }
}
