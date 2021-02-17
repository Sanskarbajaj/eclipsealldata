package lecture1;

import java.util.HashMap;

public class Tries {
	private class Node {
		char data;
		HashMap<Character, Node> child;
		boolean isterminal;

		public Node(char data, boolean isterminal) {
			this.data = data;
			this.child = new HashMap<>();
			this.isterminal = isterminal;
		}
	}

	Node root;
	int now;

	public Tries() {
		this.root = new Node('\0', false);
		int now = 0;
	}

	public void add(String word) {
		add(word, this.root);
	}
	public void add(String word, Node node) {
		
		if(word=="")
		{ return;
		}
		char s=word.charAt(0);
		String r=word.substring(1);
		Node nn=new Node(s,false);
		nn.data=s;
		add(r, nn);
		

	}
	public void display()
	{
		
	}

}
