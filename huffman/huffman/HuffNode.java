/**
 * 
 */
package huffman;


/**
 * @author Kevin Callahan
 *
 */
public class HuffNode implements Comparable<HuffNode> {
	static final String EOF = "\u0000";
	
	String symbol = "";
	int freq = 0;
	
	HuffNode parent = null;
	HuffNode left = null;
	HuffNode right = null;
	
	
	public HuffNode(String name, int freq){
		this.symbol = name;
		this.freq = freq;
	}
	
	
	/**
	 * Creates a new HuffNode from two existing nodes
	 * such that its frequency is the sum of the 
	 * existing nodes frequencies and lower frequency
	 * child is the left node.
	 * 
	 * @param lChild
	 * @param rChild
	 */
	public HuffNode(HuffNode lChild, HuffNode rChild){
		
		this.freq = lChild.freq + rChild.freq;
		this.left = lChild;
		this.right = rChild;
		
		lChild.parent = this;
		rChild.parent = this;		
	}


	/** 
	 *  
	 * @param o the HuffNode to be compared.
	 * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object. 

	 */
	@Override
	public int compareTo(HuffNode o) {		
		return this.freq - o.freq;
	}
	
	
	
}
