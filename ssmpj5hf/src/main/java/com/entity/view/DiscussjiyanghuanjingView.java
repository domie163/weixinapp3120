package com.entity.view;

import com.entity.DiscussjiyanghuanjingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 寄养环境评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
@TableName("discussjiyanghuanjing")
public class DiscussjiyanghuanjingView  extends DiscussjiyanghuanjingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiyanghuanjingView(){
	}
 
 	public DiscussjiyanghuanjingView(DiscussjiyanghuanjingEntity discussjiyanghuanjingEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiyanghuanjingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
