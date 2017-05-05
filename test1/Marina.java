/**
 * 
 */
package test1;

//import java.util.HashSet;

/**
 * @author Sophie Rudd
 *
 */
public class Marina {
	
	public Marina(int inpSize) {
		size = inpSize;
		//boats = new HashSet<Boat>();
	}

	/**
	 * The number of boats allowed to be held at a marina
	 */
	protected int size;
	//HashSet<Boat> boats;
	
	
	/**
	 * @return the size.
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set.
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
}
