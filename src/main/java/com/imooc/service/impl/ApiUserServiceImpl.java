package com.imooc.service.impl;

import com.github.pagehelper.PageHelper;
import com.imooc.mapper.TApiUserMapper;
import com.imooc.mapper.TApiUserMapperCustom;
import com.imooc.pojo.TApiUser;
import com.imooc.service.ApiUserService;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ApiUserServiceImpl implements ApiUserService {

	@Autowired
	private TApiUserMapper apiUserMapper;

	@Autowired
	private TApiUserMapperCustom apiUserMapperCustom;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveUser(TApiUser user) throws Exception {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		apiUserMapper.insert(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateUser(TApiUser user) {
//		userMapper.updateByPrimaryKeySelective(user);
		apiUserMapper.updateByPrimaryKey(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteUser(String userId) {
		apiUserMapper.deleteByPrimaryKey(userId);
	}

//	@Override
//	@Transactional(propagation = Propagation.SUPPORTS)
//	public TApiUser queryUserById(String userId) {
//
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		return userMapper.selectByPrimaryKey(userId);
//	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<TApiUser> queryUserListCustom(String qq, int page, int pageSize) {
// 开始分页
		PageHelper.startPage(page, pageSize);
		List<TApiUser> userList = apiUserMapperCustom.queryUserCustom("%"+qq+"%");

		return userList;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<TApiUser> queryUserListPaged(TApiUser user, Integer page, Integer pageSize) {
		// 开始分页
        PageHelper.startPage(page, pageSize);

		Example example = new Example(TApiUser.class);
		Example.Criteria criteria = example.createCriteria();

		if (!StringUtils.isEmptyOrWhitespace(user.getRemark())) {
			criteria.andEqualTo("remark",  user.getRemark() );
		}
		example.orderBy("remark").desc();
		List<TApiUser> userList = apiUserMapper.selectByExample(example);

		return userList;
	}
	
//	@Override
//	@Transactional(propagation = Propagation.SUPPORTS)
//	public TApiUser queryUserByIdCustom(String userId) {
//
//		List<TApiUser> userList = userMapperCustom.queryUserSimplyInfoById(userId);
//
//		if (userList != null && !userList.isEmpty()) {
//			return (TApiUser)userList.get(0);
//		}
//
//		return null;
//	}
	
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED)
//	public void saveUserTransactional(TApiUser user) {
//
//		userMapper.insert(user);
//
//		int a = 1 / 0;
//		user.setIsDelete(false);
//		userMapper.updateByPrimaryKeySelective(user);
//	}
}
