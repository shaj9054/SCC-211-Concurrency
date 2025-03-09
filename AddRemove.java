public class AddRemove implements Runnable {
    private Inventory inventory; // implements objects from the inventory class
    private int numItemsToAdd; // number of items that I want to add
    private int numItemsToRemove;// number of items I want to remove

    // constructor that allows initialises instances of the Additem class
    public AddRemove(Inventory inventory, int numItmesToAdd, int numItmesToRemove) {
        this.inventory = inventory;
        this.numItemsToAdd = numItmesToAdd;
        this.numItemsToRemove = numItmesToRemove;
    }

    // this is the method used to start the thread
    // for loop inside the method to add and remove an item to the inventory
    @Override
    public void run() {
        for (int i = 0; i < numItemsToAdd; i++) {
            inventory.addItem();
            System.out.println("Added. Inventory size = " + inventory.getSize());
        }

        for (int y = 0; y < numItemsToRemove; y++) {
            inventory.removeItem();
            System.out.println("Removed. Inventory size = " + inventory.getSize());
        }
    }

}
