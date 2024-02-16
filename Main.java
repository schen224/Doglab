// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{

     ;
    public static void main(String[] args)
    {


	Dog dDog = new Dog("Spike");
    Labrador lDoggy = new Labrador("Goldie", "gold");
    Yorkshire yDoggy = new Yorkshire("Brandy", 5);

        Dog dogA = new Dog("Doggon");
        Labrador labA = new Labrador("Lava", "black");
        Yorkshire yorkA = new Yorkshire("Yarn", 5);

       ArrayList <Dog> dogs = new ArrayList <Dog>();
        dogs.add(0,labA);
        dogs.add(1,yorkA);
        dogs.add(2,dogA);

        Dog[] triDogs = {dogA, labA, yorkA};


        ((Labrador)triDogs[1]).waddle();
//I had to cast the Labrador to waddle because it's a Lab stored in Dog,
//so the system looks in Dog to find waddle, but it doesn't exist in the Dog class
//But bark does exist in the Dog class so the code was able to compile properly

        for(int i = 0; i < dogs.size(); i++){
            System.out.println("Arraylist doggoss:" + dogs.get(i).bark());

        }//Arraylist for loop

        for (Dog dog : dogs) {
            System.out.println(dog.bark());
    }//Arraylist enhanced







    for (int i = 0; i < 3; i ++){
        System.out.println("For " + triDogs[i].getName() + " says " + triDogs[i].bark());
    }//regular for array

    for(Dog dog: triDogs){
        System.out.println("For each " + dog.getName() + " ays " + dog.bark());
    }//for each array

	    System.out.println(dDog.getName() + " says " + dDog.bark());
        System.out.println(lDoggy.getName() + " says " + lDoggy.bark());
        System.out.println(yDoggy.getName() + " says " + yDoggy.bark());

        lDoggy.waddle();//waddle doesn't work because labrador cannot inherit from the yorkshire
        yDoggy.waddle();




    }
}
