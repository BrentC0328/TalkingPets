package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("Enter what kind of pet you have").append("\n")
                .append("Accepted pets = Dog, Cat, Zebra");

        //Ask how many pets they have
        System.out.println("How many pets do you have?");
        Integer numberOfPets = scanner.nextInt();
        List<Pet> petList = new ArrayList<>();

        //Get which kind of pet each one is, and their names.
        for (int i = 0; i <numberOfPets + 1; i++){

            System.out.println(sb);
            String thePet = scanner.nextLine();

            if (thePet.equalsIgnoreCase("dog")){
                System.out.println("What is your dog's name");
                String dogName = scanner.nextLine();

                Dog dog = new Dog(dogName);
               petList.add(dog);
            }
            if (thePet.equalsIgnoreCase("cat")){
                System.out.println("What is your cat's name");
                String catName = scanner.nextLine();

                Cat cat = new Cat(catName);
                petList.add(cat);
            }
            if (thePet.equalsIgnoreCase("Zebra")){
                System.out.println("A zebra? Ok...What is your zebra's name");
                String zebraName = scanner.nextLine();

                Zebra zebra = new Zebra(zebraName);
                petList.add(zebra);
            }
        }
//Print out a list of all the pets names and what they speak.
        for(int i = 0; i < petList.size(); i++){
            System.out.println(petList.get(i).getName());
            System.out.println(petList.get(i).speak() + "\n");

        }




    }

}
