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


import com.dao.DiscussjiyanghuanjingDao;
import com.entity.DiscussjiyanghuanjingEntity;
import com.service.DiscussjiyanghuanjingService;
import com.entity.vo.DiscussjiyanghuanjingVO;
import com.entity.view.DiscussjiyanghuanjingView;

@Service("discussjiyanghuanjingService")
public class DiscussjiyanghuanjingServiceImpl extends ServiceImpl<DiscussjiyanghuanjingDao, DiscussjiyanghuanjingEntity> implements DiscussjiyanghuanjingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiyanghuanjingEntity> page = this.selectPage(
                new Query<DiscussjiyanghuanjingEntity>(params).getPage(),
                new EntityWrapper<DiscussjiyanghuanjingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiyanghuanjingEntity> wrapper) {
		  Page<DiscussjiyanghuanjingView> page =new Query<DiscussjiyanghuanjingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiyanghuanjingVO> selectListVO(Wrapper<DiscussjiyanghuanjingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiyanghuanjingVO selectVO(Wrapper<DiscussjiyanghuanjingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiyanghuanjingView> selectListView(Wrapper<DiscussjiyanghuanjingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiyanghuanjingView selectView(Wrapper<DiscussjiyanghuanjingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
