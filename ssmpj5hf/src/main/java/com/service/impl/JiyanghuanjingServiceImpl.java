package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiyanghuanjingDao;
import com.entity.JiyanghuanjingEntity;
import com.service.JiyanghuanjingService;
import com.entity.vo.JiyanghuanjingVO;
import com.entity.view.JiyanghuanjingView;

@Service("jiyanghuanjingService")
public class JiyanghuanjingServiceImpl extends ServiceImpl<JiyanghuanjingDao, JiyanghuanjingEntity> implements JiyanghuanjingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiyanghuanjingEntity> page = this.selectPage(
                new Query<JiyanghuanjingEntity>(params).getPage(),
                new EntityWrapper<JiyanghuanjingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiyanghuanjingEntity> wrapper) {
		  Page<JiyanghuanjingView> page =new Query<JiyanghuanjingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiyanghuanjingVO> selectListVO(Wrapper<JiyanghuanjingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiyanghuanjingVO selectVO(Wrapper<JiyanghuanjingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiyanghuanjingView> selectListView(Wrapper<JiyanghuanjingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiyanghuanjingView selectView(Wrapper<JiyanghuanjingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
