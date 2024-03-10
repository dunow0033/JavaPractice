package DepartmentStore;

public class Product extends Item {
	
	public Product()
	{
		
	}
	
	public Product(int productid, String productname, int availableQuantity) {
		this.productid = productid;
		this.productname = productname;
		this.availableQuantity = availableQuantity;
	}
	
	private int productid;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public double getSellingPrice() {
		this.sellingPrice = (this.getBuyingPrice()*0.05)+this.getBuyingPrice();

		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		
	}
	
	private double sellingPrice;


	private String productname;
	private int availableQuantity;
	
}
