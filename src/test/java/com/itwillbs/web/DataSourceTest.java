package com.itwillbs.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
// -> Spring, JUnit4를 사용해서 테스트 하겠다.
//@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
// -> 프로젝트(파일) 실행에 필요한 설정정보의 위치

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DataSourceTest {
	
	// DB 연결정보(객체)가 필요함
	// DataSourceTest는 DB 연결정보(객체)필요함
	// => DataSourceTest는 DB 연결정보(객체)에 의존적이다 (의존관계 O)
	// => 객체 생성(x) => 의존관계 주입(O)
	
//	private DataSource ds = new DataSource(); (x)
	
	// 객체 의존관계 주입(DI)
	//@Inject : 스프링이 생성해놓은 객체를 자동 주입
	
//	@Inject
	@Autowired
	private DataSource ds;
	
	// DB연결 테스트
	@Test
	public void testConnect() throws Exception{
		System.out.println("연결객체 : " + ds);
		
		Connection con = ds.getConnection();
		
		System.out.println("DB 연결 성공!");
		System.out.println("con : " + con);
	}

}
