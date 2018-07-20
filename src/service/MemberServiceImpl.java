package service;

import java.util.*;

import dao.*;
import domain.*;

public class MemberServiceImpl implements MemberService {
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {return instance;}
	public MemberServiceImpl() {
	
	}
	
	@Override
	public void createMember(MemberBean bean) {
		MemberDaoImpl.getInstance().insertMember(bean);
	}

	@Override
	public List<MemberBean> listMember() {
		return MemberDaoImpl.getInstance().listMember();
	}

	@Override
	public List<MemberBean> findMemberByWord(String word) {
		return MemberDaoImpl.getInstance().selectMemberByWord(word);
	}

	@Override
	public MemberBean findMemberById(String id) {
		return MemberDaoImpl.getInstance().selectMemberById(id);
	}

	@Override
	public int countMember() {
		return MemberDaoImpl.getInstance().countMember();
	}

	@Override
	public void updateMember(MemberBean bean) {
		MemberDaoImpl.getInstance().updateMember(bean);
	}

	@Override
	public void deleteMember(MemberBean bean) {
		MemberDaoImpl.getInstance().deleteMember(bean);
	}

	@Override
	public boolean login(MemberBean bean) {
		boolean flag = false;
		if(MemberDaoImpl.getInstance().login(bean)!=null) {
			flag = true;
		}else {
			flag=false;
		}
		
		return flag;
	}

}
