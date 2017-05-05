import java.security.SecureRandom;

public class Main {
    static public void main(String[] args) {
        //Example1();
        //Example2();
        //Example3();
        //Example4();
        //Example5();
        Example6();
    }

    static private void Example1() {
        int array[] = new int[20];
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(5);
            System.out.print(array[i] + " ");
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == temp) {
                    array[j] = 0;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

    static private void Example2() {
        int array[] = new int[20];
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(10);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && i % 2 == 1) {
                array[i] = 0;
            }
            if (array[i] % 3 == 0 || array[i] % 5 == 0) {
                array[i] = 0;
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static private void Example3() {
        int array[] = new int[10];
        int sum = 0;

        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(20);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("\n" + sum);
    }

    static private void Example4() {
        int array[] = new int[20];
        int mult = 1;

        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(20);
            System.out.print(array[i] + " ");
            if (array[i] % 9 == 0) {
                mult *= array[i];
            }
        }
        System.out.println("\n" + mult);
    }
    static private void Example5() {
        int array[] = new int[30];
        int A = 100;

        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i <array.length ; i++) {
            array[i] = secureRandom.nextInt(2);
            System.out.print(array[i] + " ");
            }
        for (int i = 0; i <array.length ; i++) {
            if (array[i] ==0 ){
                A -= 1;
            }
            else if (array[i] ==1){
                A += 2;

            }
        }
        System.out.println("\nУлитка уползла на " + A + " см от начала дерева.");
    }
    static private void Example6() {
    int n = 12;
    int R[] = new int[n];
    int D[] = new int[n];
    int P[] = new int[n];
    int pribil = 0;
    int minMonth = 0;
    int maxMonth = 0;

    SecureRandom secureRandom = new SecureRandom();
        System.out.print("Расход: ");
        for (int i = 0; i < R.length ; i++) {
            R[i] = secureRandom.nextInt(800);
            System.out.print(R[i] + " ");
            }
        System.out.print("\nДоход: ");
        for (int i = 0; i <D.length ; i++) {
            D[i] = secureRandom.nextInt(1000);
            System.out.print(D[i] + " ");
        }
        System.out.print("\nПрибыль: ");
        for (int i = 0; i <P.length ; i++) {
            P[i] = D[i] - R[i];
            System.out.print(P[i] + " ");
        }


    }

}
