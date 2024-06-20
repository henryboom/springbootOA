package com.dao;

import com.entity.GongwenfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongwenfenleiVO;
import com.entity.view.GongwenfenleiView;


/**
 * 公文分类
 * 
 * @author 
 * @email 
 * @date 2023-03-05 15:45:54
 */
public interface GongwenfenleiDao extends BaseMapper<GongwenfenleiEntity> {
	
	List<GongwenfenleiVO> selectListVO(@Param("ew") Wrapper<GongwenfenleiEntity> wrapper);
	
	GongwenfenleiVO selectVO(@Param("ew") Wrapper<GongwenfenleiEntity> wrapper);
	
	List<GongwenfenleiView> selectListView(@Param("ew") Wrapper<GongwenfenleiEntity> wrapper);

	List<GongwenfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<GongwenfenleiEntity> wrapper);
	
	GongwenfenleiView selectView(@Param("ew") Wrapper<GongwenfenleiEntity> wrapper);
	

}
