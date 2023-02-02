package customDAO;

public class DogInfo {

	String dName;
	int dAge;
	boolean dGender;
	boolean dChip;
	int dPhoto;
	
	
	public DogInfo(String dName, int dAge, boolean dGender, boolean dChip, int dPhoto) {
		this.dName = dName;
		this.dAge = dAge;
		this.dGender = dGender;
		this.dChip = dChip;
		this.dPhoto = dPhoto;
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


	public boolean isdChip() {
		return dChip;
	}


	public void setdChip(boolean dChip) {
		this.dChip = dChip;
	}


	public int getdPhoto() {
		return dPhoto;
	}


	public void setdPhoto(int dPhoto) {
		this.dPhoto = dPhoto;
	}
	
	
	
}
