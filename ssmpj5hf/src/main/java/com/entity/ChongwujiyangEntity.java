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
 * 宠物寄养
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
@TableName("chongwujiyang")
public class ChongwujiyangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwujiyangEntity() {
		
	}
	
	public ChongwujiyangEntity(T t) {
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
	 * 寄养单号
	 */
					
	private String jiyangdanhao;
	
	/**
	 * 宠物名称
	 */
					
	private String chongwumingcheng;
	
	/**
	 * 宠物种类
	 */
					
	private String chongwuzhonglei;
	
	/**
	 * 宠物性别
	 */
					
	private String chongwuxingbie;
	
	/**
	 * 是否绝育
	 */
					
	private String shifoujueyu;
	
	/**
	 * 宠物年龄
	 */
					
	private String chongwunianling;
	
	/**
	 * 开始时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaishishijian;
	
	/**
	 * 寄养时长
	 */
					
	private Integer jiyangshizhang;
	
	/**
	 * 托管费用
	 */
					
	private Float tuoguanfeiyong;
	
	/**
	 * 总费用
	 */
					
	private Float zongfeiyong;
	
	/**
	 * 宠主姓名
	 */
					
	private String chongzhuxingming;
	
	/**
	 * 宠主账号
	 */
					
	private String chongzhuzhanghao;
	
	/**
	 * 预约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	/**
	 * 寄养原因
	 */
					
	private String jiyangyuanyin;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：寄养单号
	 */
	public void setJiyangdanhao(String jiyangdanhao) {
		this.jiyangdanhao = jiyangdanhao;
	}
	/**
	 * 获取：寄养单号
	 */
	public String getJiyangdanhao() {
		return jiyangdanhao;
	}
	/**
	 * 设置：宠物名称
	 */
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
	/**
	 * 设置：宠物种类
	 */
	public void setChongwuzhonglei(String chongwuzhonglei) {
		this.chongwuzhonglei = chongwuzhonglei;
	}
	/**
	 * 获取：宠物种类
	 */
	public String getChongwuzhonglei() {
		return chongwuzhonglei;
	}
	/**
	 * 设置：宠物性别
	 */
	public void setChongwuxingbie(String chongwuxingbie) {
		this.chongwuxingbie = chongwuxingbie;
	}
	/**
	 * 获取：宠物性别
	 */
	public String getChongwuxingbie() {
		return chongwuxingbie;
	}
	/**
	 * 设置：是否绝育
	 */
	public void setShifoujueyu(String shifoujueyu) {
		this.shifoujueyu = shifoujueyu;
	}
	/**
	 * 获取：是否绝育
	 */
	public String getShifoujueyu() {
		return shifoujueyu;
	}
	/**
	 * 设置：宠物年龄
	 */
	public void setChongwunianling(String chongwunianling) {
		this.chongwunianling = chongwunianling;
	}
	/**
	 * 获取：宠物年龄
	 */
	public String getChongwunianling() {
		return chongwunianling;
	}
	/**
	 * 设置：开始时间
	 */
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
	/**
	 * 设置：寄养时长
	 */
	public void setJiyangshizhang(Integer jiyangshizhang) {
		this.jiyangshizhang = jiyangshizhang;
	}
	/**
	 * 获取：寄养时长
	 */
	public Integer getJiyangshizhang() {
		return jiyangshizhang;
	}
	/**
	 * 设置：托管费用
	 */
	public void setTuoguanfeiyong(Float tuoguanfeiyong) {
		this.tuoguanfeiyong = tuoguanfeiyong;
	}
	/**
	 * 获取：托管费用
	 */
	public Float getTuoguanfeiyong() {
		return tuoguanfeiyong;
	}
	/**
	 * 设置：总费用
	 */
	public void setZongfeiyong(Float zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	/**
	 * 获取：总费用
	 */
	public Float getZongfeiyong() {
		return zongfeiyong;
	}
	/**
	 * 设置：宠主姓名
	 */
	public void setChongzhuxingming(String chongzhuxingming) {
		this.chongzhuxingming = chongzhuxingming;
	}
	/**
	 * 获取：宠主姓名
	 */
	public String getChongzhuxingming() {
		return chongzhuxingming;
	}
	/**
	 * 设置：宠主账号
	 */
	public void setChongzhuzhanghao(String chongzhuzhanghao) {
		this.chongzhuzhanghao = chongzhuzhanghao;
	}
	/**
	 * 获取：宠主账号
	 */
	public String getChongzhuzhanghao() {
		return chongzhuzhanghao;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：寄养原因
	 */
	public void setJiyangyuanyin(String jiyangyuanyin) {
		this.jiyangyuanyin = jiyangyuanyin;
	}
	/**
	 * 获取：寄养原因
	 */
	public String getJiyangyuanyin() {
		return jiyangyuanyin;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
