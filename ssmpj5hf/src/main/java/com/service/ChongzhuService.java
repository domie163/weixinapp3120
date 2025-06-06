package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongzhuView;


/**
 * 宠主
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
public interface ChongzhuService extends IService<ChongzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongzhuVO> selectListVO(Wrapper<ChongzhuEntity> wrapper);
   	
   	ChongzhuVO selectVO(@Param("ew") Wrapper<ChongzhuEntity> wrapper);
   	
   	List<ChongzhuView> selectListView(Wrapper<ChongzhuEntity> wrapper);
   	
   	ChongzhuView selectView(@Param("ew") Wrapper<ChongzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongzhuEntity> wrapper);
   	

}

