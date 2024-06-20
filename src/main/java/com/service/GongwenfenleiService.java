package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongwenfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongwenfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongwenfenleiView;


/**
 * 公文分类
 *
 * @author 
 * @email 
 * @date 2023-03-05 15:45:54
 */
public interface GongwenfenleiService extends IService<GongwenfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongwenfenleiVO> selectListVO(Wrapper<GongwenfenleiEntity> wrapper);
   	
   	GongwenfenleiVO selectVO(@Param("ew") Wrapper<GongwenfenleiEntity> wrapper);
   	
   	List<GongwenfenleiView> selectListView(Wrapper<GongwenfenleiEntity> wrapper);
   	
   	GongwenfenleiView selectView(@Param("ew") Wrapper<GongwenfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongwenfenleiEntity> wrapper);
   	

}

