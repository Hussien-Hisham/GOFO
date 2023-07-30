package GoFo;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        while (true) {
            System.out.println("1- Sign up \n2- Sign in\n3- Exit: ");
            int choice = input3.nextInt();
            if (choice == 1) {
                System.out.println("name,password , location , role  in the same formula as above: ");

                String name = input2.nextLine();
                String password = input2.nextLine();
                String location = input2.nextLine();
                String role ="";
                System.out.println("now choose from the following your role:");
                System.out.println("1-player\n2-playground owner ");
                int choice3 =input3.nextInt();
                if (choice3==1){
                    role="player";
                }
                else if (choice3==2){
                    role="playground Owner";
                }
                User u1 = new User(name, password, location, role);
                Player.adduser(u1);
                PlaygroundOwner.adduser(u1);
                System.out.println("account created successfully");

            }
            else if (choice==2){
                boolean state;
                System.out.println("1-sign in as player\n2-sign in as playground owner");
                int choice2 = input3.nextInt();
                if (choice2==1){
                    System.out.println("name,password \n in the same formula as above: ");

                    String uname = input2.nextLine();
                    String upassword = input2.nextLine();
                    state=Player.check(uname,upassword);
                    if (state==true)
                    {
                        System.out.println("signed in successfully");
                        System.out.println("now u can book a playground");
                      Player p1=new Player();
                      p1.booking();
                    }
                }

                else if (choice2==2){

                System.out.println("name,password\n in the same formula as above: ");

                String uname = input2.nextLine();
                String upassword = input2.nextLine();
                state=PlaygroundOwner.check(uname,upassword);
                    if (state==true)
                    {
                        System.out.println("signed in successfully");
                        System.out.println("now u can add a playground");
                        PlaygroundOwner p2=new PlaygroundOwner();
                        System.out.println("name,location , price , ownername\n in the same formula as above: ");
                        String name2= input.nextLine();
                        String location2= input.nextLine();
                        String price=input.nextLine();
                        String ownername=input.nextLine();

                        Playground p3 = new Playground( name2,  location2,  price, ownername);
                        PlaygroundOwner.addground(p3);
                        System.out.println("how many slots do you wants to add");
                        int slotnumber=input3.nextInt();
                        for(int i=0;i<slotnumber;i++){
                            System.out.println("enter the slots now");
                            System.out.println("from");
                            String from=input.nextLine();
                            System.out.println("to");
                            String to=input.nextLine();
                        String slot=from+":"+to;
                        p3.addSlot(slot);}

                    }
                }


            }
            else if (choice==3){
                return;
            }

        }

    }}

