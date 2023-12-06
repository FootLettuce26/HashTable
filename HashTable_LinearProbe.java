package driver;

public class HashTable_LinearProbe extends HashTable {
	public Node Head;
	public int Size;
	
	public HashTable_LinearProbe() {
		this.Head = null;
		this.Size = 0;
	}
	
	public int Hashing(int key) {
		int result = key % this.Size;
		return result;
	}
	@Override
	public void HashInsert(int key, int value) {
		int index = Hashing(key);
	}

	@Override
	public boolean HashSearch(int key) {
		int index = Hashing(key);
		
		return false;
	}

	@Override
	public void HashDelete(int key) {
		// TODO Auto-generated method stub

	}

}
