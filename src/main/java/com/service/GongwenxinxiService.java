package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongwenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongwenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongwenxinxiView;


/**
 * 公文信息
 *
 * @author 
 * @email 
 * @date 2023-03-05 15:45:54
 */
public interface GongwenxinxiService extends IService<GongwenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongwenxinxiVO> selectListVO(Wrapper<GongwenxinxiEntity> wrapper);
   	
   	GongwenxinxiVO selectVO(@Param("ew") Wrapper<GongwenxinxiEntity> wrapper);
   	
   	List<GongwenxinxiView> selectListView(Wrapper<GongwenxinxiEntity> wrapper);
   	
   	GongwenxinxiView selectView(@Param("ew") Wrapper<GongwenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongwenxinxiEntity> wrapper);
   	

}

