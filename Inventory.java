public class Inventory {
    private int size = 0; // size of the inventory

    public synchronized int getSize(){
        return size;
    }

    //adds an item to the inventory 
    public synchronized void addItem(){
        size++;
    }

    //removes an item from inventory
    public synchronized void removeItem(){
        size--;
    }
}
