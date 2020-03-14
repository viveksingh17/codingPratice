package com;

/**
 * Program to check if tree is identical using recursion
 */
class Node {
	int data;
	Node left = null;
	Node right = null;

	Node(int data) {
		this.data = data;
	}
}

public class CheckIfTreeISIdentical {

	public boolean checkTreeIdentica(Node x, Node y) {
		if (x == null && y == null) {
			return true;
		} else if (x == null || y == null) {
			return false;
		}
	
		return 	(x!=null && y!=null) && (x.data==y.data) && checkTreeIdentica(x.left,y.left) && checkTreeIdentica(x.right,y.right);
	}
	
	
	public static  void main(String args[])
	{
		
	}
}
