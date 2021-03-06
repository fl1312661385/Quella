package com.ssrs.mapper;

import com.ssrs.model.Sign;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ssrs
 * @since 2018-08-21
 */
@CacheNamespace(implementation = com.ssrs.core.cache.RedisMybatisCache.class )
public interface SignMapper extends BaseMapper<Sign> {

}
