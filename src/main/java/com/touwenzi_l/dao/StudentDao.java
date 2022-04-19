package com.touwenzi_l.dao;

import com.touwenzi_l.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper告诉Mybatis这是dao接口创建这个接口的代理对象
 */
@Mapper
public interface StudentDao {
	Student selectById(@Param("stuId") Integer id);
}
