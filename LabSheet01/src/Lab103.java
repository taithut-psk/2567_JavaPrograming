import javax.swing.*;
public class Lab103 {

	public static void main(String[] args) {
		int parking = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Time Parking (minute) : "));
		int min = (parking % 60);        
		int hour = parking / 60;
	        
	        float amout = (hour * 50) + (float)(min * 0.25);
	        String format = String.format("%,.2f", amout);

	        String message = "You parking " + hour + " Hour " + min + " Minute.\nAmount to be paid is "+ format +" Baht";

	        JOptionPane.showMessageDialog(null, message);
	}

}
