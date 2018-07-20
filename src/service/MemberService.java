package service;

import java.util.*;

import domain.*;

public interface MemberService {
	public void createMember(MemberBean bean);
	public List<MemberBean> listMember();
	public List<MemberBean> findMemberByWord(String word);
	public MemberBean findMemberById(String id);
	public int countMember();
	public void updateMember(MemberBean bean);
	public void deleteMember(MemberBean bean);
	public boolean login(MemberBean bean);
	
}
