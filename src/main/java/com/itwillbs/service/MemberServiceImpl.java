package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	// DAO-Controller 연결
	
	// DAO 객체 접근 필요함 => 의존관계
	@Inject
	private MemberDAO mdao;
	
	@Override
	public void memberJoin(MemberVO vo) {

		mdao.insertMember(vo);
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {

		MemberVO resultvo = mdao.loginMember(vo);
		
		return resultvo;
		
	}

	@Override
	public MemberVO getMember(String id) {

		return mdao.getMember(id);
	}

	@Override
	public Integer memberModify(MemberVO uvo) {
		
		return mdao.updateMember(uvo);
	}

	@Override
	public Integer memberRemove(MemberVO dvo) {

		return mdao.deleteMember(dvo);
	}

	@Override
	public List<MemberVO> getMemberList() {
		
		return mdao.getMemberList();
	}

}
