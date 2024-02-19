import java.util.Scanner;

class HelloWorld {

    

public static void main(String[] args) {

    System.out.println("Please Input Your Numbers");

    Scanner scanner = new Scanner(System.in);
    
    int numberOne = Integer.parseInt(scanner.nextLine());
    int numberTwo = Integer.parseInt(scanner.nextLine());

    int sum = numberOne + numberTwo;

    System.out.println(sum);
}


}