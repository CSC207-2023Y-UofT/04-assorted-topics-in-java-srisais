/* DONE: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DrivableTrader, giving them the given inventory,
     * wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist,
                  int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a DrivableTrader, giving them an empty inventory,
     * empty wishlist, and a given amount of money.
     *
     * @param money The Trader's money.
     */
    public DrivableTrader(int money) {
        super(money);
    }

    /**
     * Gets the selling price of the inputted item
     * @param item item to get the selling price for
     * @return the selling price of the item <code>item</code>
     */
    public int getSellingPrice(Drivable item) {
        int sellingPrice = Tradable.MISSING_PRICE;

        if (item instanceof Tradable) {
            sellingPrice = ((Tradable) item).getPrice() + item.getMaxSpeed();
        }

        return sellingPrice;
    }

}