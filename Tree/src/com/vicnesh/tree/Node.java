package com.vicnesh.tree;



/*
 * A node in a tree consists of 
 * 1) An element
 * 2) Children (0 or more child)
 * 3) A single parent
 * 
 */


public class Node {
	
	private int element;
	private Node parent;
	private Node[] children;
	
	
	/*
	 * Default Constructor
	 * @parameter
	 * @return
	 */
	public Node() {
		this.element = 0;
		this.parent = null;
		this.children = null;
	}
	
	
	/*
	 * Parameterized Constructor
	 * @parameter
	 * @return
	 */
	public Node(int element) {
		this.element = element;
		this.parent = null;
		this.children = null;
	}
	
	
	/*
	 * Parameterized Constructor
	 * @parameter
	 * @return
	 */
	public Node(int element, Node parent) {
		this.element = element;
		this.parent = parent;
		this.children = null;
	}
	
	
	/*
	 * Get node element
	 * @parameter
	 * @return - element of node
	 */
	public int getElement() {
		return this.element;
	}
	
	
	/*
	 * Get parent of node
	 * @parameter
	 * @return - parent node of this node
	 */
	public Node getParent() {
		return this.parent;
	}
	
	
	/*
	 * Get children of this node
	 * @parameter
	 * @return - children of node
	 */
	public Node[] getChildren() {
		return this.children;
	}
	
	
	/*
	 * Set element
	 * @parameter - int element
	 * @return
	 */
	public void setElement(int element) {
		this.element = element;
	}
	
	
	/*
	 * Set parent node
	 * @parameter - Node parent
	 * @return
	 */
	public void setParent(Node parent) {
		this.parent = parent;
		parent.setChild(this);
	}
	
	
	/*
	 * Set child node
	 * @parameter - Node child
	 * @return
	 */
	public void setChild(Node child) {
		child.setParent(this);
		this.children[this.children.length] = child;
	}
	
	
	/*
	 * Check if this is root node
	 * @parameter
	 * @return - true if this is root of tree
	 */
	public boolean isRoot() {
		return (this.parent == null);
	}

	
}
