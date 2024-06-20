package com.dao;

import com.entity.GongwenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongwenxinxiVO;
import com.entity.view.GongwenxinxiView;


/**
 * 公文信息
 * 
 * @author 
 * @email 
 * @date 2023-03-05 15:45:54
 */
public interface GongwenxinxiDao extends BaseMapper<GongwenxinxiEntity> {
	
	List<GongwenxinxiVO> selectListVO(@Param("ew") Wrapper<GongwenxinxiEntity> wrapper);
	
	GongwenxinxiVO selectVO(@Param("ew") Wrapper<GongwenxinxiEntity> wrapper);
	
	List<GongwenxinxiView> selectListView(@Param("ew") Wrapper<GongwenxinxiEntity> wrapper);

	List<GongwenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongwenxinxiEntity> wrapper);
	
	GongwenxinxiView selectView(@Param("ew") Wrapper<GongwenxinxiEntity> wrapper);
	

}
