package com.asiainfo.baas.marthon.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String id;
	
	private String name;
	
	private String sex;
	
	//private static List<Student> students=new ArrayList<Student>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public List<Student> queryAllStudnet(){
		List<Student> students=new ArrayList<Student>();
//		Student student=new Student();
//		student.setName("����Ƽ");
//		student.setId("1");
//		student.setSex("Ů");
//		students.add(student);
//		Student student2=new Student();
//		student2.setName("���Ļ�");
//		student2.setId("2");
//		student2.setSex("Ů");
//		students.add(student2);
//		Student student3=new Student();
//		student3.setName("��ΰ29");
//		student3.setId("2");
//		student3.setSex("��");
//		students.add(student3);
		return students;
	}
	
	public Student getStudent(int id){
		Student student3=new Student();
		student3.setName("��ΰ29");
		student3.setId("2");
		student3.setSex("��");
		return student3;
	}
	public void addStudent(){
		//students.add(this);
	}

}
