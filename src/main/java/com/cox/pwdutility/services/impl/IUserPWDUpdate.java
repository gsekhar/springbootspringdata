package com.cox.pwdutility.services.impl;

import java.util.List;

import com.cox.pwdutility.model.User;

public interface IUserPWDUpdate {

	List<User> updateAllPWD(Long userseqid);
}
