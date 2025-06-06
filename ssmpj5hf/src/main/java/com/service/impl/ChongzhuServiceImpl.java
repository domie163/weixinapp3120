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


import com.dao.ChongzhuDao;
import com.entity.ChongzhuEntity;
import com.service.ChongzhuService;
import com.entity.vo.ChongzhuVO;
import com.entity.view.ChongzhuView;

@Service("chongzhuService")
public class ChongzhuServiceImpl extends ServiceImpl<ChongzhuDao, ChongzhuEntity> implements ChongzhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongzhuEntity> page = this.selectPage(
                new Query<ChongzhuEntity>(params).getPage(),
                new EntityWrapper<ChongzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongzhuEntity> wrapper) {
		  Page<ChongzhuView> page =new Query<ChongzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongzhuVO> selectListVO(Wrapper<ChongzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongzhuVO selectVO(Wrapper<ChongzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongzhuView> selectListView(Wrapper<ChongzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongzhuView selectView(Wrapper<ChongzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
