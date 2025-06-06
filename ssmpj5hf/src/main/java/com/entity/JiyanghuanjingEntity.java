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
 * 寄养环境
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
@TableName("jiyanghuanjing")
public class JiyanghuanjingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiyanghuanjingEntity() {
		
	}
	
	public JiyanghuanjingEntity(T t) {
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
	 * 区域名称
	 */
					
	private String quyumingcheng;
	
	/**
	 * 托管费用
	 */
					
	private String tuoguanfeiyong;
	
	/**
	 * 消毒次数
	 */
					
	private String xiaoducishu;
	
	/**
	 * 面积
	 */
					
	private String mianji;
	
	/**
	 * 环境
	 */
					
	private String huanjing;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	
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
	 * 设置：区域名称
	 */
	public void setQuyumingcheng(String quyumingcheng) {
		this.quyumingcheng = quyumingcheng;
	}
	/**
	 * 获取：区域名称
	 */
	public String getQuyumingcheng() {
		return quyumingcheng;
	}
	/**
	 * 设置：托管费用
	 */
	public void setTuoguanfeiyong(String tuoguanfeiyong) {
		this.tuoguanfeiyong = tuoguanfeiyong;
	}
	/**
	 * 获取：托管费用
	 */
	public String getTuoguanfeiyong() {
		return tuoguanfeiyong;
	}
	/**
	 * 设置：消毒次数
	 */
	public void setXiaoducishu(String xiaoducishu) {
		this.xiaoducishu = xiaoducishu;
	}
	/**
	 * 获取：消毒次数
	 */
	public String getXiaoducishu() {
		return xiaoducishu;
	}
	/**
	 * 设置：面积
	 */
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
	/**
	 * 设置：环境
	 */
	public void setHuanjing(String huanjing) {
		this.huanjing = huanjing;
	}
	/**
	 * 获取：环境
	 */
	public String getHuanjing() {
		return huanjing;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}

}
