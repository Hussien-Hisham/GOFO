package GoFo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * this class is for player which he can book a playground
 */
public class Player {
    /**
     * arraylist stores the players
     */
    private static ArrayList<Playground> Playerlist = new ArrayList<>();


    private static ArrayList<User> players = new ArrayList<>();
    public  static void printUsersList() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
    }
     public  static void printplayersground() {
         PlaygroundOwner.printplaygsground();
    }

    /**
     * method for adding player in the system
     * @param u1
     */
    public static void adduser(User u1) {
        if(u1.getRole().equals("player")) {
            players.add(u1);
        //System.out.println("Account Added Scussecfully");
        }

    }

    /**
     * method for adding the playground player choose to the arraylist
     * @param playground
     */
    public static void addPlaygroundPlayer (Playground playground){
        Playerlist.add(playground);

    }

    /**
     * this is the method for player in which he can book the playground he want with the wanted time slot
     */
    public void booking(){
        for(int i=0;i<Playerlist.size();i++)
        {
            System.out.println((i+1)+"-"+Playerlist.get(i));
        }
        Scanner input = new Scanner(System.in);
        System.out.println("choose the playground you want to book");

        int choice= input.nextInt();

        Playerlist.get(choice-1).getSlot();
        System.out.println("choose the wanted slot");
        int choice2 = input.nextInt();
        Playerlist.get(choice-1).getSlot().remove(choice2-1);
        System.out.println("playground is booked successfully");






    }

    /**
     * this method is for checking the name and password in sign in to be able to book a playground
     * @param name
     * @param password
     * @return
     */
    public static boolean check (String name,String password)
    {
        for(int i=0;i<players.size();i++)
        {
            if(name.equals(players.get(i).getName())&&password.equals(players.get(i).getPassword()))
            {
                System.out.println("user is found");
                return true;
            }
        }
        System.out.println("user name is not found or password may be incorrect");
        return false;

    }

}
