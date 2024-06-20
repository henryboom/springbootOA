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


import com.dao.GongwenfenleiDao;
import com.entity.GongwenfenleiEntity;
import com.service.GongwenfenleiService;
import com.entity.vo.GongwenfenleiVO;
import com.entity.view.GongwenfenleiView;

@Service("gongwenfenleiService")
public class GongwenfenleiServiceImpl extends ServiceImpl<GongwenfenleiDao, GongwenfenleiEntity> implements GongwenfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongwenfenleiEntity> page = this.selectPage(
                new Query<GongwenfenleiEntity>(params).getPage(),
                new EntityWrapper<GongwenfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongwenfenleiEntity> wrapper) {
		  Page<GongwenfenleiView> page =new Query<GongwenfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongwenfenleiVO> selectListVO(Wrapper<GongwenfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongwenfenleiVO selectVO(Wrapper<GongwenfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongwenfenleiView> selectListView(Wrapper<GongwenfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongwenfenleiView selectView(Wrapper<GongwenfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
