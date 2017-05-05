/**
 * 
 */
package test1;

/**
 * @author Sophie Rudd
 * An interface for moving machines.
 */
public interface Vehicle {

	/**
	 * @return the vehicle's speed.
	 */
	public int getSpeed();
	
	/**
	 * Increase the vehicle's speed.
	 */
	public void accelerate();
	
	/**
	 * Decrease the vehicle's speed.
	 */
	public void decelerate();
}
