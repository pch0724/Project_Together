package customDAO;

public class DogInfo {

	static String dName;
	static String dAge;
	static String dGender;
	static String dChip;
	static int dPhoto;

	public DogInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public DogInfo(String dName, String dAge, String dGender, String dChip, int dPhoto) {
		this.dName = dName;
		this.dAge = dAge;
		this.dGender = dGender;
		this.dChip = dChip;
		this.dPhoto = dPhoto;
	}


	public static String getdName() {
		return dName;
	}

	public static void setdName(String dName) {
		DogInfo.dName = dName;
	}

	public static String getdAge() {
		return dAge;
	}

	public static void setdAge(String dAge) {
		DogInfo.dAge = dAge;
	}

	public static String getdGender() {
		return dGender;
	}

	public static void setdGender(String dGender) {
		DogInfo.dGender = dGender;
	}

	public static String getdChip() {
		return dChip;
	}

	public static void setdChip(String dChip) {
		DogInfo.dChip = dChip;
	}

	public static int getdPhoto() {
		return dPhoto;
	}

	public static void setdPhoto(int dPhoto) {
		DogInfo.dPhoto = dPhoto;
	}

	

}