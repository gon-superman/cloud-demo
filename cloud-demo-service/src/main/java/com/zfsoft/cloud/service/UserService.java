package com.zfsoft.cloud.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zfsoft.cloud.model.User;




@Service
public class UserService {

	
	public List<User> searchAll(){
//		List<User> list = userMapper.findAll();
		List<User> list = new ArrayList<User>();
		
		for (int i = 0 ,j = 10 ; i < j ; i++){
			User user = new User();
			user.setId(i);
			user.setUsername("zhangsan"+i);
			list.add(user);
		}
		
		return list;
	}
}
