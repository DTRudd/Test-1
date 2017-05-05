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
	
	public Marina(String inpName, String inpAddress, double inpSize) {
		name = inpName;
		address = inpAddress;
		size = inpSize;
		usedSize = 0;
		boats = new ArrayList<Boat>();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((boats == null) ? 0 : boats.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + usedSize;
		return result;
	}
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marina other = (Marina) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (boats == null) {
			if (other.boats != null)
				return false;
		} else if (!boats.equals(other.boats))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		if (usedSize != other.usedSize)
			return false;
		return true;
	}

	/**
	 * The number of boats allowed to be held at a marina
	 */
	protected double size;
	/**
	 * The amount of space used up by boats
	 */
	protected int usedSize;
	/**
	 * The set of boats in the arena
	 */
	protected ArrayList<Boat> boats;
	/**
	 * the name of the marina
	 */
	protected String name;
	/**
	 * @return the name of the marina 
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address of the marina
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * the address of the Marina
	 */
	protected String address;
	/**
	 * @return the size.
	 */
	public double getSize() {
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
	 * @param inp the boat to add
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
