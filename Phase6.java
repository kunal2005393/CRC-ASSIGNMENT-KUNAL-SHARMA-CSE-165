import java.util.Scanner;

class q73
{
	static int head = -1;
	static int data[] = new int[100];
	static int next[] = new int[100];
	static int size = 0;

	static void insert(int val)
	{
		data[size] = val;
		next[size] = -1;

		if(head == -1)
		{
			head = size;
		}
		else
		{
			int temp = head;
			while(next[temp] != -1)
			{
				temp = next[temp];
			}
			next[temp] = size;
		}
		size++;
		System.out.println(val + " inserted successfully");
	}

	static void delete(int val)
	{
		if(head == -1)
		{
			System.out.println("List is empty");
			return;
		}

		if(data[head] == val)
		{
			head = next[head];
			System.out.println(val + " deleted successfully");
			return;
		}

		int prev = head;
		int curr = next[head];

		while(curr != -1)
		{
			if(data[curr] == val)
			{
				next[prev] = next[curr];
				System.out.println(val + " deleted successfully");
				return;
			}
			prev = curr;
			curr = next[curr];
		}

		System.out.println(val + " not found in list");
	}

	static void display()
	{
		if(head == -1)
		{
			System.out.println("List is empty");
			return;
		}

		int temp = head;
		System.out.print("Linked List: ");
		while(temp != -1)
		{
			System.out.print(data[temp] + " -> ");
			temp = next[temp];
		}
		System.out.println("NULL");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;

		do
		{
			System.out.println("\n1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();

			if(choice == 1)
			{
				System.out.println("Enter value to insert: ");
				int val = sc.nextInt();
				insert(val);
			}
			else if(choice == 2)
			{
				System.out.println("Enter value to delete: ");
				int val = sc.nextInt();
				delete(val);
			}
			else if(choice == 3)
			{
				display();
			}
			else if(choice == 4)
			{
				System.out.println("Exiting...");
			}
			else
			{
				System.out.println("Invalid choice!");
			}

		} while(choice != 4);

		sc.close();
	}
}


class q74
{
	static int head = -1;
	static int data[] = new int[100];
	static int next[] = new int[100];
	static int size = 0;

	static void insert(int val)
	{
		data[size] = val;
		next[size] = -1;

		if(head == -1)
		{
			head = size;
		}
		else
		{
			int temp = head;
			while(next[temp] != -1)
			{
				temp = next[temp];
			}
			next[temp] = size;
		}
		size++;
	}

	static void reverse()
	{
		int prev = -1;
		int curr = head;
		int nxt;

		while(curr != -1)
		{
			nxt = next[curr];
			next[curr] = prev;
			prev = curr;
			curr = nxt;
		}

		head = prev;
	}

	static void display()
	{
		int temp = head;
		System.out.print("Linked List: ");
		while(temp != -1)
		{
			System.out.print(data[temp] + " -> ");
			temp = next[temp];
		}
		System.out.println("NULL");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " elements: ");
		for(int i = 0; i < n; i++)
		{
			int val = sc.nextInt();
			insert(val);
		}

		System.out.print("Before reversing -> ");
		display();

		reverse();

		System.out.print("After reversing  -> ");
		display();

		sc.close();
	}
}


class q75
{
	static int head = -1;
	static int data[] = new int[100];
	static int next[] = new int[100];
	static int prev[] = new int[100];
	static int size = 0;

	static void insert(int val)
	{
		data[size] = val;
		next[size] = -1;
		prev[size] = -1;

		if(head == -1)
		{
			head = size;
		}
		else
		{
			int temp = head;
			while(next[temp] != -1)
			{
				temp = next[temp];
			}
			next[temp] = size;
			prev[size] = temp;
		}
		size++;
		System.out.println(val + " inserted successfully");
	}

	static void delete(int val)
	{
		if(head == -1)
		{
			System.out.println("List is empty");
			return;
		}

		int temp = head;

		while(temp != -1)
		{
			if(data[temp] == val)
			{
				if(prev[temp] != -1)
				{
					next[prev[temp]] = next[temp];
				}
				else
				{
					head = next[temp];
				}

				if(next[temp] != -1)
				{
					prev[next[temp]] = prev[temp];
				}

				System.out.println(val + " deleted successfully");
				return;
			}
			temp = next[temp];
		}

		System.out.println(val + " not found");
	}

	static void displayForward()
	{
		int temp = head;
		System.out.print("Forward: ");
		while(temp != -1)
		{
			System.out.print(data[temp] + " <-> ");
			temp = next[temp];
		}
		System.out.println("NULL");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;

		do
		{
			System.out.println("\n1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();

			if(choice == 1)
			{
				System.out.println("Enter value to insert: ");
				int val = sc.nextInt();
				insert(val);
			}
			else if(choice == 2)
			{
				System.out.println("Enter value to delete: ");
				int val = sc.nextInt();
				delete(val);
			}
			else if(choice == 3)
			{
				displayForward();
			}
			else if(choice == 4)
			{
				System.out.println("Exiting...");
			}
			else
			{
				System.out.println("Invalid choice!");
			}

		} while(choice != 4);

		sc.close();
	}
}


class q76
{
	static int arr[] = new int[100];
	static int top = -1;

	static void push(int val)
	{
		if(top == 99)
		{
			System.out.println("Stack is full (Overflow)");
			return;
		}
		top++;
		arr[top] = val;
		System.out.println(val + " pushed to stack");
	}

	static void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty (Underflow)");
			return;
		}
		System.out.println(arr[top] + " popped from stack");
		top--;
	}

	static void peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Top element = " + arr[top]);
	}

	static void display()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		System.out.print("Stack (top to bottom): ");
		for(int i = top; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;

		do
		{
			System.out.println("\n1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();

			if(choice == 1)
			{
				System.out.println("Enter value to push: ");
				int val = sc.nextInt();
				push(val);
			}
			else if(choice == 2)
			{
				pop();
			}
			else if(choice == 3)
			{
				peek();
			}
			else if(choice == 4)
			{
				display();
			}
			else if(choice == 5)
			{
				System.out.println("Exiting...");
			}
			else
			{
				System.out.println("Invalid choice!");
			}

		} while(choice != 5);

		sc.close();
	}
}


class q77
{
	static int arr[] = new int[100];
	static int front = -1;
	static int rear = -1;

	static void enqueue(int val)
	{
		if(rear == 99)
		{
			System.out.println("Queue is full (Overflow)");
			return;
		}
		if(front == -1)
		{
			front = 0;
		}
		rear++;
		arr[rear] = val;
		System.out.println(val + " added to queue");
	}

	static void dequeue()
	{
		if(front == -1 || front > rear)
		{
			System.out.println("Queue is empty (Underflow)");
			return;
		}
		System.out.println(arr[front] + " removed from queue");
		front++;
	}

	static void display()
	{
		if(front == -1 || front > rear)
		{
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Queue (front to rear): ");
		for(int i = front; i <= rear; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;

		do
		{
			System.out.println("\n1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();

			if(choice == 1)
			{
				System.out.println("Enter value to enqueue: ");
				int val = sc.nextInt();
				enqueue(val);
			}
			else if(choice == 2)
			{
				dequeue();
			}
			else if(choice == 3)
			{
				display();
			}
			else if(choice == 4)
			{
				System.out.println("Exiting...");
			}
			else
			{
				System.out.println("Invalid choice!");
			}

		} while(choice != 4);

		sc.close();
	}
}


class q78
{
	static int data[] = new int[100];
	static int next[] = new int[100];
	static int top = -1;
	static int size = 0;

	static void push(int val)
	{
		data[size] = val;
		next[size] = top;
		top = size;
		size++;
		System.out.println(val + " pushed to stack");
	}

	static void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty (Underflow)");
			return;
		}
		System.out.println(data[top] + " popped from stack");
		top = next[top];
	}

	static void peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Top element = " + data[top]);
	}

	static void display()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		int temp = top;
		System.out.print("Stack (top to bottom): ");
		while(temp != -1)
		{
			System.out.print(data[temp] + " ");
			temp = next[temp];
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;

		do
		{
			System.out.println("\n1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();

			if(choice == 1)
			{
				System.out.println("Enter value to push: ");
				int val = sc.nextInt();
				push(val);
			}
			else if(choice == 2)
			{
				pop();
			}
			else if(choice == 3)
			{
				peek();
			}
			else if(choice == 4)
			{
				display();
			}
			else if(choice == 5)
			{
				System.out.println("Exiting...");
			}
			else
			{
				System.out.println("Invalid choice!");
			}

		} while(choice != 5);

		sc.close();
	}
}


class q79
{
	static char stack[] = new char[100];
	static int top = -1;

	static void push(char ch)
	{
		top++;
		stack[top] = ch;
	}

	static char pop()
	{
		if(top == -1)
		{
			return ' ';
		}
		char ch = stack[top];
		top--;
		return ch;
	}

	static boolean isBalanced(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			if(ch == '(' || ch == '{' || ch == '[')
			{
				push(ch);
			}
			else if(ch == ')' || ch == '}' || ch == ']')
			{
				char popped = pop();

				if(ch == ')' && popped != '(')
				{
					return false;
				}
				if(ch == '}' && popped != '{')
				{
					return false;
				}
				if(ch == ']' && popped != '[')
				{
					return false;
				}
			}
		}

		return top == -1;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string with brackets: ");
		String str = sc.nextLine();

		if(isBalanced(str))
		{
			System.out.println("Brackets are Balanced");
		}
		else
		{
			System.out.println("Brackets are NOT Balanced");
		}

		sc.close();
	}
}


class q80
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int num = sc.nextInt();

		System.out.println("Enter bit position (0 to 31): ");
		int pos = sc.nextInt();

		int result = num & (1 << pos);

		if(result != 0)
		{
			System.out.println("Bit at position " + pos + " is SET (1)");
		}
		else
		{
			System.out.println("Bit at position " + pos + " is NOT SET (0)");
		}

		sc.close();
	}
}


class q81
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int num = sc.nextInt();

		System.out.println("Enter bit position to toggle (0 to 31): ");
		int pos = sc.nextInt();

		int result = num ^ (1 << pos);

		System.out.println("Original number = " + num);
		System.out.println("After toggling bit " + pos + " = " + result);

		sc.close();
	}
}


class q82
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int num = sc.nextInt();

		int original = num;
		int count = 0;

		while(num != 0)
		{
			count = count + (num & 1);
			num = num >> 1;
		}

		System.out.println("Number of set bits in " + original + " = " + count);

		sc.close();
	}
}