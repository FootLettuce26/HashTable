package driver;

//abstract methods have no implementation, needs to be inherited
//similar to interface
public abstract class HashTable {
	//append one item in the linked list
	public abstract void HashInsert(int key, int value);
	
	//linear Search on the linked list
	public abstract boolean HashSearch(int key);
	
	//linked list removeAt
	public abstract void HashDelete(int key);
}
