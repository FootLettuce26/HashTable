package driver;

public class Chain {
	//fields
	public Node Head;
	public int Size;
	
	//constructors
	public Chain() {
		this.Head = null;
		this.Size = 0;
	}
	
	//methods
	
	//compare every node with its key and input
	//When there is an item that has the key, return true, otherwise return false
	public boolean SearchByKey(int key) {
		Node temp = this.Head;
		while(temp != null) {
			if(temp.Key == key) {
				return true;
			}
			temp = temp.nextNode;
		}
		return false;
	}
	
	public Node SearchNodeByKey(int key) {
		Node temp = this.Head;
		while(temp != null) {
			if(temp.Key == key) {
				return temp;
			}
			temp = temp.nextNode;
		}
		return null;
	}
	
	public void InsertNode(int key, int value) {
		Node temp = this.Head;
		if (temp == null) {
			this.Head = new Node(key, value);
			this.Size++;
		}else {
			while(temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = new Node(key, value);
			this.Size++;
		}
	}
	
	
	@Override
	public String toString() {
		Node temp = this.Head;
		String output = "";
		while(temp != null) {
			if(output.length() > 0) {
				output += "; ";
			}
			output += temp.toString();
			temp = temp.nextNode;
		}
		return output;
	}
	
	
}
