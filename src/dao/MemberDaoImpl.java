package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import domain.*;
import enums.*;
import factory.*;
import pool.DBConstant;

public class MemberDaoImpl implements MemberDao{
	private static MemberDaoImpl instance = new MemberDaoImpl();
	public static MemberDaoImpl getInstance() {return instance;}
	public MemberDaoImpl() {
	}

	@Override
	public void insertMember(MemberBean bean) {
		try {
			DatabaseFactory.createDatabase(Vendor.ORACLE,DBConstant.USERNAME, DBConstant.PASSWORD)
			.getConnection().createStatement().executeQuery("");
		} catch (Exception e) {e.printStackTrace();}
	}

	@Override
	public List<MemberBean> listMember() {
		List<MemberBean> lst =new ArrayList<>();
		try {
			DatabaseFactory.createDatabase(Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
			.getConnection().createStatement().executeUpdate("");
		} catch (Exception e) {e.printStackTrace();}
		return lst;
	}

	@Override
	public List<MemberBean> selectMemberByWord(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMember(MemberBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberBean login(MemberBean bean) {
		MemberBean m = null;
		try {
			ResultSet rs = 
			DatabaseFactory.createDatabase(Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
			.getConnection().createStatement().executeQuery(String.format(SQLs.LOGIN.toString(),bean.getUserid(),bean.getPassword()));
			while(rs.next()) {
				m.setUserid(rs.getString("USERID"));
				m.setName(rs.getString("NAME"));
				m.setSsn(rs.getString("SSN"));
				m.setPassword(rs.getString("PASSWORD"));
				m.setTeamId(rs.getString("TEAMNAME"));
			}
		} catch (Exception e) {e.printStackTrace();}
		
		return m;
	}

}
