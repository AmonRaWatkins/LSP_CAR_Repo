package Org.howard.edu.lsp.assignment6;
import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	//store the set elements in an ArrayList 
	private List<Integer> set = new
ArrayList<Integer>();
	
	//Default Constructor 
	public IntegerSet() {
}
	
	//Constructor to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set =set;
	}
	
	/**
     * Clears the internal representation of the set.
     */
	public void clear(){
		 set.clear(); //Clears ArrayList 
		}
	
	/**
     * Returns the length of the set (number of elements).
     * 
     * @return The length of the set.
     */
	public int length() {
		return set.size();
	}
	
	/**
     * Returns true if the 2 sets are equal, false otherwise. Two sets are equal
     * if they contain all of the same values in ANY order. This overrides the
     * equals method from the Object class.
     * 
     * @param o The object to compare to.
     * @return True if the sets are equal, false otherwise.
     */
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IntegerSet otherSet = (IntegerSet) o; // Cast the Object to IntegerSet
		if (set.size() != otherSet.set.size()) {
			return false; //Sets must have same size 
		}
		return set.containsAll(otherSet.set);
	}
	
	/**
     * Returns true if the set contains the value, otherwise false.
     * 
     * @param value The value to check for.
     * @return True if the set contains the value, false otherwise.
     */
	public boolean contains(int value) {
		return set.contains(value);
	}
	/**
     * Returns the largest item in the set.
     * 
     * @return The largest item in the set.
     * @throws IllegalStateException If the set is empty.
     */
	public int largest() throws IntegerSetException {
		if(set.isEmpty()) {
			throw new IntegerSetException("Set is empty"); // throw an exception if the set is empty 
		}
		int largest = set.get(0); // Initialize largest to the first element
		for (int i = 1; i< set.size(); i++) {
			if (set.get(i) > largest) {
				largest = set.get(i); // Update largest if a larger element is found 
			}
		}
		return largest; // return largest element 
	}
	
	/**
     * Returns the smallest item in the set.
     * 
     * @return The smallest item in the set.
     * @throws IllegalStateException If the set is empty.
     */ 
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Set is empty"); //exception if the set is empty
		}
		int smallest = set.get(0); // initialize smallest to first element 
		for(int i = 1; i < set.size(); i++) {
			if (set.get(i)< smallest) {
				smallest = set.get(i); // update smallest if a smaller element is found
			}
		}
		return smallest; // return smallest element 
	}
	
	/**
     * Adds an item to the set or does nothing if it is already there.
     * 
     * @param item The item to add.
     */
	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
	}
	/**
     * Removes an item from the set or does nothing if it is not there.
     * 
     * @param item The item to remove.
     */
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}
	/**
     * Performs a set union operation with another IntegerSet. This set will contain
     * all elements from both sets.
     * 
     * @param intSetb The other IntegerSet to perform the union with.
     */
	public void union(IntegerSet intSetb) {
		for (int item: intSetb.set) {
			add(item); // adds each element from intSetb to this set 
		}
	}
	/**
     * Performs a set intersection operation with another IntegerSet. This set will
     * contain only the elements that are common to both sets.
     * 
     * @param intSetb The other IntegerSet to perform the intersection with.
     */
	public void intersect(IntegerSet intSetb) {
		List<Integer>intersection = new ArrayList<>(); // creates new ArrayList to store intersection
		for (int item : set) {
			if(intSetb.contains(item)) {
				intersection.add(item); //Adds item to the intersection if its also in setb
			}
		}
		set.clear(); //clear current set 
		set.addAll(intersection); // add the intersection back to the set 
	}
	
	 /**
     * Performs a set difference operation with another IntegerSet. This set will
     * contain only the elements that are in this set but not in the other set.
     * 
     * @param intSetb The other IntegerSet to perform the difference with.
     */
	public void diff(IntegerSet intSetb) {
		List<Integer> difference = new ArrayList<>();
		for(int item : set) {
			if(!intSetb.contains(item)) {
				difference.add(item);
			}
		}
		set.clear();
		set.addAll(difference);
	}
	
	/**
     * Performs a set complement operation with another IntegerSet. This set will
     * contain all the elements that are in the other set but not in this set.
     * 
     * @param intSetb The other IntegerSet to perform the complement with.
     */
	public void complement(IntegerSet intSetb) {
		List<Integer> complement = new ArrayList<>();
		for(int item : intSetb.set) {
			if (!set.contains(item)) {
				complement.add(item); // Adds item to complement if its not in this set 
			}
		}
		set.clear();
		set.addAll(complement); //Add complement back to set
	}
	
	/**
     * Returns true if the set is empty, false otherwise.
     * 
     * @return True if the set is empty, false otherwise.
     */
	public boolean isEmpty() {
		return set.isEmpty();
	}
	
	/**
     * Returns a String representation of the set.
     * 
     * @return A String representation of the set.
     */ 
	public String toString() {
		return set.toString(); // string representation of ArrayList 
	}
}

