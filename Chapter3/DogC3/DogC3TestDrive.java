package DogC3;

public class DogC3TestDrive {

  public static void main(String[] args) {
    DogC3 dog1 = new DogC3();
    dog1.bark();
    dog1.name = "Bart";

    DogC3[] myDogs = new DogC3[3];
    myDogs[0] = new DogC3();
    myDogs[1] = new DogC3();
    myDogs[2] = dog1;

    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";
    System.out.println("last dog's name is ");
    System.out.println(myDogs[2].name);

    int x = 0;
    while (x < myDogs.length) {
      myDogs[x].bark();
      x = x + 1;
    }

  }

}
