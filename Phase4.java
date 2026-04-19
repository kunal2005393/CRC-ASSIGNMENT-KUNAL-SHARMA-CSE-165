import java.util.Scanner;

class q54
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		int len = 0;
		for(int i = 0; i < str.length(); i++)
		{
			len++;
		}

		System.out.println("Length of string = " + len);

		sc.close();
	}
}


class q55
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to copy: ");
		String str = sc.nextLine();

		String copy = "";
		for(int i = 0; i < str.length(); i++)
		{
			copy = copy + str.charAt(i);
		}

		System.out.println("Original string: " + str);
		System.out.println("Copied string: " + copy);

		sc.close();
	}
}


class q56
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();

		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();

		String result = "";

		for(int i = 0; i < str1.length(); i++)
		{
			result = result + str1.charAt(i);
		}

		for(int i = 0; i < str2.length(); i++)
		{
			result = result + str2.charAt(i);
		}

		System.out.println("Concatenated string: " + result);

		sc.close();
	}
}


class q57
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();

		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();

		boolean same = true;

		if(str1.length() != str2.length())
		{
			same = false;
		}
		else
		{
			for(int i = 0; i < str1.length(); i++)
			{
				if(str1.charAt(i) != str2.charAt(i))
				{
					same = false;
					break;
				}
			}
		}

		if(same == true)
		{
			System.out.println("Both strings are Equal");
		}
		else
		{
			System.out.println("Strings are NOT Equal");
		}

		sc.close();
	}
}


class q58
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to reverse: ");
		String str = sc.nextLine();

		String rev = "";

		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + rev);

		sc.close();
	}
}


class q59
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to check palindrome: ");
		String str = sc.nextLine();

		String rev = "";

		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}

		if(str.equals(rev))
		{
			System.out.println(str + " is a Palindrome");
		}
		else
		{
			System.out.println(str + " is NOT a Palindrome");
		}

		sc.close();
	}
}


class q60
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int spaces = 0;

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				vowels++;
			}
			else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			{
				consonants++;
			}
			else if(ch >= '0' && ch <= '9')
			{
				digits++;
			}
			else if(ch == ' ')
			{
				spaces++;
			}
		}

		System.out.println("Vowels = " + vowels);
		System.out.println("Consonants = " + consonants);
		System.out.println("Digits = " + digits);
		System.out.println("Spaces = " + spaces);

		sc.close();
	}
}


class q61
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		String lower = "";
		String upper = "";

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			if(ch >= 'A' && ch <= 'Z')
			{
				lower = lower + (char)(ch + 32);
			}
			else
			{
				lower = lower + ch;
			}

			if(ch >= 'a' && ch <= 'z')
			{
				upper = upper + (char)(ch - 32);
			}
			else
			{
				upper = upper + ch;
			}
		}

		System.out.println("Lowercase: " + lower);
		System.out.println("Uppercase: " + upper);

		sc.close();
	}
}


class q62
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of strings: ");
		int n = sc.nextInt();
		sc.nextLine();

		String words[] = new String[n];

		System.out.println("Enter " + n + " strings: ");
		for(int i = 0; i < n; i++)
		{
			words[i] = sc.nextLine();
		}

		for(int i = 0; i < n - 1; i++)
		{
			for(int j = 0; j < n - i - 1; j++)
			{
				if(words[j].compareTo(words[j + 1]) > 0)
				{
					String temp = words[j];
					words[j] = words[j + 1];
					words[j + 1] = temp;
				}
			}
		}

		System.out.println("Strings in alphabetical order: ");
		for(int i = 0; i < n; i++)
		{
			System.out.println(words[i]);
		}

		sc.close();
	}
}


class q63
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		String result = "";

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			{
				result = result + ch;
			}
		}

		System.out.println("Original string: " + str);
		System.out.println("After removing non-alphabets: " + result);

		sc.close();
	}
}


class q64
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		System.out.println("Frequency of each character: ");

		boolean visited[] = new boolean[str.length()];

		for(int i = 0; i < str.length(); i++)
		{
			if(visited[i] == false)
			{
				int count = 1;
				for(int j = i + 1; j < str.length(); j++)
				{
					if(str.charAt(i) == str.charAt(j))
					{
						count++;
						visited[j] = true;
					}
				}
				System.out.println("'" + str.charAt(i) + "' appears " + count + " time(s)");
			}
		}

		sc.close();
	}
}