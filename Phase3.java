import java.util.Scanner;

class q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + avg);

        sc.close();
    }
}

class q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);

        sc.close();
    }
}

class q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n + 1];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to insert (0 to " + n + "): ");
        int pos = sc.nextInt();

        System.out.println("Enter the element to insert: ");
        int val = sc.nextInt();

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = val;

        System.out.println("Array after insertion: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to delete (0 to " + (n - 1) + "): ");
        int pos = sc.nextInt();

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Array after deletion: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (result[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                result[k] = arr[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];

        System.out.println("Enter " + n1 + " elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter " + n2 + " elements of second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int merged[] = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        System.out.println("Merged array: ");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(merged[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of positions to rotate: ");
        int pos = sc.nextInt();

        System.out.println("Enter direction (1 for Left, 2 for Right): ");
        int dir = sc.nextInt();

        pos = pos % n;

        if (dir == 1) {
            int temp[] = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = arr[(i + pos) % n];
            }
            arr = temp;
        } else {
            int temp[] = new int[n];
            for (int i = 0; i < n; i++) {
                temp[(i + pos) % n] = arr[i];
            }
            arr = temp;
        }

        System.out.println("Array after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        int found = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            System.out.println("Element " + key + " found at index " + found);
        } else {
            System.out.println("Element " + key + " not found in array");
        }

        sc.close();
    }
}

class q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of sorted array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int mid;
        int found = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                found = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found != -1) {
            System.out.println("Element " + key + " found at index " + found);
        } else {
            System.out.println("Element " + key + " not found in array");
        }

        sc.close();
    }
}

class q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array using Selection Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

class q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int sum[][] = new int[row][col];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of two matrices: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

class q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int result[][] = new int[r1][c2];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] = result[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of two matrices: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

class q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        int t[][] = new int[col][row];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                t[j][i] = a[i][j];
            }
        }

        System.out.println("Transpose of matrix: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

class q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of square matrix: ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean sym = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    sym = false;
                    break;
                }
            }
        }

        if (sym == true) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is NOT Symmetric");
        }

        sc.close();
    }
}

class q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of square matrix: ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int mainDiagSum = 0;
        int secDiagSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagSum = mainDiagSum + a[i][i];
            secDiagSum = secDiagSum + a[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal elements = " + mainDiagSum);
        System.out.println("Sum of secondary diagonal elements = " + secDiagSum);

        sc.close();
    }
}

class q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        boolean equal = true;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] != b[i][j]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal == true) {
            System.out.println("Both matrices are Equal");
        } else {
            System.out.println("Matrices are NOT Equal");
        }

        sc.close();
    }
}