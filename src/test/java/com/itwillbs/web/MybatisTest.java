package com.itwillbs.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MybatisTest {
	
	// DB연결( + Mybatis) => SqlSessionFactory 객체
	@Inject
	private SqlSessionFactory sqlFactory;
	
	// DAO 객체 생성 -> 객체(MemberDAOImpl) 주입
	// MemberDAO dao = new MemberDAOImpl();
	@Inject
	private MemberDAO mdao;
	
	@Test
	public void test_SqlSessionFactory() throws Exception {
		System.out.println(sqlFactory);
	}
	
	@Test
	public void test_sqlDBConnect() throws Exception {
		
		// DB연결
		SqlSession sqlSession =  sqlFactory.openSession();
		
		System.out.println(sqlSession);
	}
	
	@Test
	public void 디비시간정보조회() throws Exception {
//		SqlSession sqlSession =  sqlFactory.openSession();
//		
//		sqlSession.selectOne(statement);
		// => DAO 처리
		mdao.getTime();
		
	}

}
