package customDAO;

public class CustomerInfo {
	
	String name;
	String id;
	String pw;
	String addr;
	
	public CustomerInfo(String name, String id, String pw, String addr) {
		this.name = name;
		this.id = id;
		this.pw = pw;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
