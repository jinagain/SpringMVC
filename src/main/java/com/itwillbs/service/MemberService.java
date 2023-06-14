package com.itwillbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itwillbs.domain.MemberVO;

// @Service : 스프링(root-context.xml)에서 해당 객체를 서비스 객체로 인식하도록 설정

@Service
public interface MemberService {
	
	// 구현동작 설계
	public void memberJoin(MemberVO vo);
	
	// 로그인
	public MemberVO memberLogin(MemberVO vo); // vo -id, pw만 저장

	// 
	public MemberVO getMember(String id);

	public Integer memberModify(MemberVO uvo);

	public Integer memberRemove(MemberVO dvo);

	public List<MemberVO> getMemberList();

}
