package GoFo;

import java.util.ArrayList;

/**
 * this class is for playground having it's information
 */
public class Playground {
    /**
     * name represent name of the playground
     * location represent location of the playground
     *  price represent price of the playground
     *  ownername represents ownerName of the playground
     *  arraylist the slots of the playground
     */
    private String name;
    private String location;
    private String price;
    private String ownerName;
    private ArrayList<String> slot = new ArrayList<>();

    /**
     * constructor take name,location,price ownername
     * @param name
     * @param location
     * @param price
     * @param ownername
     */
    public Playground(String name, String location, String price,  String ownername) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.ownerName = ownername;
        Player.addPlaygroundPlayer(this);
    }

    /**
     * this method add slot to the slot array list
     * @param slots
     */
    public void addSlot(String slots ){
        this.slot.add(slots);
        System.out.println("slot added successfully");
    }

    /**
     *
     * @return ownername
     */
    public String getOwnername() {
        return ownerName;
    }

    /**
     *
     * @param ownername set ownername
     */
    public void setOwnername(String ownername) {
        this.ownerName = ownername;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location set location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price set price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     *
     * @return slot
     */
    public  ArrayList<String> getSlot() {
        return this.slot;
    }

    /**
     * this method it shows the object as string
     * @return the playground informmation name,location,price,ownername
     */
    @Override
    public String toString() {
        return "Playground{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price='" + price + '\'' +
                ", ownername='" + ownerName + '\'' +
                ", slot=" + slot +
                '}';
    }
}
