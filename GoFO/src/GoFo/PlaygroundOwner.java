package GoFo;

import java.util.ArrayList;

/**
 * this class is for playground owner which he can add playground
 */
public class PlaygroundOwner {
    /**
     * arraylist stores the playground owners
     */
    private static ArrayList<User> playgowners = new ArrayList<>();

    /**
     *this method to print users list
     */
    public  static void printUsersList() {
        for (int i = 0; i < playgowners.size(); i++) {
            System.out.println(playgowners.get(i));
        }
    }

    /**
     * arraylist stores the playground
     */
    private static ArrayList<Playground> playgolist = new ArrayList<>();

    /**
     * this method used to display the playgrounds
     */
    public  static void printplaygsground(){
        for (int i = 0; i < playgolist.size(); i++)
        {
            System.out.println(playgolist.get(i));
        }
    }

    /**
     *this method to add playground to the array list of playgrounds
     * @param p1
     */
    public static   void addground (Playground p1){


                 playgolist.add(p1);

    }

    /**
     * this method add user as a playground owner
     * @param u1
     */
    public static void adduser (User u1) {
        if(u1.getRole().equals("playground Owner")) {
            playgowners.add(u1);
        }

    }

    /**
     * this method is for checking the name and password in sign in to be able to add playground
     * @param name
     * @param password
     * @return
     */
    public static boolean check (String name,String password)
    {
        for(int i=0;i<playgowners.size();i++)
        {
            if(name.equals(playgowners.get(i).getName())&&password.equals(playgowners.get(i).getPassword()))
            {
                System.out.println("user is found");
                return true;
            }
        }
        System.out.println("user name is not found or password may be incorrect");
        return false;

    }

}
