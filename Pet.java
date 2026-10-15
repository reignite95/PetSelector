// Name: Rehan Khan
// Project: Pet selector project-gives you a pet based on user name
// Date: 10/15/26

import java.util.Scanner;
public class Pet {
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your favorite color: (red, blue, or green)");

        String favColor = myObj.nextLine().toLowerCase();  // Read user input

        if (!(favColor.equals("red") || favColor.equals("green") || favColor.equals("blue"))){

            return;
        }

        System.out.println("Enter your favorite season: (winter, spring, summer, or fall)");
        String favSeason = myObj.nextLine().toLowerCase();

        if (!(favSeason.equals("summer") || favSeason.equals("spring") || favSeason.equals("winter") || favSeason.equals("fall"))) {
                return;
            }

        System.out.println("Enter your name: ");
        String name = myObj.nextLine().toLowerCase();
        String firstLetter = name.substring(0, 1);

        if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) == -1) {
                return;
            }    


        else if (favColor.equals("blue") && favSeason.equals("fall")){
            
            System.out.println("Your pet is an alligator");

        }
        else if (favColor.equals("blue") && favSeason.equals("spring")){
            
            System.out.println("Your pet is an ostrich");

        }
        else if (favColor.equals("green") && "aeiou".indexOf(firstLetter) == -1 && favSeason.equals("winter")){
            
            System.out.println("Your pet is an giraffe");


        }

        else if (favColor.equals("green") && !favSeason.equals("fall")){
            System.out.println("Your pet is a dog");

        }

        else if (favColor.equals("red")){

            if ("aeiou".indexOf(firstLetter) != -1){
                System.out.println("Your pet is a porcupine");

            }

            else {
                System.out.println("Your pet is a panda");
            }
        }

        else if (favSeason.equals("summer")){
                System.out.println("Your pet is a pony");

        }

        else if ("aeiou".indexOf(firstLetter) == -1 && favColor.equals("blue") && !favSeason.equals("fall") && !favSeason.equals("summer")){

                System.out.println("Your pet is a axolotl");

        }
        else {
            System.out.println("Your pet is a rock");
        }
        
    }
}
