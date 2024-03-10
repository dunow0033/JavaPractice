package DepartmentStore;


public class Item {
	 public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(Double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public Item()
	{
	
	}
	
	protected String itemName;
	 protected String category;
	 protected Double buyingPrice;
}
