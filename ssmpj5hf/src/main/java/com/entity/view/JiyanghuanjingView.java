package com.entity.view;

import com.entity.JiyanghuanjingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 寄养环境
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-13 14:32:56
 */
@TableName("jiyanghuanjing")
public class JiyanghuanjingView  extends JiyanghuanjingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiyanghuanjingView(){
	}
 
 	public JiyanghuanjingView(JiyanghuanjingEntity jiyanghuanjingEntity){
 	try {
			BeanUtils.copyProperties(this, jiyanghuanjingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
