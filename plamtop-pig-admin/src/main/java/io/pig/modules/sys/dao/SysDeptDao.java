/**
 * Copyright (c) 2016-2019 掌上明猪 All rights reserved.
 *
 * https://www.Plamtoppig.io
 *
 * 版权所有，侵权必究！
 */

package io.pig.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import io.pig.modules.sys.entity.SysDeptEntity;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 部门管理
 *
 * @author Mark wangzian9568@163.com
 */
@Mapper
public interface SysDeptDao extends BaseMapper<SysDeptEntity> {

    List<SysDeptEntity> queryList(Map<String, Object> params);

    /**
     * 查询子部门ID列表
     * @param parentId  上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);

}
