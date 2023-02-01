package customDAO;

import java.util.*;

public class CustomDAO {
	
	private static ArrayList<CustomerInfo> customList;
	
	public static ArrayList<CustomerInfo> getCustomList() {
		
		return customList;
		
	}
	
	public static void setCustomList(ArrayList<CustomerInfo> customList) {
		
		CustomDAO.customList = customList;
		
	}
	
	public CustomDAO() {
		
		if(customList == null) {
			
			init();
			
		}
		
	}
	
	private void init() { // 초기정보
		
		customList = new ArrayList<>();
	}
	
	// Login check -> id, pw same true or id, pw different false
	public MyInfo loginCheck(String id, String pw) {
		
		for (int i = 0; i < customList.size(); i++) {
			
			if (customList.get(i).getId().equals(id) && customList.get(i).getPw().equals(pw)) {
				
				return new MyInfo(customList.get(i).getName(), id, pw, customList.get(i).getAddr());
			}
		}return new MyInfo();
	}
	
	//id same check
	public boolean checkId(String id) {
		
		for(int i = 0; i < customList.size(); i++) {
			if(customList.get(i).getId().equals(id)) {
				
				return false;
			}
		}return true;
	}
	
	public void registCustomer(String name, String id, String pw, String addr) {
		
		customList.add(new CustomerInfo(name, id, pw, addr));
		
	}
	
	//findid
	public String findId(String name) {
		
		for(int i = 0; i < customList.size(); i++) {
			if (customList.get(i).getName().equals(name)) {
				
				return customList.get(i).getId();
				
			}
			
		}return null;
		
	}
	
	//findpw
	public String findPw(String id) {
		
		for(int i = 0; i < customList.size(); i++) {
			
			if(customList.get(i).getId().equals(id)) {
				
				return customList.get(i).getPw();
				
			}
			
		}return null;
	}
}
