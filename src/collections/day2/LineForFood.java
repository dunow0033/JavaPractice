package collections.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LineForFood<T> implements Queue<T>  {
	
	LinkedList<T> line;
	
	public LineForFood() {
        line = new LinkedList<>();
    }

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return line.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return line.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return line.contains(o);
	}

	@Override
	public Iterator<T> iterator() {
		
		if(line != null)
		{
			return line.iterator();
		}
		else return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return line.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return line.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return line.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return line.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return line.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return line.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return line.retainAll(c);
	}

	@Override
	public void clear() {
		line.clear();
	}

	@Override
	public boolean add(T e) {
		if(line != null)
		{
			return line.add(e);
		}
		else return false;
	}

	@Override
	public boolean offer(T e) {
		// TODO Auto-generated method stub
		return line.offer(e);
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return line.remove();
	}

	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return line.poll();
	}

	@Override
	public T element() {
		// TODO Auto-generated method stub
		return line.element();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return line.peek();
	}
	
	public static void main(String args[])
	{
		LineForFood<String> line = new LineForFood<>();
		line.add("Tom");
		line.add("Brad");
		line.add("Stephen");
		line.add("Henry");
		
		System.out.println("Line so far:  ");
		
		for(String s:line)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("Brad decided against food for now");
		
		line.remove("Brad");
		
		System.out.println("Line now:  ");
		
		for(String s:line)
		{
			System.out.println(s);
		}
	}
}
