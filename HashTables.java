/*
 * This class sets up the has table data structure along with
 * the utility methods to manipulate it.
 */
public class HashTables {

	private Node[] map;
	private int tableSize;
	
	// constructor
	public HashTables(int tableSize) {
		map = new Node[tableSize];
		this.tableSize = tableSize;
	}
	
	/*
	 * This is the hash function.
	 * For this hash function, return 0 if key is the empty string.
	 * Otherwise, calculate the sum of the ASCII values of the characters in key
	 * and find the remainder when divided by 8 (remember mod divisision %).
	 * Check the java API for String methods that may be helpful.
	 */
	private int hash(String key) {
		int ascii = 0;
		if(key.length() == 0) {
			return 0;
		} else {
			for(int i = 0; i < key.length(); i++) {
				ascii = ascii + (int) key.charAt(i);
			}
			return ascii % 8;
		}
	}
	
	/*
	 * This method should insert a node containing the given key
	 * in the proper bucket in the hash table.  Insert new nodes
	 * at the head of each linked list for ease of implementation.
	 */
	public void insert(String key) {
		map[hash(key)].record = key;
	}
	
	/*
	 * This method returns true if the search key is contained in the
	 * hash table, and false otherwise.
	 */
	public boolean search(String key) {
		Node pointer = new Node("");
		if(key.length() == 0) {
			return false;
		} else {
			int i = 0;
			while(i != map.length) {
				while(pointer != null) {
					if(pointer.record.equals(key)) {
						return true;
					} else {
						pointer = pointer.next;
					}
				}
			}
			return false;
		}
	}
	
	/*
	 * This method should print out the hash table row by row.
	 * Each line should print out a separate row of the table.
	 * Print the index followed a colon and then the records in that
	 * bucket with spaces between them.
	 * 
	 * For example:
	 * 1: Nicholas Mary Kim Jack
	 */
	public void printTable() {
		int i = 0;
		Node pointer = new Node("");
		while(i != map.length) {
			System.out.print((i+1));
			while(pointer != null) {
				System.out.print((i+1) + pointer.record);
				pointer = pointer.next;
			}
		i++;
		}
	}
	
	/*
	 * This method should delete ALL nodes matching the search key.
	 */
	public void delete(String key) {
		
	}
	
}