package driver;

public class HashTable_Chaining extends HashTable {
	public Chain[] Table;
	public int Size;
	
	public HashTable_Chaining(int Size) {
		this.Size = Size;
		this.Table = new Chain[Size];
		for(int i = 0; i < Size; i++) {
			this.Table[i] = new Chain();
		}
	}
	
	
	//hashing is the process to translate a key into a value for indexing/searching
	//basically tells you what index(linked list) to look in
	private int Hashing(int key) {
		int result = key % this.Size;
		return result;
	}
	
	@Override
	public void HashInsert(int key, int value) {
		//1. look for index based on the key
		int index = Hashing(key);
		Chain target = Table[index];
		//2. look on the chain to find the node with the key
		Node targetNode = target.SearchNodeByKey(key);
		if(targetNode != null) {
			targetNode.Value = value;
		}else {
			target.InsertNode(key, value);
		}

	}

	@Override
	public boolean HashSearch(int key) {
		//1. look for index based on the key
		int index = Hashing(key);
		Chain target = Table[index]; //it could be null; looking at value
		//2. look on the chain/linked list search for the key
		return target.SearchByKey(key);
	}

	@Override
	public void HashDelete(int key) {
		int index = Hashing(key);
		int count = 0;
		Chain target = Table[index];
		while(Table[count] != null) {
			if(Table[count] == target) {
				Table[count] = null;
			}else{
				count++;
			}
		}
		//create function in Chain called DeleteNodeByKey and call it here
	}
	
	@Override
	public String toString() {
		String output = "";
		for(int i = 0; i < this.Size; i++) {
			output += "[" + i + ']' + "--> " + this.Table[i].toString() + "\n";
		}
		return output;
	}

}


