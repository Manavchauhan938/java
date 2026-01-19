package corejava;


class pojo{
	
	private int id;
	private String name;
	private String address;
	private String city;
	
	
	// setter - value set // getter - for data call or for get
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
		
}

public class advanceencapsulation {

	public static void main(String[] args) {
		
		pojo p= new pojo();
		
		p.setId(1);
		p.setAddress("ghatlodia");
		p.setCity("ahmedabad");
		p.setName("manav");
		
		System.out.println(p.getAddress()+" "+ p.getCity()+" " + p.getId()+ " "+ p.getName());

	}

}
