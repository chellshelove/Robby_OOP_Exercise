import java.util.Scanner;

public class robby {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
        int a = 1; 
        int b = 0; 
        int c = 0;
        int distance = 0;

        while (a == 1){ 
            System.out.println("Robby Instructions:");
            System.out.println("1. Move");
            System.out.println("2. Location");
            System.out.println("3. Reset");
            System.out.println("4. Quit");

            int choice = input.nextInt();
            switch(choice){ 
                case 1:
                    System.out.println("Enter direction (N,E,W,S)");
                    String direction = input.next();

                    if (direction.equals("N")){ 
                        System.out.println("Enter distance over 0");
                        distance = input.nextInt();
                        c = c + distance;
                        System.out.println("Robby moved North" + distance);

                }   else if (direction.equals("S")){ 
                        System.out.println("Enter distance over 0");
                        distance = input.nextInt();
                        c = c - distance;
                        System.out.println("Robby moved South" + distance);

                }   else if (direction.equals("E")){ 
                        System.out.println("Enter distance over 0");
                        distance = input.nextInt();
                        b = b + distance;
                        System.out.println("Robby moved East" + distance);

                }   else if (direction.equals("W")){ 
                        System.out.println("Enter distance over 0");
                        distance = input.nextInt();
                        b = b - distance;
                        System.out.println("Robby moved West" + distance);
                }
                    break;

                case 2:
                    if ( b == 0 && c == 0){
                     System.out.println("Robby is in the origin"); 
                }   else {
                        System.out.println("Robby is currently at (" + b +","+ c +")"); 
                }
                    break;

                case 3:
                    System.out.println("Robby reset at ("+ b +","+ c +")"); 
                    b = 0;
                    c = 0;
                    break;

                case 4:
                    System.out.println("Goodbye!!");
                    a = 0; 
                    break;
            }
        }
    input.close();
        }
    } 
}