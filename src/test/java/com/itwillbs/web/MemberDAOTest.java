package com.itwillbs.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemberDAOTest {
	// 생성해놓은 기능 호출
	
	// Logger - 콘솔창에 메세지 출력
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOTest.class);
	
	// DAO 객체가 필요(의존관계) => 주입
	@Inject
	private MemberDAO mdao;
	
//	@Inject
//	private SqlSession sqlSession;
	
//	@Test
	public void 디비시간정보_조회() throws Exception {
		
		System.out.println(mdao.getTime());
		logger.info(mdao.getTime());
		
//		logger.error(msg);
//		logger.warn(msg);
//		logger.info(msg);
//		logger.debug(msg);
//		logger.trace(msg);
		
	}
	
//	@Test
	public void 로그레벨테스트() throws Exception {
		
		logger.warn("warn레벨 실행!");
		logger.info("info레벨 실행!");
		logger.debug("debug레벨 실행!");
	}
	
//	@Test
	public void 회원가입테스트() throws Exception {
		logger.debug(" 뷰에서 정보를 입력 받음 -> 생성");
		
		MemberVO vo = new MemberVO();
		vo.setUserid("itwill4");
		vo.setUserpw("1234");
		vo.setUsername("아이윌");
		vo.setUseremail("itwill4@itwill.com");
		
		logger.debug(" DAO - 회원가입 메서드 호출 ");
		// DAO 객체 주입
		mdao.insertMember(vo);
	}
	
//	@Test
	public void 로그인테스트() throws Exception {
		logger.debug(" 로그인 테스트 시작 ");
		
		// 로그인 계정
		MemberVO vo = new MemberVO();
		vo.setUserid("admin");
		vo.setUserpw("12343");
		
		// DAO - 로그인 체크하는 메서드 호출
		MemberVO resultVO = mdao.loginMember(vo);
		
		if(resultVO == null) {
			logger.debug("로그인 실패");
		}else {
			logger.debug("로그인 성공!");
		}
		logger.debug(" 로그인 테스트 끝 ");
	}
	
//	@Test
	public void 회원정보수정() throws Exception {
		logger.debug(" 회원 수정 테스트 시작 ");
		
		// 수정할 회원정보
		MemberVO uvo = new MemberVO();
		uvo.setUserid("admin");
		uvo.setUserpw("1234");
		uvo.setUsername("수정이름");
		uvo.setUseremail("ADMIN(수정)@admin.com");
		
		Integer result = mdao.updateMember(uvo);
		
		if(result == 1) {
			logger.debug(" 정상 수정 완료! ");
		}else {
			// result == 0
			logger.debug(" 정상 수정 실패! (아이디 or 비밀번호 오류)");
		}
		logger.debug(" 회원 수정 테스트 끝 ");
	}
	
	@Test
	public void 회원정보삭제() throws Exception {
		logger.debug(" 회원 삭제 테스트 시작 ");
		
		// 삭제할 회원정보
		MemberVO dvo = new MemberVO();
		dvo.setUserid("itwill2");
		dvo.setUserpw("1234");
		
		Integer result = mdao.deleteMember(dvo);
		
		if(result == 1) {
			logger.debug(" 회원 삭제 완료! ");
		}else {
			// result == 0
			logger.debug(" 회원 삭제 실패! (아이디 or 비밀번호 오류)");
		}
		logger.debug(" 회원 삭제 테스트 끝 ");
	}
	
}
