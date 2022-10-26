public class FizzBuzz {
    public static void main(String[] args) {
        double b;
        double c;
        for (int i = 1; i <= 100; i++) {
            b = (double) i / 3;
            c = (double) i / 5;
            if (b == Math.round (b) & c == Math.round (c)) { 
                System.out.println("FizzBuzz");
            } else if (b == Math.round (b)) {
                System.out.println("Fizz");
            } else if (c == Math.round (c)) {
                System.out.println("Buzz");
            } else if (i == Math.round (i)) {
                System.out.println(i);
            }
        }
    }
}