package com.touwenzi_l.service;

import com.touwenzi_l.dao.StudentDao;
import com.touwenzi_l.pojo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDao studentDao;
	
	@Override
	public Student queryStudent(Integer id) {
		Student student = studentDao.selectById(id);
		return student;
	}
}
