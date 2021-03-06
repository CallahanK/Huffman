/**
 * 
 */
package huffman;

/**
 * @author Kevin Callahan
 *
 */
public class CanonicalHuff implements Comparable<CanonicalHuff> {

	String symbol = "";
	int len = 0;
	//TYPE code = null;
	
	public CanonicalHuff(String name, int len){
		this.symbol = name;
		this.len = len;
	}

	/**
	 * @param o the CanonicalHuff to be compared.
	 * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object. 
	 */
	@Override
	public int compareTo(CanonicalHuff o) {
		if(this.len-o.len != 0){
			//Compare by length first
			return (this.len-o.len)*-1;
		} else {
			//Same length, so compare lexigraphically
			return this.symbol.codePointAt(0)-o.symbol.codePointAt(0);
		}
	}
	
	
}
