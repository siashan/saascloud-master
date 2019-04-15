package com.han.saascloud.provider.security;

import com.han.saascloud.provider.model.domain.UacUser;
import com.han.saascloud.provider.service.UacUserService;
import com.han.saascloud.security.core.SecurityUser;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * The class Uac user details service.
 *
 * @author paascloud.net @gmail.com
 */
@Component
public class UacUserDetailsServiceImpl implements UserDetailsService {

	@Resource
	private UacUserService uacUserService;

	/**
	 * Load user by username user details.
	 *
	 * @param username the username
	 *
	 * @return the user details
	 */
	@Override
	public UserDetails loadUserByUsername(String username) {
		Collection<GrantedAuthority> grantedAuthorities;
		UacUser user = uacUserService.findByLoginName(username);
		if (user == null) {
			throw new BadCredentialsException("用户名不存在或者密码错误");
		}
		user = uacUserService.findUserInfoByUserId(user.getId());
		grantedAuthorities = uacUserService.loadUserAuthorities(user.getId());
		return new SecurityUser((long)user.getId(), user.getName(), user.getPassword(),
				user.getRealName(), (long)user.getDeptId(), user.getName(), user.getStatus(), grantedAuthorities);
	}
}
