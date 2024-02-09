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
        Dog[] triDogs = {dogA, labA, yorkA};

    for (int i = 0; i < 3; i ++){
        System.out.println("For " + triDogs[i].getName() + " says " + triDogs[i].bark());

    }

    for(Dog dog: triDogs){
        System.out.println("For each " + dog.getName() + " ays " + dog.bark());
    }

	    System.out.println(dDog.getName() + " says " + dDog.bark());
        System.out.println(lDoggy.getName() + " says " + lDoggy.bark());
        System.out.println(yDoggy.getName() + " says " + yDoggy.bark());

        lDoggy.waddle();//waddle doesn't work because labrador cannot inherit from the yorkshire
        yDoggy.waddle();




    }
}
