package customDAO;

import java.util.ArrayList;

public class DogDAO {

	private static ArrayList<DogInfo> dogList;
	
	public static ArrayList<DogInfo> getDogInfos(){
		return dogList;
	}
	
	public static void setDogList(ArrayList<DogInfo> doglist) {
		DogDAO.dogList = doglist;
	}
	
	public DogDAO() {
		if (dogList == null) {
			init();
		}
	}
	
	private void init() { // 초기 정보
		
		dogList = new ArrayList<DogInfo>();
		
	}
	
	public void registDog(String dName, int dAge, boolean dGender) {
		
		dogList.add(new DogInfo(dName, dAge, dGender));
	}
}
