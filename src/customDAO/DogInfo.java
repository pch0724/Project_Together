package customDAO;

public class DogInfo {
	
	String dName;
	int dAge;
	boolean dGender;
	
	DogInfo(){
		this.dName = "";
	}
	
	DogInfo(String dName, int dAge, boolean dGender){
		this.dName = dName;
		this.dAge = dAge;
		this.dGender = dGender;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdAge() {
		return dAge;
	}

	public void setdAge(int dAge) {
		this.dAge = dAge;
	}

	public boolean isdGender() {
		return dGender;
	}

	public void setdGender(boolean dGender) {
		this.dGender = dGender;
	}
	
	
}
