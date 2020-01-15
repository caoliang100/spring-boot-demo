package com.imooc.service;

import com.imooc.pojo.TApiUser;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ApiUserService {

	public void saveUser(TApiUser user) throws Exception;

	public void updateUser(TApiUser user);

	public void deleteUser(String userId);

	List<TApiUser> queryUserListCustom(String qq, int page, int pageSize);

	//	public TApiUser queryUserById(String userId);
//
//	public List<TApiUser> queryUserList(TApiUser user);
//
	public List<TApiUser> queryUserListPaged(TApiUser user, Integer page, Integer pageSize);
//
//	public TApiUser queryUserByIdCustom(String userId);
//
//	public void saveUserTransactional(TApiUser user);
}
