package collections.day3;

import java.util.*;

public class ProductMain {
	private Map<Integer,Product> mapproduct;
	private Scanner sc;
	public ProductMain()
	{
		sc = new Scanner(System.in);
		mapproduct = new HashMap<>();
	}
	public void insert()
	{
		System.out.println("Enter how many products u want to have ");
		
		int noofproduct=sc.nextInt();
		
		for(int x = 1;x <= noofproduct;x++)
		{
			Product p=new Product();
			System.out.println("Enter Product id ");
			int productid=sc.nextInt();
			p.setProductid(productid);
			System.out.println("Enter Product name ");
			p.setProductname(sc.next());
			System.out.println("Enter Price ");
			p.setPrice(sc.nextDouble());
			System.out.println("Enter quantity ");
			p.setQuantity(sc.nextInt());
			mapproduct.put(productid, p);
		}
	}
	public void display()
	{
		Set<Map.Entry<Integer, Product>> productdetails=mapproduct.entrySet();
		for(Map.Entry<Integer, Product> prd:productdetails)
		{
			System.out.println("Key is "+prd.getKey());
			Product p=prd.getValue();
			System.out.println("Product name is "+p.getProductname());
			System.out.println("Price is "+p.getPrice());
		}
	}
	public void deleteData()
	{
		System.out.println("Enter product id which u want to delete");
		int productid=sc.nextInt();
		mapproduct.remove(productid);
	}
	public static void main(String[] args) {
		ProductMain pmain=new ProductMain();
		pmain.insert();
		pmain.display();
		pmain.deleteData();
		pmain.display();
	}
	
	

}
