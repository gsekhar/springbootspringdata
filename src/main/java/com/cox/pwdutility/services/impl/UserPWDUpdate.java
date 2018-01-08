package com.cox.pwdutility.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cox.pwdutility.model.User;
import com.cox.pwdutility.repository.IUpdatePWDRepository;

@Service
public class UserPWDUpdate implements IUserPWDUpdate {

	private IUpdatePWDRepository updatPwdRepository;
	
	 @Autowired
	    public UserPWDUpdate(IUpdatePWDRepository updatPwdRepository) {
	        this.updatPwdRepository = updatPwdRepository;
	    }
	 
	@Override
	public List<User> updateAllPWD(Long userseqid) {
		return updatPwdRepository.findByUserSeqId(userseqid);
	}

}
