import javax.swing.*;
public class Lab104 {
	public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the Payroll Application");

        String name = JOptionPane.showInputDialog(null, "Enter Employee name");
        int totalHour = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total hour for this employee."));
        float grossEarnings = (float)(totalHour * 7.5);
        float tax = (float)(grossEarnings * 0.15);
        float netEarnings = (float)(grossEarnings - tax);

        String message = ("Employee name: " + name) +"\n"+("Hours Worked: " + totalHour) +"\n"+("Hourly wage: $7.5") +"\n"+
        ("Gross Earnings: $" + grossEarnings) +"\n"+("Tax rate: 0.15") +"\n"+("Tax: $" + tax) +"\n"+("Net earnings: $"+netEarnings);
        JOptionPane.showMessageDialog(null, message);
    }
}
