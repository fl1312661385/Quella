package com.ssrs.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ssrs.model.Student;
import org.apache.ibatis.annotations.CacheNamespace;


/**
 * @author 上善若水
 * @date 2019/01/01
 */
@CacheNamespace(implementation = com.ssrs.core.cache.RedisMybatisCache.class )
public interface StudentMapper extends BaseMapper<Student> {
}
