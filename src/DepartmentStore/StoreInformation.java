package DepartmentStore;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StoreInformation {
	
	ValidateUser valid;
	Scanner sc;
	int noofproduct;
	
	public static Map<Integer, Product> productMap;
	
	public static ArrayList<Product> listOfProducts;
	
	public StoreInformation() 
	{
		sc = new Scanner(System.in);
		Product greetingCard = new Product(13, "greeting_card", 50);
		Product birthdayCard = new Product(15, "birthday_card", 50);
		greetingCard.setCategory("Stationary");
		greetingCard.setBuyingPrice(3.99);
		
		birthdayCard.setCategory("Stationary");
		birthdayCard.setBuyingPrice(3.99);
		
		Product deodorant = new Product(21, "deodorant", 35);
		Product toothbrush = new Product(23, "toothbrush", 35);
		Product toothpaste = new Product(25, "toothpaste", 35);
		
		deodorant.setCategory("Toiletries");
		deodorant.setBuyingPrice(3.99);
		
		toothbrush.setCategory("Toiletries");
		toothbrush.setBuyingPrice(3.99);
		
		toothpaste.setCategory("Toiletries");
		toothpaste.setBuyingPrice(3.99);
		
		Product milk = new Product(31, "milk", 25);
		Product eggs = new Product(32, "eggs", 25);
		
		milk.setCategory("Groceries");
		milk.setBuyingPrice(3.99);
		
		eggs.setCategory("Groceries");
		eggs.setBuyingPrice(3.99);
		
		Product broccoli = new Product(41, "broccoli", 20);
		Product carrots = new Product(42, "carrots", 25);
		
		broccoli.setCategory("Vegetables");
		broccoli.setBuyingPrice(3.99);
		
		carrots.setCategory("Vegetables");
		carrots.setBuyingPrice(3.99);
		
		productMap = new HashMap<Integer, Product>();
		
		productMap.put(13, greetingCard);
		productMap.put(15, birthdayCard);
		productMap.put(21, deodorant);
		productMap.put(23, toothbrush);
		productMap.put(25, toothpaste);
		productMap.put(31, milk);
		productMap.put(32, eggs);
		productMap.put(41, broccoli);
		productMap.put(42, carrots);
		
		listOfProducts = new ArrayList<>();
        
		listOfProducts.add(greetingCard);
        listOfProducts.add(birthdayCard);
        listOfProducts.add(deodorant);
        listOfProducts.add(toothbrush);
        listOfProducts.add(toothpaste);
        listOfProducts.add(milk);
        listOfProducts.add(eggs);
        listOfProducts.add(broccoli);
        listOfProducts.add(carrots);
		
	}
	
	public User registerNewUser() {
		
	    System.out.println("OK, great, you want to register as a new user."); 
	    System.out.println("------------------------------"); 
	    System.out.println();
	    
	    	System.out.println("Please enter your first name: ");
	    	String firstName = sc.next();
	    	System.out.println("Please enter your last name: ");
	    	String lastName = sc.next();
	    	System.out.println("Please enter your email: ");
	    	String emailId = sc.next();
	    	System.out.println("Please enter your username, it must begin with a letter, then have "
	    			+ "any combination of letters and numbers, and be at least 7 characters: ");
	    	
	    	String username = sc.next();
	    	while(!username.matches("^[a-zA-Z][a-zA-Z0-9]{6,}$"))
	    	{
	    		System.out.println("Sorry, that didn't meet the requirements, please try again!!");
	    		System.out.println("Please enter your username:  ");
	    		username = sc.next();
	    	}
	    	
	    	System.out.println("Password requirements are same as username requirements: ");
	    	String password = sc.next();
	    	while(!password.matches("^[a-zA-Z][a-zA-Z0-9]{6,}$"))
	    	{
	    		System.out.println("Sorry, that didn't meet the requirements, please try again!!");
	    		System.out.println("Please enter your password:  ");
	    		password = sc.next();
	    	}
	    	
	    	System.out.println("Thank you " + firstName + " " + lastName + ".  Your username is '" + username + "' and your password is '" + password + "'.");
	    
	    	User user = new User(firstName, lastName, username, emailId, password);
	    	MainStore.users.add(user);
	    	return user;
	    
	}
	
	//This method can be used to insert our own records in array
		public Map<Integer,Product> adminStoreData()
		{
			System.out.println("How many products do you want to store");
			noofproduct = sc.nextInt();
			System.out.println("coming in to store the data method");
				for(int x = 1;x < noofproduct;x++)
				{
				Product p1 = new Product();
				System.out.println("Enter product id ");
				int productid=sc.nextInt();
				p1.setProductid(productid);
				System.out.println("Enter Product name ");
				p1.setProductname(sc.next());
				System.out.println("Enter Available Quantity ");
				p1.setAvailableQuantity(sc.nextInt());
				System.out.println("Enter Category");
				p1.setCategory(sc.next());
				System.out.println("Enter Buying price ");
				p1.setBuyingPrice(sc.nextDouble());
				productMap.put(productid,p1);
			}
			return productMap;
		}
	
	public void adminDisplayAllProducts()
	{
		
		Set<Map.Entry<Integer,Product>> mapset=productMap.entrySet();
		System.out.println("Displaying All Products ");
		for(Map.Entry<Integer,Product> p1:mapset)
		{
		
		
			Product pprd=p1.getValue();
			System.out.println("Product name is " + pprd.getProductname());
			System.out.println("Product Quantity is " + pprd.getAvailableQuantity());
			System.out.println("Buying price is " + pprd.getSellingPrice());
			
		}
	}
	
	public void viewProducts()
	{
		int filter;
		
		System.out.println("Select filter to view the products:");
		System.out.println("1. Price");
		System.out.println("2. Category");
		filter = sc.nextInt();
		
		if(filter == 1)
		{
			
			listOfProducts.stream()
	        	.sorted(Comparator.comparingDouble(Product::getSellingPrice))
	        	.forEach(product -> System.out.println("Product: " + product.getProductname() + ", Price: " 
	        		+ product.getSellingPrice() + ", Quantity: " + product.getAvailableQuantity()));
		
		} else if(filter == 2) {
			
			while(true) {
				System.out.println("Ok, great, please select a category to view: ");
				System.out.println("1. Grocery");
				System.out.println("2. Stationary");
				System.out.println("3. Toiletry");
				System.out.println("4. Vegetables");
			
				filter = sc.nextInt();
			
				String categoryName = "";
			
				switch (filter) {
	            	case 1:
	            		categoryName = "Groceries";
	            		break;
	            	case 2:
	            		categoryName = "Stationary";
	            		break;
	            	case 3:
	            		categoryName = "Toiletries";
	            		break;
	            	case 4:
	            		categoryName = "Vegetables";
	            		break;
				}

				final String finalCategoryName = categoryName;
	        
				listOfProducts.stream()
	                .filter(product -> finalCategoryName.equals(product.getCategory()))
	                .forEach(product -> System.out.println("Product: " + product.getProductname() + ", Price: "
	                        + product.getSellingPrice() + ", Quantity: " + product.getAvailableQuantity()));
	        
				System.out.println("Would you like to see a different category? ");
	        
				String reply = sc.next();
	        
		        if(reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y"))
		        {
		        	continue;
		        }
		        else
		        {
		        	break;
				}
			}
		}
	}
	
	public void adminListProducts()
	{
		for(Map.Entry<Integer, Product> entry : productMap.entrySet())
		{
		    Product product = entry.getValue();
			
			System.out.println("Product Name: " + product.getProductname());
			System.out.println("Product Quantity: " + product.getAvailableQuantity());
			System.out.println("Product Price: " + product.getBuyingPrice());
			System.out.println("--------------------------");
			System.out.println("--------------------------");
		}
	}
	
	public void adminSearchById() 
	{		
		System.out.println("Admin - Search By Product ID: ");
		System.out.println("----------------------------");
		System.out.print("Please enter the product ID you want to search for: ");
		int productID = sc.nextInt();
		
		Product foundProduct = productMap.get(productID);
		
		if (foundProduct != null) {
			System.out.println();
			System.out.println("----------------------------");
			System.out.println("Result: ");
	        System.out.println("Product ID: " + foundProduct.getProductid());
	        System.out.println("Product Name: " + foundProduct.getProductname());
	        System.out.println("Selling Price: " + foundProduct.getSellingPrice());
	        System.out.println("Available Quantity: " + foundProduct.getAvailableQuantity());
	        System.out.println("-------------------------------------");
	        System.out.println();
	    } else {
	    	System.out.println();
			System.out.println("----------------------------");
			System.out.println("Result: ");
	        System.out.println("Product with ID " + productID + " not found.");
	        System.out.println("-------------------------------------");
	        System.out.println();
	    }
	}
	
	public void adminListProductsByCategory()
	{
		int choice;
		boolean looping = true;
		
		System.out.println();
		System.out.println("Admin - List Products By Category: ");
		System.out.println("----------------------------");
		
		
		while(looping) {
			
			System.out.println();
			System.out.println("------------------------");
			System.out.println("Please enter the Category you want to list the products in: ");
			System.out.println("1. Grocery ");
			System.out.println("2. Stationary ");
			System.out.println("3. Toiletries ");
			System.out.println("4. Vegetables ");
			System.out.println("5. Last menu ");
			choice = sc.nextInt();
			
			String categoryName = "";
			
	        switch (choice) {
	            case 1:
	                categoryName = "Groceries";
	                break;
	            case 2:
	                categoryName = "Stationary";
	                break;
	            case 3:
	                categoryName = "Toiletries";
	                break;
	            case 4:
	                categoryName = "Vegetables";
	                break;
	            case 5:
	            	looping = false;
	            	break;
	            default:
	            	System.out.println("Invalid selection, please try again!!");
	            	continue;
	        }

	        final String finalCategoryName = categoryName;
	        
	        System.out.println();
	        System.out.println("Category: " + finalCategoryName);
	        System.out.println("------------------------");
	        
	        listOfProducts.stream()
	                .filter(product -> finalCategoryName.equals(product.getCategory()))
	                .forEach(product -> System.out.println("Product: " + product.getProductname() + ", Price: "
	                        + product.getSellingPrice() + ", Quantity: " + product.getAvailableQuantity()));
	        
		}
	}
	
	public void adminSearchProductsByName()
	{
		boolean looping = true;
		
		System.out.println();
		System.out.println("Admin - Search Products By Name: ");
		System.out.println("----------------------------");
		
		while(looping) {
			
			System.out.println();
			System.out.println("------------------------");
			System.out.println("Please enter the Product you want to see details for: ");
			
			final String choice = sc.next();
	        
	        productMap.values().stream()
	        .filter(product -> product.getProductname().equalsIgnoreCase(choice))
	        .forEach(product -> {
	        	System.out.println("Product ID: " + product.getProductid());
                System.out.println("Product Name: " + product.getProductname());
                System.out.println("Selling Price: " + product.getSellingPrice());
                System.out.println("Available Quantity: " + product.getAvailableQuantity());
	        });
	        
	        System.out.println();
	        System.out.println("Do you want to search for another product? (yes/no)");
	        String response = sc.next();
	        if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
	            looping = false;
	        }
		}
	}
	
	public void adminCalculateProfit() 
	{
		
		System.out.println("Enter category for which you want to see profit: ");
		System.out.println();
		String category = sc.next();
		double profit = 0;
		Set<Map.Entry<Integer,Product>> mapset = productMap.entrySet();
		
		for(Map.Entry<Integer,Product> p1 : mapset)
		{
			Product productdetail = p1.getValue();
			if(productdetail.getCategory().equals(category))
			{
				profit = productdetail.getSellingPrice() - productdetail.getBuyingPrice();
			}
		
			
		}
		System.out.println("Profit is " + profit);
		System.out.println("----------------");
		System.out.println();
		
	}
	
	public void adminTotalAmountOnProduct()
	{
		double totalamount=0;
	
		Set<Map.Entry<Integer,Product>> mapset = productMap.entrySet();
		for(Map.Entry<Integer,Product> p1:mapset)
		{
			Product productdetail = p1.getValue();
			totalamount = totalamount+(productdetail.getBuyingPrice()*productdetail.getAvailableQuantity());
			
		}
		System.out.println("Total Amount Spent On Product " + totalamount);
		System.out.println("----------------");
		System.out.println();
		
	}
	
	public void adminMenu()
	{
		
		int option;
		boolean looping = true;
		
		System.out.println(String.format("Welcome admin, what would you like to do today?"));
		//System.out.println("Welcome " + name + "!!  What would you like to do today?");
		
		while(looping)
		{
			System.out.println("1. Admin - List Products ");
			System.out.println("2. Admin - Search By Product ID ");
			System.out.println("3. Admin - List Products By Category ");
			System.out.println("4. Admin - Search Products By Name ");
			System.out.println("5. Exit");
			
			option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					adminListProducts();
					break;
				case 2:
					adminSearchById();
					break;
				case 3:
					adminListProductsByCategory();
					break;
				case 4:
					adminSearchProductsByName();
					break;
				case 5:
					System.out.println("Thank you....bye!!");
					looping = false;
					break;
				default:
					System.out.println("Invalid selection, please try again!!");
					continue;
			}
		}
	}
	
}
