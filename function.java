package satishsamusakhare;
import java.util.Scanner;

public class function{

    public static void myNamePrint(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        myNamePrint(name);      //call the function
        
    }
    
}
