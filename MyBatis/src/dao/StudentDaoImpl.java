package dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import beans.Student;

public class StudentDaoImpl implements IStudentDao{
	private SqlSession session;
	@Override
	public void insertStu(Student student) {
		try {
			//��ȡ�������ļ�
			InputStream inputStream =Resources.getResourceAsStream("MyBatis.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			//SqlSession�ر�
			if(session!=null)
			{
				session.close();
			}
		}
	}
}
