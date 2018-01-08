package com.cox.pwdutility.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cox.pwdutility.model.User;

public interface IUpdatePWDRepository  extends JpaRepository<User, String>{
	
	List<User> findByUserSeqId(Long userseqid);

}
