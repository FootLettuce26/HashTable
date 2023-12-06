package driver;

public class Node {
	public int Key;
	public int Value;
	//booleans for linear probe
	public boolean Occupied;
	public boolean EmptyBeforeStart;
	public boolean EmptyAfterRemoval;
	public Node nextNode;
	
	
	public Node(int Key, int Value) {
		this.Key = Key;
		this.Value = Value;
		this.Occupied = false;
		this.EmptyAfterRemoval = false;
		this.EmptyBeforeStart = true;
		this.nextNode = null;
	}
	
	@Override
	public String toString() {
		return "{" + this.Key + ": " + this.Value + "}"; 
	}
}
