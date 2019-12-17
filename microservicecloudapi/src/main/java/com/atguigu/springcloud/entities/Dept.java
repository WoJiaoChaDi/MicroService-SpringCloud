package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@NoArgsConstructor			//空参的构造函数
//@AllArgsConstructor		//全参的构造函数
@Data						//自动注入getset  IDEA需要安装lombok插件，并启用idea的compiler注解生成器
@Accessors(chain=true)		//启用链式写法
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}

	public static void main(String[] args) {
		Dept dept = new Dept("我是部门");
		dept.setDeptno(11L).setDname("部门").setDb_source("db_01");
	}
}
