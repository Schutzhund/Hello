package servlet;

public class ShoppingCart {
	private Integer id;
	private String name;
	private String location;
	private String details;
	
	public ShoppingCart(Integer id, String name, String location, String details) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.details = details;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
	
}
