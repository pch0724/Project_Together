package customDAO;

import java.io.File;
import java.util.ArrayList;

public class CustomDAO {

	private static ArrayList<CustomerInfo> customList;

	public static ArrayList<CustomerInfo> getCustomList() {
		return customList;
	}

	public static void setCustomList(ArrayList<CustomerInfo> customList) {
		CustomDAO.customList = customList;
	}

	public CustomDAO() {
		if (customList == null) {
			init();
		}
	}

	private void init() { // 초기 정보

		customList = new ArrayList<>();
		customList.add(new CustomerInfo("박창훈", "a", "a", 1, 1));
		/*
		 * customList.add(new CustomerInfo("1", "1", "1",0,"NORMAL"));
		 * customList.add(new CustomerInfo("2", "2", "2",0, "NORMAL"));
		 * customList.add(new CustomerInfo("3", "3", "3",0,"NORMAL"));
		 * customList.add(new CustomerInfo("4", "4", "4",0,"NORMAL"));
		 */
	}

	// login 확인 -> id, pw 맞으면 true | 틀리면 false
	public MyInfo loginCheck(String id, String pw) {

		for (int i = 0; i < customList.size(); i++) {

			if (customList.get(i).getId().equals(id) && customList.get(i).getPw().equals(pw)) {

				return new MyInfo(customList.get(i).getName(), id, pw, customList.get(i).getAddr(),
						customList.get(i).getPet());

			}

		}
		return new MyInfo();

	}

	public boolean checkId(String id) {

		for (int i = 0; i < customList.size(); i++) {
			if (customList.get(i).getId().equals(id)) {

				return false;
			}
		}

		return true;

	}

	public void registCustomer(String name, String id, String pw, int addr, int pet) {

		customList.add(new CustomerInfo(name, id, pw, addr, pet));

	}

	public boolean removeCustomer(String id) {

		for (int i = 0; i < customList.size(); i++) {
			if (customList.get(i).getId().equals(id)) {
				customList.remove(i);
				File targetFolder = new File("./Diary/"+id);
				boolean isDelete = deleteDirectoryAndFiles(targetFolder);
				return false;
			}
		}

		return true;

	}
    private boolean deleteDirectoryAndFiles(File targetFolder) {
        if(!targetFolder.exists()) {
            return false;
        }
        
        File[] files = targetFolder.listFiles();
        for(File file : files) {
            if(file.isDirectory()) {
                deleteDirectoryAndFiles(file);
            }
            file.delete();
        }
        
        return targetFolder.delete();
    }	
	
	

	public String findId(String name) {

		for (int i = 0; i < customList.size(); i++) {
			if (customList.get(i).getName().equals(name)) {
				return customList.get(i).getId();
			}
		}
		return null;
	}

	public String findPw(String id) {

		for (int i = 0; i < customList.size(); i++) {
			if (customList.get(i).getId().equals(id)) {
				return customList.get(i).getPw();
			}
		}

		return null;

	}

}
