/**
 * Copyright (c) 2016-2019 掌上明猪 All rights reserved.
 *
 * https://www.Plamtoppig.io
 *
 * 版权所有，侵权必究！
 */

package io.pig.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import io.pig.modules.job.entity.ScheduleJobLogEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author Mark wangzian9568@163.com
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
