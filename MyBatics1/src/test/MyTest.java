package test;

import org.junit.Before;
import org.junit.Test;

import beans.Student;
import dao.IStudentDao;
import dao.StudentDaoImpl;
import org.junit.Test;

import beans.Student;
import dao.IStudentDao;
import dao.StudentDaoImpl;

public class MyTest {
//   @Test
//   public void test01() {
//	   IStudentDao dao=new StudentDaoImpl();
//	   Student student =new Student("赵六",26,96.5);
//	   System.out.println("running");
//	   dao.insertStu(student);
//	   System.out.println("the end");
	private IStudentDao dao;

	@Before
	public void before() {
		dao = new StudentDaoImpl();
	}
	
	@Test
	public void testInsert() {
		Student student = new Student("张三", 23, 93.5);
		dao.insertStu(student);
   }
}
