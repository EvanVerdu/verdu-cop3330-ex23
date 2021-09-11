package Exercise23;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise23 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? (Yes or No): ");
        String key = scanner.nextLine();

        if (key.equals("Yes")){
           System.out.print("Are the battery terminals corroded? (Yes or No): ");
           String batteries = scanner.nextLine();

           if (batteries.equals("Yes")){
              System.out.print("Clean terminals and try starting again.");
              System.exit(0);
           }
           else if (batteries.equals("No")){
               System.out.print("Replace cables and try again.");
               System.exit(0);
           }

        }

        else if (key.equals("No")){
            System.out.print("Does the car make a slicking noise? (Yes or No): ");
            String noise = scanner.nextLine();

            if (noise.equals("Yes")){
               System.out.print("Replace the battery.");
                System.exit(0);
            }
            else if (noise.equals("No")){
                System.out.print("Does the car crank up but fail to start? (Yes or No): ");
                String crank = scanner.nextLine();

                if (crank.equals("Yes")){
                    System.out.print("Check the spark plug connections. ");
                    System.exit(0);
                }
                else if (crank.equals("No")){
                    System.out.print("Does the engine start and then die? (Yes or No): ");
                    String engine = scanner.nextLine();

                    if (engine.equals("Yes")){
                        System.out.print("Does your car have fuel injection? (Yes or No): ");
                        String fuel = scanner.nextLine();

                        if (fuel.equals("Yes")){
                           System.out.print("Get it in for service.");
                            System.exit(0);
                        }

                        else if (fuel.equals("No")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }


                    }
                    else if (engine.equals("No")){
                        System.out.print("This should not be possible. ");
                        System.exit(0);
                    }

                }

            }

        }

    }

}
