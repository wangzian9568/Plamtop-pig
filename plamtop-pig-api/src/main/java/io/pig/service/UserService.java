/**
 * Copyright (c) 2016-2019 掌上明猪 All rights reserved.
 *
 * https://www.Plamtoppig.io
 *
 * 版权所有，侵权必究！
 */

package io.pig.service;

import com.baomidou.mybatisplus.extension.service.IService;

import io.pig.entity.UserEntity;
import io.pig.form.LoginForm;

import java.util.Map;

/**
 * 用户
 *
 * @author Mark wangzian9568@163.com
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回登录信息
	 */
	Map<String, Object> login(LoginForm form);
}
