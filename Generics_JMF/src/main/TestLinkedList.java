package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;
/**
 * This class is used to input and test the new data added to each list and print them out.
 * @author James Frayser
 * Programming Project 3
 * CS131ON
 */

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
	
		/**
		 * New node to add a string data type to print out
		 */
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		/**
		 * New GenericNode to add a integer data type to print out
		 */
	
		GenericLinkedList<Integer> newList=new GenericLinkedList<Integer>();
	
		GenericNode<Integer> bNode=new GenericNode<Integer>();
		bNode.setData(9);
		newList.addGenericNode(bNode);
		bNode = new GenericNode<Integer>();
		bNode.setData(8);
		newList.addGenericNode(bNode);
	
		GenericNode<Integer> newTempnode=newList.getList();
		do 
		{
			System.out.println(newTempnode.getData());
			newTempnode=newTempnode.getNextNode();
		} while (newTempnode!=null);
		
		/**
		 * New GenericNode to add a Double data type to print out
		 */

		GenericLinkedList<Double> doubleList=new GenericLinkedList<Double>();
		
		GenericNode<Double> cNode=new GenericNode<Double>();
		cNode.setData(9.8);
		doubleList.addGenericNode1(cNode);
		cNode = new GenericNode<Double>();
		cNode.setData(8.9);
		doubleList.addGenericNode1(cNode);
		
		GenericNode<Double> doubleTempnode=doubleList.getList();
		do 
		{
			System.out.println(doubleTempnode.getData());
			doubleTempnode=doubleTempnode.getNextNode();
		} while (doubleTempnode!=null);
		
		/**
		 * New GenericNode to add a string data type to print out
		 */
		
		LinkedList stringList=new LinkedList();
		
		Node dNode=new Node();
		dNode.setData("Peter Parker");
		stringList.addNode(dNode);
		dNode = new Node();
		dNode.setData("Dungeons and Dragons");
		stringList.addNode(dNode);
		
		Node stringTempnode=stringList.getList();
		do 
		{
			System.out.println(stringTempnode.getData());
			stringTempnode=stringTempnode.getNextNode();
		} while (stringTempnode!=null);
		
	}//end main

}//end class
