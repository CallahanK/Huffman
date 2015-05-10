/**
 * 
 */
package huffman;

/**
 * @author Kevin Callahan
 *
 */
public class BufferedByte {

	byte buildingByte;
	int length = 0;
	
	public BufferedByte(){
		//
	}
	
	public BufferedByte(byte newByte){
		buildingByte = newByte;
		length++;
	}
	
	public byte addToBuffer(byte addByte){
		//If buffer is full return builtByte
		//Reset buffer
		if(this.length==8){
			byte output = buildingByte;
			buildingByte = addByte;
			length = 0;
			return output;
		}
		
		if(this.length==0){
			buildingByte = addByte;
		} else {
			
			buildingByte = (byte) (buildingByte<<1);
			buildingByte = (byte) (buildingByte|addByte);
		
			length++;
		}
		return (Byte) null;
	}
	
	//Shifts the to the left so the first significant bit is leftmost
	//Returns the byte
	public byte flushBuffer(){
		buildingByte = (byte) (buildingByte<<(8-this.length));
		return buildingByte;
	}
}
