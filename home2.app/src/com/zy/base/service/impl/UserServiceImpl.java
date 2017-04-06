package com.zy.base.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.base.dao.UserMapper;
import com.zy.base.pojo.User;
import com.zy.base.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userDao;
	/* (non-Javadoc)
	 * @see com.zy.base.service.impl.UserService#getUserById(int)
	 */
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
