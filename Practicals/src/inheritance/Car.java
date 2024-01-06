package inheritance;

// Multiple Inheritance

interface PetrolCar {
  public void type ();
}

interface ElectricCar {
  public void type();
}

public abstract class Car implements PetrolCar,ElectricCar {
}