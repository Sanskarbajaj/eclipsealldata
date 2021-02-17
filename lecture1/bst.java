package lecture1;

import java.util.*;

import lecture1.btree.Node;

public class bst extends btree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.left = left;
			this.right = right;
			this.data = data;
		}
	}

	private Node root;
	private int size;
	private Object node;

	public bst() {
		this.size = 0;
		this.root = null;
	}

	public void add(int data) {
		if (this.root == null) {
			this.root = new Node(data, null, null);
			this.size++;
		}
		this.add(data, this.root);
	}

	private void add(int data, Node node) {

		if (node.data > data) {
			if (node.left != null)
				this.add(data, node.left);
			else {
				node.left = new Node(data, null, null);
				this.size++;
			}
		} else if (node.data < data) {
			if (node.right != null)
				this.add(data, node.right);
			else {
				node.right = new Node(data, null, null);
				this.size++;
			}
		} else {

		}
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		int max = node.data;
		if (node.right != null) {
			max = this.max(node.right);
		}
		return max;
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		int min = node.data;
		if (node.left != null) {
			min = this.min(node.left);
		}
		return min;
	}

	public void remove(int data) {
		this.remove(data, this.root);
	}

	private void remove(int data, Node node) {
		if (node.data != data) {

		}
	}

	public void display() {

		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}

		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}
	}

}
