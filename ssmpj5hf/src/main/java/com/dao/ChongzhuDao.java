package com.dao;

import com.entity.ChongzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongzhuVO;
import com.entity.view.ChongzhuView;


/**
 * 宠主
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
public interface ChongzhuDao extends BaseMapper<ChongzhuEntity> {
	
	List<ChongzhuVO> selectListVO(@Param("ew") Wrapper<ChongzhuEntity> wrapper);
	
	ChongzhuVO selectVO(@Param("ew") Wrapper<ChongzhuEntity> wrapper);
	
	List<ChongzhuView> selectListView(@Param("ew") Wrapper<ChongzhuEntity> wrapper);

	List<ChongzhuView> selectListView(Pagination page,@Param("ew") Wrapper<ChongzhuEntity> wrapper);
	
	ChongzhuView selectView(@Param("ew") Wrapper<ChongzhuEntity> wrapper);
	

}
