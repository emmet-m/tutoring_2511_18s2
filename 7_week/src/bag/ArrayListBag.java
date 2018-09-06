package bag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayListBag<E> implements Bag<E> {
	
	private final ArrayList<E> items;

	public ArrayListBag() {
		this.items = new ArrayList<>();
	}

	
	public boolean add(E e) {
		return items.add(e);
	}
	
	public boolean contains(E o) {
		return items.contains(o);
	}

	public Iterator<E> iterator() {
		return this.items.iterator();
	}

	public long size() {
		return this.items.size();
	}
	
	public boolean remove(E o) {
		return this.items.remove(o);
	}

	//
	// TODO TODO TODO TODO TODO TODO
	// TODO: EXPLAIN THIS          V
	public boolean containsAll(Bag<?> other) {
		HashMap<Object, Long> myCount = new HashMap<>();
		
		for (Object o : this.items) {
			if (!myCount.containsKey(o))
				myCount.put(o, new Long(0));
			myCount.put(o, new Long(myCount.get(o).longValue() + 1));
		}

		for (Object o : other) {
			if (!myCount.containsKey(o))
				myCount.put(o, new Long(0));
			myCount.put(o, new Long(myCount.get(o).longValue() + 1));
		}
		
		
		return false;
	}
	
	public Bag<E> union(Bag<E> other) {
		// TODO
		return null;
	}
	
	public Bag<E> intersection(Bag<E> other) {
		// TODO
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		//TODO
		return false;
	}
}
