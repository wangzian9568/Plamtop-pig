/**
 * Copyright (c) 2016-2019 掌上明猪 All rights reserved.
 *
 * https://www.Plamtoppig.io
 *
 * 版权所有，侵权必究！
 */

package io.pig.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import io.pig.modules.sys.entity.SysRoleEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 角色管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	

}
