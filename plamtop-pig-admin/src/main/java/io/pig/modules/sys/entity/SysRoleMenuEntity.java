/**
 * Copyright (c) 2016-2019 掌上明猪 All rights reserved.
 *
 * https://www.Plamtoppig.io
 *
 * 版权所有，侵权必究！
 */

package io.pig.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色与菜单对应关系
 *
 * @author Mark wangzian9568@163.com
 */
@Data
@TableName("sys_role_menu")
public class SysRoleMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@TableId
	private Long id;

	/**
	 * 角色ID
	 */
	private Long roleId;

	/**
	 * 菜单ID
	 */
	private Long menuId;

	
}
