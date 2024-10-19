import java.io.FileInputStream;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("Data.txt"));
        
        
            int sum =0;
            while (sc.hasNext()) {
                int number = sc.nextInt();
                if (number>0) {
                    sum+=number;
                } else {
                    sum+=0;
                } 
            }
            System.out.println("The sum is: "+sum);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
// change 1
