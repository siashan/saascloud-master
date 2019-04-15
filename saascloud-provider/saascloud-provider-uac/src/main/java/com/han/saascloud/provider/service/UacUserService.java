package com.han.saascloud.provider.service;

import com.han.saascloud.provider.model.domain.UacUser;
import com.han.saascloud.security.core.SecurityUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/4 14:34
 * @Modified By:
 */
public interface UacUserService {
    /**
     * 根据登录名查询用户信息
     *
     * @param loginName the login name
     *
     * @return the uac user
     */
    UacUser findByLoginName(String loginName);

    void handlerLoginData(OAuth2AccessToken token, SecurityUser principal, HttpServletRequest request);

    UacUser findUserInfoByUserId(Integer id);

    Collection<GrantedAuthority> loadUserAuthorities(Integer id);
}
