public class InventoryMain {
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }

        // this is used to parse integers through the command line
        int numAddOperations = Integer.parseInt(args[0]);
        int numRemoveOperations = Integer.parseInt(args[1]);

        Inventory inventory = new Inventory();
        AddRemove ar = new AddRemove(inventory, numAddOperations, numRemoveOperations);

        // Create threads to add and remove items
        Thread AddRemove = new Thread(ar);

        // Start the threads
        AddRemove.start();

        try {
            // Wait for the threads to finish
            AddRemove.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After the threads finish, print the final inventory size
        System.out.println("Final inventory size = " + inventory.getSize());
    }
}
