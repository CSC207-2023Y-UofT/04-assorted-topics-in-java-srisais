/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* DONE: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */

    /**
     * Takes the <code>String</code> ID and its respective <code>Drivable</code>
     * object and adds it to the <code>drivable_map</code> attribute, if not already there.
     *
     * Returns whether or not the pair was added to the map.
     *
     * @param id the ID of the object
     * @param item the object itself
     * @return Whether or not the key-value pair was added to <code>drivable_map</code>
     */
     public boolean addDrivable(String id, Drivable item) {
         boolean addedToMap = false;
         if (!this.drivable_map.containsKey(id)) {
             // Add the key-value pair
             this.drivable_map.put(
                id, item
             );
             addedToMap = true;
         }

         return addedToMap;
     }




    /* DONE: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */

    /**
     * Finds out whether or not there is at least one item in this map
     * that has a maximum speed >= <code>speed</code>
     *
     * @param speed speed to check
     * @return boolean
     */
     public boolean hasFasterThan(int speed) {
         boolean foundFasterSpeed = false;

         for (Drivable item : this.drivable_map.values()) {
             if (item.getMaxSpeed() >= speed) {
                 foundFasterSpeed = true;
                 break;
             }
         }

         return foundFasterSpeed;
     }





    /* DONE: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */

    /**
     * Returns a </code>List</code> of all the <code>Tradable</code> items
     * in this <code>DrivableMap</code>.
     * @return a <code>List<Tradable></code>
     */
    public List<Tradable> getTradable() {
        ArrayList<Tradable> tradableItems = new ArrayList<Tradable>();

        for (Drivable item : this.drivable_map.values()) {
            if (item instanceof Tradable) {
                tradableItems.add((Tradable) item);
            }
        }

        return tradableItems;

    }


    
}