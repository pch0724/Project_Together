package customDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DogDAO {

	public static ArrayList<DogInfo> DogList;
	
	public static Map<String, ArrayList<DogInfo>> DogMap = new HashMap<String, ArrayList<DogInfo>>();
	
	public static ArrayList<DogInfo> getDogList(String userId) {
		return DogMap.get(userId);
	}
	
	
	public DogDAO(String userId) {
		if(DogMap.get(userId) == null) {
			init(userId);
		}
	}
	
	private void init(String userId) {
		DogMap.put(userId, new ArrayList<>());
		
	}
	
	public void registDog(String userId, DogInfo dog) {
		
		for(int i = 0; i < DogMap.get(userId).size(); i++) {
				
		
		}
		
	}
}
