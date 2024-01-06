package overridingExamples;

public class Animal {
  public void sound() {
    System.out.println("Animal is Barking");
  }
}

class Cat extends Animal {
  @Override
  public void sound() {
    System.out.println("Cat is meowing");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Dog is barking");
  }
}

class Mammal extends Animal {
  @Override
  public void sound() {
    super.sound();
  }
}

class Sound {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Animal cat = new Cat();
    Animal dog = new Dog();
    Animal mammal = new Mammal();

    animal.sound();
    cat.sound();
    dog.sound();
    mammal.sound();
  }
}