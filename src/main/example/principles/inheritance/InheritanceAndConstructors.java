package example.principles.inheritance;

public class InheritanceAndConstructors {

    static class Base {
        Base() {
            System.out.println(
                    "Base Class Constructor Called ");
        }
    }

    static class Derived extends Base {
        Derived()
        {
            System.out.println(
                    "Derived Class Constructor Called ");
        }
    }

    static class GFG {
        public static void main(String[] args)
        {
            Derived d = new Derived();
        }
    }
}
