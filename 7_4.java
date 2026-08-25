class Complex {
    int real;
    int imaginary;

    // Default constructor
    Complex() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized constructor
    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    // Addition method
    Complex add(Complex c) {
        Complex temp = new Complex();

        temp.real = this.real + c.real;
        temp.imaginary = this.imaginary + c.imaginary;

        return temp;
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 2);

        Complex c3 = c1.add(c2);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Addition: ");
        c3.display();
    }
}
