import java.util.Scanner;

class q65
{
	static boolean checkPrime(int num)
	{
		if(num < 2)
		{
			return false;
		}
		for(int i = 2; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	static boolean checkArmstrong(int num)
	{
		int original = num;
		int total = 0;
		int digits = String.valueOf(num).length();

		while(num != 0)
		{
			int rem = num % 10;
			total = total + (int) Math.pow(rem, digits);
			num = num / 10;
		}

		return original == total;
	}

	static boolean checkPerfect(int num)
	{
		int sum = 0;
		for(int i = 1; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		if(checkPrime(n))
		{
			System.out.println(n + " is a Prime number");
		}
		else
		{
			System.out.println(n + " is NOT a Prime number");
		}

		if(checkArmstrong(n))
		{
			System.out.println(n + " is an Armstrong number");
		}
		else
		{
			System.out.println(n + " is NOT an Armstrong number");
		}

		if(checkPerfect(n))
		{
			System.out.println(n + " is a Perfect number");
		}
		else
		{
			System.out.println(n + " is NOT a Perfect number");
		}

		sc.close();
	}
}


class q66
{
	static int val = 10;

	static void callByValue(int num)
	{
		num = num + 100;
		System.out.println("Inside callByValue function, num = " + num);
	}

	static void callByReference(int arr[])
	{
		arr[0] = arr[0] + 100;
		System.out.println("Inside callByReference function, arr[0] = " + arr[0]);
	}

	public static void main(String[] args)
	{
		int num = 10;
		System.out.println("Before callByValue, num = " + num);
		callByValue(num);
		System.out.println("After callByValue, num = " + num);

		System.out.println();

		int arr[] = {10};
		System.out.println("Before callByReference, arr[0] = " + arr[0]);
		callByReference(arr);
		System.out.println("After callByReference, arr[0] = " + arr[0]);
	}
}


class q67
{
	static long factorial(int n)
	{
		if(n == 0 || n == 1)
		{
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find factorial: ");
		int n = sc.nextInt();

		long ans = factorial(n);
		System.out.println("Factorial of " + n + " = " + ans);

		sc.close();
	}
}


class q68
{
	static int gcd(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();

		int ans = gcd(a, b);
		System.out.println("GCD of " + a + " and " + b + " = " + ans);

		sc.close();
	}
}


class q69
{
	static void hanoi(int discs, char from, char to, char helper)
	{
		if(discs == 1)
		{
			System.out.println("Move disc 1 from " + from + " to " + to);
			return;
		}
		hanoi(discs - 1, from, helper, to);
		System.out.println("Move disc " + discs + " from " + from + " to " + to);
		hanoi(discs - 1, helper, to, from);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of discs: ");
		int n = sc.nextInt();

		System.out.println("Steps to solve Tower of Hanoi with " + n + " discs:");
		hanoi(n, 'A', 'C', 'B');

		sc.close();
	}
}


class q70
{
	static void reverseSentence(String words[], int idx)
	{
		if(idx < 0)
		{
			return;
		}
		System.out.print(words[idx] + " ");
		reverseSentence(words, idx - 1);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();

		String words[] = sentence.split(" ");

		System.out.print("Reversed sentence: ");
		reverseSentence(words, words.length - 1);
		System.out.println();

		sc.close();
	}
}


class q71
{
	static double power(double base, int exp)
	{
		if(exp == 0)
		{
			return 1;
		}
		if(exp < 0)
		{
			return 1 / base * power(1 / base, -exp - 1);
		}
		return base * power(base, exp - 1);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter base number: ");
		double base = sc.nextDouble();

		System.out.println("Enter exponent: ");
		int exp = sc.nextInt();

		double ans = power(base, exp);
		System.out.println(base + " raised to power " + exp + " = " + ans);

		sc.close();
	}
}


class q72
{
	static int sumNatural(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		return n + sumNatural(n - 1);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int ans = sumNatural(n);
		System.out.println("Sum of first " + n + " natural numbers = " + ans);

		sc.close();
	}
}