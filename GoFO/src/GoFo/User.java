package GoFo;
/**
 * this is  class user which from the user sign up
 *
 */
public class User {
    /**
     * name represent name of the user
     * password is the password for the user
     * location represent location of the user
     * role identify if he is player or playground owner
     */
    private String name;
    private String password;
    private static int id = 0;
    private String location;
    private String role;

    /**
     *it is the value of constructor name,password,location,role
     * @param name
     * @param password
     * @param location
     * @param role
     */
    public User(String name, String password,  String location, String role) {
        this.name = name;
        this.password = password;
        id = id+1;
        this.location = location;
        this.role = role;
        if(this.role.equals("player"))
        {Player.adduser(this);}
        else if(this.role.equals("playground Owner"))
        {PlaygroundOwner.adduser(this);}

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
     * @param name name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password set password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id set id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return role
     */

    public String getRole() {
        return role;
    }

    /**
     *
     * @param role set role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * this method it shows the object as string
     * @return the user information name,password,location,role
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", location='" + location + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
