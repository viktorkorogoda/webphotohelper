package com.viktarkarahoda.photohelper.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.viktarkarahoda.photohelper.enums.UserRole;

@Service
public class LoginService implements UserDetailsService {

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		
		try {
			// Get user from database
			com.viktarkarahoda.photohelper.entity.User admin;
			try {
				admin = userService.getUser(username);
			} catch (Exception e) {
				throw new UsernameNotFoundException("User not found!");
			}

			if (admin == null) {
				// Admin was not found in database
				throw new UsernameNotFoundException("User not found!");
			}

			if (StringUtils.isEmpty(admin.getPassword())) {
				// Admin password was not found in database
				throw new UsernameNotFoundException("Data base access error");
			}

			String role = admin.getRole();
			if (UserRole.valueOf(role) == null) {
				throw new UsernameNotFoundException("Invalid user role!");
			}

			List<GrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(admin.getRole())); 
			User user = new User(admin.getLogin(), admin.getPassword(), true, true, true, true, authorities);
			return user;
		} catch (DataAccessException e) {
			throw new UsernameNotFoundException("Data base access error", e);
		}
	}
}