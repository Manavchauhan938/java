package corejava;

class po {
	
	private int id;
	private String name;
	private String state;
	
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
}



public class advenc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		po i= new po();
		
		i.setId(4);
		i.setName("akanksha");
		i.setState("gujarat");
		
		System.out.println(i.getId()+" "+ i.getName()+" "+ i.getState());
		
		
	}

}
