package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 公文信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-05 15:45:54
 */
@TableName("gongwenxinxi")
public class GongwenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongwenxinxiEntity() {
		
	}
	
	public GongwenxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 公文编号
	 */
					
	private String gongwenbianhao;
	
	/**
	 * 公文标题
	 */
					
	private String gongwenbiaoti;
	
	/**
	 * 公文分类
	 */
					
	private String gongwenfenlei;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 公文内容
	 */
					
	private String gongwenneirong;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：公文编号
	 */
	public void setGongwenbianhao(String gongwenbianhao) {
		this.gongwenbianhao = gongwenbianhao;
	}
	/**
	 * 获取：公文编号
	 */
	public String getGongwenbianhao() {
		return gongwenbianhao;
	}
	/**
	 * 设置：公文标题
	 */
	public void setGongwenbiaoti(String gongwenbiaoti) {
		this.gongwenbiaoti = gongwenbiaoti;
	}
	/**
	 * 获取：公文标题
	 */
	public String getGongwenbiaoti() {
		return gongwenbiaoti;
	}
	/**
	 * 设置：公文分类
	 */
	public void setGongwenfenlei(String gongwenfenlei) {
		this.gongwenfenlei = gongwenfenlei;
	}
	/**
	 * 获取：公文分类
	 */
	public String getGongwenfenlei() {
		return gongwenfenlei;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：公文内容
	 */
	public void setGongwenneirong(String gongwenneirong) {
		this.gongwenneirong = gongwenneirong;
	}
	/**
	 * 获取：公文内容
	 */
	public String getGongwenneirong() {
		return gongwenneirong;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
