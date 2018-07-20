package dao;

import java.util.*;

import domain.*;

public interface MemberDao {
	public void insertMember(MemberBean bean);
	public List<MemberBean> listMember();
	public List<MemberBean> selectMemberByWord(String word);
	public MemberBean selectMemberById(String id);
	public int countMember();
	public void updateMember(MemberBean bean);
	public void deleteMember(MemberBean bean);
	public MemberBean login(MemberBean bean);
	
}
