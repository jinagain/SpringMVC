package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.MemberVO;

// persistence 영속성 -> DB 관련 처리

public interface MemberDAO {
	// 필요한 동작들을 추상메서드 사용하여 정의
	
	// DB 시간정보 조회
	public String getTime();
	
	// C - 회원정보 가입
	public void insertMember(MemberVO vo);
	
	// R - 로그인 (회원정보 조회)
	public MemberVO loginMember(MemberVO vo);
	public MemberVO loginMember(String id, String pw);
	
	// U - 회원정보 수정
	public Integer updateMember(MemberVO uvo);
	
	// D - 회원정보 삭제
	public Integer deleteMember(MemberVO dvo);

	public MemberVO getMember(String id);

	public List<MemberVO> getMemberList();
}
