package inheritance;

public class SingleInheritance {
  public void message() {
    System.out.println("Hello from the Parent Class");
  }
}

class B extends SingleInheritance {
  @Override
  public void message() {
    System.out.println("Hello from the Child Class");
  }
}

class Main {
  public static void main(String[] args) {
    SingleInheritance obj1 = new B();
    SingleInheritance obj2 = new SingleInheritance();
    B obj3 = new B();
    obj1.message();
    obj2.message();
    obj3.message();
  }
}