package com.dao;

import com.entity.DiscussjiyanghuanjingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiyanghuanjingVO;
import com.entity.view.DiscussjiyanghuanjingView;


/**
 * 寄养环境评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
public interface DiscussjiyanghuanjingDao extends BaseMapper<DiscussjiyanghuanjingEntity> {
	
	List<DiscussjiyanghuanjingVO> selectListVO(@Param("ew") Wrapper<DiscussjiyanghuanjingEntity> wrapper);
	
	DiscussjiyanghuanjingVO selectVO(@Param("ew") Wrapper<DiscussjiyanghuanjingEntity> wrapper);
	
	List<DiscussjiyanghuanjingView> selectListView(@Param("ew") Wrapper<DiscussjiyanghuanjingEntity> wrapper);

	List<DiscussjiyanghuanjingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiyanghuanjingEntity> wrapper);
	
	DiscussjiyanghuanjingView selectView(@Param("ew") Wrapper<DiscussjiyanghuanjingEntity> wrapper);
	

}
