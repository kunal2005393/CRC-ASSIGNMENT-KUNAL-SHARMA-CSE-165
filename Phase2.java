import java.util.Scanner;

class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }

        sc.close();
    }
}

class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

        sc.close();
    }
}

class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Consonant");
        } else {
            System.out.println(ch + " is not an alphabet");
        }

        sc.close();
    }
}

class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.println("Enter value of c: ");
        double c = sc.nextDouble();

        double disc = b * b - 4 * a * c;

        if (disc > 0) {
            double root1 = (-b + Math.sqrt(disc)) / (2 * a);
            double root2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Roots are real and different");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (disc == 0) {
            double root1 = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root 1 = Root 2 = " + root1);
        } else {
            double realpart = -b / (2 * a);
            double imagpart = Math.sqrt(-disc) / (2 * a);
            System.out.println("Roots are complex and imaginary");
            System.out.println("Root 1 = " + realpart + " + " + imagpart + "i");
            System.out.println("Root 2 = " + realpart + " - " + imagpart + "i");
        }

        sc.close();
    }
}

class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double ans = 0;

        switch (op) {
            case '+':
                ans = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + ans);
                break;

            case '-':
                ans = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + ans);
                break;

            case '*':
                ans = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + ans);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    ans = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + ans);
                }
                break;

            default:
                System.out.println("Invalid operator entered!");
        }

        sc.close();
    }
}

class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Special Character");
        }

        sc.close();
    }
}

class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find factorial: ");
        int n = sc.nextInt();

        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + fact);

        sc.close();
    }
}

class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many terms of Fibonacci you want: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int next;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        sc.close();
    }
}

class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check prime: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is NOT a Prime number");
        }

        sc.close();
    }
}

class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers between 1 and " + n + " are:");

        for (int i = 2; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}

class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check palindrome: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (original == rev) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is NOT a Palindrome number");
        }

        sc.close();
    }
}

class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check Armstrong: ");
        int num = sc.nextInt();

        int original = num;
        int total = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int rem = num % 10;
            total = total + (int) Math.pow(rem, digits);
            num = num / 10;
        }

        if (original == total) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }

        sc.close();
    }
}

class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check Strong number: ");
        int num = sc.nextInt();

        int original = num;
        int total = 0;

        while (num != 0) {
            int digit = num % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            total = total + fact;
            num = num / 10;
        }

        if (original == total) {
            System.out.println(original + " is a Strong number");
        } else {
            System.out.println(original + " is NOT a Strong number");
        }

        sc.close();
    }
}

class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Original number = " + original);
        System.out.println("Reversed number = " + rev);

        sc.close();
    }
}

class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find sum of digits: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits of " + original + " is: " + sum);

        sc.close();
    }
}

class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {
            int rem = y;
            y = x % y;
            x = rem;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("GCD (HCF) of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);

        sc.close();
    }
}

class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

class q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

class q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

class q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int s = 1; s <= rows - i - 1; s++) {
                System.out.print(" ");
            }

            int val = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}

class q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}

class q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}