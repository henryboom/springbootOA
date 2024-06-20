package com.dao;

import com.entity.DaibantixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaibantixingVO;
import com.entity.view.DaibantixingView;


/**
 * 待办提醒
 * 
 * @author 
 * @email 
 * @date 2023-03-05 15:45:54
 */
public interface DaibantixingDao extends BaseMapper<DaibantixingEntity> {
	
	List<DaibantixingVO> selectListVO(@Param("ew") Wrapper<DaibantixingEntity> wrapper);
	
	DaibantixingVO selectVO(@Param("ew") Wrapper<DaibantixingEntity> wrapper);
	
	List<DaibantixingView> selectListView(@Param("ew") Wrapper<DaibantixingEntity> wrapper);

	List<DaibantixingView> selectListView(Pagination page,@Param("ew") Wrapper<DaibantixingEntity> wrapper);
	
	DaibantixingView selectView(@Param("ew") Wrapper<DaibantixingEntity> wrapper);
	

}
