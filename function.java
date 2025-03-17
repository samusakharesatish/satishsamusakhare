package satishsamusakhare;
import java.util.Scanner;

// public class function{

//     public static void myNamePrint(String name) {
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();

//         myNamePrint(name);      //call the function
        
//     }
    
// }

public class function{

    public static int printValue(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = printValue(a,b);
        System.out.println(sum);


    }
}