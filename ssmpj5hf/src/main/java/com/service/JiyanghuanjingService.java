package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiyanghuanjingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiyanghuanjingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiyanghuanjingView;


/**
 * 寄养环境
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
public interface JiyanghuanjingService extends IService<JiyanghuanjingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiyanghuanjingVO> selectListVO(Wrapper<JiyanghuanjingEntity> wrapper);
   	
   	JiyanghuanjingVO selectVO(@Param("ew") Wrapper<JiyanghuanjingEntity> wrapper);
   	
   	List<JiyanghuanjingView> selectListView(Wrapper<JiyanghuanjingEntity> wrapper);
   	
   	JiyanghuanjingView selectView(@Param("ew") Wrapper<JiyanghuanjingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiyanghuanjingEntity> wrapper);
   	

}

