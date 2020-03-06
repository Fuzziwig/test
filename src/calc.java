import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("indtast et tal");
        int a = 0;
        try{
            a = Integer.parseInt(input.next());
            System.out.println(a);
        }
        catch (Exception e) {
            System.out.println("input is not an integer");
        }


    }


}
