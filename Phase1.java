import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter int: ");
        int a = sc.nextInt();

        System.out.print("Enter float: ");
        float b = sc.nextFloat();

        System.out.print("Enter char: ");
        char c = sc.next().charAt(0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

        sc.close();
    }
}

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);

        sc.close();
    }
}

class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();

        if (ch == 1) {
            float c = sc.nextFloat();
            float f = (c * 9 / 5) + 32;
            System.out.println(f);
        } else if (ch == 2) {
            float f = sc.nextFloat();
            float c = (f - 32) * 5 / 9;
            System.out.println(c);
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}

class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        System.out.println(si);

        double amt = p * Math.pow((1 + r / 100), t);
        System.out.println(amt - p);

        sc.close();
    }
}

class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();
        float pi = 3.14f;

        System.out.println(pi * r * r);
        System.out.println(2 * pi * r);

        sc.close();
    }
}

class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}

class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}

class q10 {
    public static void main(String[] args) {
        System.out.println(Integer.SIZE / 8);
        System.out.println(Character.SIZE / 8);
        System.out.println(Float.SIZE / 8);
        System.out.println(Double.SIZE / 8);
    }
}

class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();

        int y = d / 365;
        int rem = d % 365;

        int w = rem / 7;
        int day = rem % 7;

        System.out.println(y + " " + w + " " + day);

        sc.close();
    }
}

class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        int val = ch;

        System.out.println(val);

        sc.close();
    }
}