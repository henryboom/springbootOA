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


import com.dao.GongwenxinxiDao;
import com.entity.GongwenxinxiEntity;
import com.service.GongwenxinxiService;
import com.entity.vo.GongwenxinxiVO;
import com.entity.view.GongwenxinxiView;

@Service("gongwenxinxiService")
public class GongwenxinxiServiceImpl extends ServiceImpl<GongwenxinxiDao, GongwenxinxiEntity> implements GongwenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongwenxinxiEntity> page = this.selectPage(
                new Query<GongwenxinxiEntity>(params).getPage(),
                new EntityWrapper<GongwenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongwenxinxiEntity> wrapper) {
		  Page<GongwenxinxiView> page =new Query<GongwenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongwenxinxiVO> selectListVO(Wrapper<GongwenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongwenxinxiVO selectVO(Wrapper<GongwenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongwenxinxiView> selectListView(Wrapper<GongwenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongwenxinxiView selectView(Wrapper<GongwenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
