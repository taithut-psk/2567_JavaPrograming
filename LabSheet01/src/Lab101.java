import java.util.*;
public class Lab101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Input Product Name    : ");
        String productName = sc.nextLine();

        System.out.print("Input Product Unit    : ");
        int productUnit = sc.nextInt();

        System.out.print("Input Price per Unit  : ");
        double unitPrice = sc.nextDouble();

        System.out.println("--------------------------------");
        float totalPrice = (float)unitPrice * productUnit;
        System.out.printf("Total Price is %,.2f baht.%n", totalPrice);
        System.out.println("--------------------------------");
        System.out.print("How many discount (%) : ");
        int discount = sc.nextInt();
	float discount_2 = totalPrice * discount / 100;
        System.out.println("--------------------------------");
        System.out.printf("Discount from %S %%\t %,.2f baht.%n", discount, discount_2);
        float sum = totalPrice - discount_2;
        System.out.printf("Amount to be paid \t %,.2f baht.%n", sum);

        sc.close();

	}

}
