package inheritance;

// Multilevel Inheritance

public class Animal {
  public void genes() {
    System.out.println("I am an Animal");
  }
}

class Mammal extends Animal {
  @Override
  public void genes() {
    System.out.println("I am a Mammal but also an Animal");
  }
}

class Dog extends Mammal {
  @Override
  public void genes() {
    System.out.println("I am a Dog but also a Mammal");
  }
}

class Jungle {
  public static void main(String[] args) {
    Animal obj1 = new Animal();
    Animal obj2 = new Mammal();
    Animal obj3 = new Dog();
    obj1.genes();
    obj2.genes();
    obj3.genes();
  }
}

/*
* Animal <- Mammal <- Dog
* */