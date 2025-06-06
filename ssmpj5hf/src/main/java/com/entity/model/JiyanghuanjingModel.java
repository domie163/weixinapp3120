package com.entity.model;

import com.entity.JiyanghuanjingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 寄养环境
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
public class JiyanghuanjingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
