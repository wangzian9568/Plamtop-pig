/**
 * Copyright (c) 2016-2019 掌上明猪 All rights reserved.
 *
 * https://www.Plamtoppig.io
 *
 * 版权所有，侵权必究！
 */

package io.pig.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import io.pig.entity.UserEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author Mark wangzian9568@163.com
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
