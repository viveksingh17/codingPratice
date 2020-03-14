package com;
import  java.util.*;
class NodeLevel
{
	int data;
	NodeLevel left=null,right=null;
	NodeLevel(int data)
	{
		this.data=data;
	}
}
public class LevelOrderTravesal {

	/**
	 * Iterative approch
	 * @param node
	 */
	public void levelOrderTravese(NodeLevel node) {
		Queue<NodeLevel> queue = new ArrayDeque<>();
		queue.add(node);
		NodeLevel nodel;
		if(!queue.isEmpty())
		{
			nodel=queue.poll();
			System.out.print(nodel.data+" ");
			if(nodel.left!=null)
			{
				queue.add(nodel.left);
			}
			if(node.right!=null)
			{queue.add(nodel.right);
				
			}
		}
	}
	
}
