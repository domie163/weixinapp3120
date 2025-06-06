package com.entity.view;

import com.entity.ChongzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠主
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
@TableName("chongzhu")
public class ChongzhuView  extends ChongzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongzhuView(){
	}
 
 	public ChongzhuView(ChongzhuEntity chongzhuEntity){
 	try {
			BeanUtils.copyProperties(this, chongzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
