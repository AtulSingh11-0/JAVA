public class Main {
    int hours;
    int minutes;
    Main() {
        hours = 0;
        minutes = 0;
    }
    Main(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }
    Main addTime(Main A, Main B) {
        Main C = new Main();
        C.minutes = A.minutes + B.minutes;
        C.hours = C.minutes/60;
        C.minutes = C.minutes % 60;
        C.hours += A.hours + B.hours;
        return C;
    }
    void display() {
        System.out.println("Time is " + hours + ":" + minutes);
    }
}

class child {
    public static void main(String[] args) {
        Main obj1 = new Main(7, 70);
        Main obj2 = new Main(8, 35);
        Main obj3 = new Main();
        obj1.display();
        obj2.display();
        obj3 = obj3.addTime(obj1, obj2);
        System.out.print("Added ");
        obj3.display();
    }
}