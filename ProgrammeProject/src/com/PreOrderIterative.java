package com;
import java.util.Stack; 
class PreIterative{
	int data;
	PreIterative left=null,right=null;
	public PreIterative(int data) {
		this.data=data;
	}
}
public class PreOrderIterative {

	public void printPreOrder(PreIterative node)
	{
		if(node==null)
		{
			return ;
		}
		Stack<PreIterative> s= new Stack<>();
		s.push(node);
		
		while(!s.empty())
		{
			PreIterative curr=s.pop();	
			System.out.println(curr.data);
			if(curr.right!=null)
			{
				s.push(curr.right);
			}
			if(curr.left!=null)
			{
				s.push(curr.left);
			}
		}
	}
	
	public static void main(String args[])
	{
		PreIterative root = null;
	    
	    root = new PreIterative(15);
	    root.left = new PreIterative(10);
	    root.right = new PreIterative(20);
	    root.left.left = new PreIterative(8);
	    root.left.right = new PreIterative(12);
	    root.right.left = new PreIterative(16);
	    root.right.right = new PreIterative(25);
	    PreOrderIterative preOrder=new PreOrderIterative();
		
	}
}
