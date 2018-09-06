package bag;

public interface Bag<E> extends Iterable<E> {
	
	/**
	 * Adds an element into the Bag.
	 * @param e Element to be added.
	 * @return True if operation was successful.
	 * @postcondition Size of current Bag will not decrease.
	 */
	boolean add(E e);
	
	/**
	 * Checks if the Bag contains the specified object.
	 * @param o The object to be checked.
	 * @return True if Bag contains an object equal to the given object.
	 */
	boolean contains(E o);

	boolean containsAll(Bag<?> other);
	
	/**
	 * Removes a single instance of the specified object from the Bag.
	 * @param o Object to be removed.
	 * @return True if removal was successful.
	 * @postcondition Size of current Bag will not increase.
	 */
	boolean remove(E o);
	
	/**
	 * Get the number of elements in the Bag.
	 * @return Number of elements in the Bag.
	 */
	long size();
	
	/**
	 * Unions this bag with another Bag.
	 * @param other Bag to be unioned with.
	 * @return New bag containing all the elements in the current bag and the other bag.
	 * @postcondition The size of the returned bag is equal to the sum of the sizes 
	 * 				  of the current bag and the other bag.		 
	 */
	Bag<E> union(Bag<E> other);
	
	/**
	 * Intersects this bag with another Bag.
	 * @param other Bag to be interesected with.
	 * @return New bag that contains all the common elements in the current bag and the
	 * 		   other bag.
	 * @postcondition The size of the returned bag is not larger than the minimum of the
	 * 				  size of the current bag and the other bag.
	 */
	Bag<E> intersection(Bag<E> other);
	
	@Override
	boolean equals(Object obj);
}
