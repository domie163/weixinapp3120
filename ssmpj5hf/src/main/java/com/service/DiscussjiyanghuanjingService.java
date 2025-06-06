package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiyanghuanjingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiyanghuanjingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiyanghuanjingView;


/**
 * 寄养环境评论表
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
public interface DiscussjiyanghuanjingService extends IService<DiscussjiyanghuanjingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiyanghuanjingVO> selectListVO(Wrapper<DiscussjiyanghuanjingEntity> wrapper);
   	
   	DiscussjiyanghuanjingVO selectVO(@Param("ew") Wrapper<DiscussjiyanghuanjingEntity> wrapper);
   	
   	List<DiscussjiyanghuanjingView> selectListView(Wrapper<DiscussjiyanghuanjingEntity> wrapper);
   	
   	DiscussjiyanghuanjingView selectView(@Param("ew") Wrapper<DiscussjiyanghuanjingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiyanghuanjingEntity> wrapper);
   	

}

