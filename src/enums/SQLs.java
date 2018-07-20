package enums;

public enum SQLs {
	LOGIN, JOIN, LIST, SEARCH, LETERIVE,
	COUNT, UPDATE, DELETE;
	
	@Override
	public String toString() {
		String query = "";
		switch (this) {
		case LOGIN:
			query = "SELECT MEM_ID USERID, " + 
					"NAME, " + 
					"SSN, " + 
					"PASSWORD, " + 
					"TEAM_ID TEAMNAME " + 
					"FROM MEMBER " + 
					"WHERE MEM_ID LIKE '%s' " + 
					"AND PASSWORD LIKE '%s' ";
			break;
		case JOIN:
					
			break;
		case LIST:
			
			break;
		case SEARCH:
			
			break;
		case LETERIVE:
			
			break;
		case COUNT:
			
			break;
		case UPDATE:
			
			break;
		case DELETE:
			
			break;
			

		default:
			break;
		}
		return query;
	}
	
}
