package functionalinterfaces;

import java.util.*;

public class SquareExample {
	
	private List<Integer> intList;
	
	public SquareExample()
	{
		intList = Arrays.asList(12, 32, 31, 97, 14);
	}
	
	public void calculateSquare()
	{
		intList.stream().map(data -> (data * data)).forEach(num ->
		{
			System.out.println("Square is " + num);
		});
	}
	
	public static void main(String[] args) {
		SquareExample squares = new SquareExample();
		squares.calculateSquare();
	}
}
