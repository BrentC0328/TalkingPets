package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("Enter what kind of pet you have then its name").append("\n")
                .append("Accepted pets = Dog, Cat, Zebra").append("\n")
                .append("Example: enter Dog Fido with the spaces to store your dog");

        //Ask how many pets they have
        System.out.println("How many pets do you have?");
        Integer numberOfPets = scanner.nextInt();
        Pet[] pets = new Pet[numberOfPets];

        //Get which kind of pet each one is, and their names.
        for (int i = 0; i <numberOfPets; i++){

            System.out.println(sb);
            String thePet = scanner.next();

            String[] thePetArray = thePet.split(" ");
            if (thePetArray[0].equalsIgnoreCase("dog")){
//                StringBuilder animalName = new StringBuilder().append("Dog").append(i);
                Dog dog = new Dog(thePetArray[1]);
                pets[i] = dog;
            }
            if (thePetArray[0].equalsIgnoreCase("cat")){
//                StringBuilder animalName = new StringBuilder().append("Dog").append(i);
                Cat cat = new Cat(thePetArray[1]);
                pets[i] = cat;
            }
            if (thePetArray[0].equalsIgnoreCase("Zebra")){
//                StringBuilder animalName = new StringBuilder().append("Dog").append(i);
                Zebra zebra = new Zebra(thePetArray[1]);
                pets[i] = zebra;
            }
        }
//Print out a list of all the pets names and what they speak.
        for(Pet pet : pets){
            System.out.println(pet.getName());
            System.out.println(pet.speak());

        }




    }

}
