/**
 * 
 */
package test1;

import java.util.ArrayList;

/**
 * @author Sophie Rudd
 *
 */
public class Marina {
	
	public Marina(int inpSize) {
		size = inpSize;
		usedSize = 0;
		boats = new ArrayList<Boat>();
	}

	/**
	 * The number of boats allowed to be held at a marina
	 */
	protected int size;
	/**
	 * The amount of space used up by boats
	 */
	protected int usedSize;
	/**
	 * The set of boats in the arena
	 */
	protected ArrayList<Boat> boats;
	
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
	/**
	 * @return the space used by boats
	 */
	public int getUsedSize(){
		return usedSize;
	}
	/**
	 * @return the boats in the marina.
	 */
	public ArrayList<Boat> getBoats(){
		return boats;
	}
	/**
	 * Adds a boat to the marina, if it will fit and has an associated person.
	 * @param boat the boat to add
	 * @return if the addition was successful
	 */
	public void add(Boat inp){
		if (inp.getSize() + usedSize <= size && (inp.getCaptain() != null || inp.owner != null || !inp.getCrew().isEmpty()) && inp.getCurrentMarina() == null){
			boats.add(inp);
			usedSize += inp.getSize();
			inp.setCurrentMarina(this);
		}
	}
	public void remove(Boat inp){
		if (boats.contains(inp)){
			inp.setCurrentMarina(null);
			usedSize -= inp.getSize();
			boats.remove(inp);
		}
	}
}
