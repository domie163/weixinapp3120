package com.dao;

import com.entity.JiyanghuanjingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiyanghuanjingVO;
import com.entity.view.JiyanghuanjingView;


/**
 * 寄养环境
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
public interface JiyanghuanjingDao extends BaseMapper<JiyanghuanjingEntity> {
	
	List<JiyanghuanjingVO> selectListVO(@Param("ew") Wrapper<JiyanghuanjingEntity> wrapper);
	
	JiyanghuanjingVO selectVO(@Param("ew") Wrapper<JiyanghuanjingEntity> wrapper);
	
	List<JiyanghuanjingView> selectListView(@Param("ew") Wrapper<JiyanghuanjingEntity> wrapper);

	List<JiyanghuanjingView> selectListView(Pagination page,@Param("ew") Wrapper<JiyanghuanjingEntity> wrapper);
	
	JiyanghuanjingView selectView(@Param("ew") Wrapper<JiyanghuanjingEntity> wrapper);
	

}
