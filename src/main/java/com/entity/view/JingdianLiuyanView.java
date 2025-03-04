package com.entity.view;

import com.entity.JingdianLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 景点留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jingdian_liuyan")
public class JingdianLiuyanView extends JingdianLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jingdian
			/**
			* 景点名称
			*/
			private String jingdianName;
			/**
			* 景点照片
			*/
			private String jingdianPhoto;
			/**
			* 景点类型
			*/
			private Integer jingdianTypes;
				/**
				* 景点类型的值
				*/
				private String jingdianValue;
			/**
			* 景点原价
			*/
			private Double jingdianOldMoney;
			/**
			* 现价
			*/
			private Double jingdianNewMoney;
			/**
			* 点击次数
			*/
			private Integer jingdianClicknum;
			/**
			* 景点介绍
			*/
			private String jingdianContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer jingdianDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public JingdianLiuyanView() {

	}

	public JingdianLiuyanView(JingdianLiuyanEntity jingdianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jingdianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set jingdian
					/**
					* 获取： 景点名称
					*/
					public String getJingdianName() {
						return jingdianName;
					}
					/**
					* 设置： 景点名称
					*/
					public void setJingdianName(String jingdianName) {
						this.jingdianName = jingdianName;
					}
					/**
					* 获取： 景点照片
					*/
					public String getJingdianPhoto() {
						return jingdianPhoto;
					}
					/**
					* 设置： 景点照片
					*/
					public void setJingdianPhoto(String jingdianPhoto) {
						this.jingdianPhoto = jingdianPhoto;
					}
					/**
					* 获取： 景点类型
					*/
					public Integer getJingdianTypes() {
						return jingdianTypes;
					}
					/**
					* 设置： 景点类型
					*/
					public void setJingdianTypes(Integer jingdianTypes) {
						this.jingdianTypes = jingdianTypes;
					}


						/**
						* 获取： 景点类型的值
						*/
						public String getJingdianValue() {
							return jingdianValue;
						}
						/**
						* 设置： 景点类型的值
						*/
						public void setJingdianValue(String jingdianValue) {
							this.jingdianValue = jingdianValue;
						}
					/**
					* 获取： 景点原价
					*/
					public Double getJingdianOldMoney() {
						return jingdianOldMoney;
					}
					/**
					* 设置： 景点原价
					*/
					public void setJingdianOldMoney(Double jingdianOldMoney) {
						this.jingdianOldMoney = jingdianOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getJingdianNewMoney() {
						return jingdianNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setJingdianNewMoney(Double jingdianNewMoney) {
						this.jingdianNewMoney = jingdianNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getJingdianClicknum() {
						return jingdianClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setJingdianClicknum(Integer jingdianClicknum) {
						this.jingdianClicknum = jingdianClicknum;
					}
					/**
					* 获取： 景点介绍
					*/
					public String getJingdianContent() {
						return jingdianContent;
					}
					/**
					* 设置： 景点介绍
					*/
					public void setJingdianContent(String jingdianContent) {
						this.jingdianContent = jingdianContent;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getJingdianDelete() {
						return jingdianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setJingdianDelete(Integer jingdianDelete) {
						this.jingdianDelete = jingdianDelete;
					}

























				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
