package collection;

public class customerpractice {

	public int custid;
	public String custname;
	public String custaddress;
	
	
	
	public customerpractice(int custid, String custname, String custaddress) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custaddress = custaddress;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}

	
	
}
