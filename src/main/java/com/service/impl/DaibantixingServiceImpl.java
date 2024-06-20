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


import com.dao.DaibantixingDao;
import com.entity.DaibantixingEntity;
import com.service.DaibantixingService;
import com.entity.vo.DaibantixingVO;
import com.entity.view.DaibantixingView;

@Service("daibantixingService")
public class DaibantixingServiceImpl extends ServiceImpl<DaibantixingDao, DaibantixingEntity> implements DaibantixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaibantixingEntity> page = this.selectPage(
                new Query<DaibantixingEntity>(params).getPage(),
                new EntityWrapper<DaibantixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaibantixingEntity> wrapper) {
		  Page<DaibantixingView> page =new Query<DaibantixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaibantixingVO> selectListVO(Wrapper<DaibantixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaibantixingVO selectVO(Wrapper<DaibantixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaibantixingView> selectListView(Wrapper<DaibantixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaibantixingView selectView(Wrapper<DaibantixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
