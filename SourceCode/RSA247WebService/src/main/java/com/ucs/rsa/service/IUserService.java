package com.ucs.rsa.service;

import com.ucs.rsa.common.dto.UserDTO;

public interface IUserService {

	public UserDTO updateUser(int iUserId, String iUserFirstName, String iUserLastName, int iMobieNo,
			boolean isEnabled, boolean isCreate);
	
	public UserDTO updateUser(UserDTO iUserDTO, boolean isCreate);
}
