package customDAO;

public class MyInfo {
	
	String name;
	String id;
	String pw;
	int addr;

	MyInfo() {
		this.id = "";
	}
	
	MyInfo(String name, String id, String pw, int addr/*, boolean pet*/) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.addr=addr;
		//this.pet = pet;
		
		
	}
	

	public int getAddr() {
		return addr;
	}

	public void setAddr(int addr) {
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
