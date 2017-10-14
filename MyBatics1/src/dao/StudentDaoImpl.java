package dao;

import org.apache.ibatis.session.SqlSession;

import beans.Student;
import util.MyBatisUtil;

public class StudentDaoImpl implements IStudentDao {

	private SqlSession sqlSession;

	@Override
	public void insertStu(Student student) {
		try {
			sqlSession = MyBatisUtil.getSqlSession();
			sqlSession.insert("insertStudent", student);
			sqlSession.commit();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}

}