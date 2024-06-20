package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaibantixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaibantixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaibantixingView;


/**
 * 待办提醒
 *
 * @author 
 * @email 
 * @date 2023-03-05 15:45:54
 */
public interface DaibantixingService extends IService<DaibantixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaibantixingVO> selectListVO(Wrapper<DaibantixingEntity> wrapper);
   	
   	DaibantixingVO selectVO(@Param("ew") Wrapper<DaibantixingEntity> wrapper);
   	
   	List<DaibantixingView> selectListView(Wrapper<DaibantixingEntity> wrapper);
   	
   	DaibantixingView selectView(@Param("ew") Wrapper<DaibantixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaibantixingEntity> wrapper);
   	

}

