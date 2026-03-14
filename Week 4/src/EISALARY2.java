
import java.util.Scanner;

public class EISALARY2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfEmployees = sc.nextInt();
        double totalSalaryOfficeHour = 0;
        double totalOfficeHours = 0;
        double totalSalaryOvertime = 0;
        double totalOvertimHours = 0;
        for (int i = 0; i < numOfEmployees; i++) {
            double[] hours = new double[5];
            for (int j = 0; j < hours.length; j++) {
                hours[j] = sc.nextDouble();
            }
            double hourlyPay = sc.nextDouble();
            double weaklyPay = 0;
            for (int j = 0; j < hours.length; j++) {
                //for each employees each day
                double dailyHours = hours[j];
                double regularHours = Math.min(dailyHours, 8.0);
                double overtimHours = Math.max(0.0, dailyHours - 8);
                double dailyPay = regularHours * hourlyPay + overtimHours * hourlyPay * 1.5;
                weaklyPay += dailyPay;
                totalSalaryOfficeHour += regularHours * hourlyPay;
                totalOfficeHours += regularHours;
                totalSalaryOvertime += overtimHours * 1.5 * hourlyPay;
                totalOvertimHours += overtimHours;
            }
            System.out.println(Math.round(weaklyPay * 100) / 100d);
        }
        System.out.println(totalOfficeHours == 0 ? 0 : Math.round((totalSalaryOfficeHour / totalOfficeHours) * 100) / 100d);
        System.out.println(totalOvertimHours == 0 ? 0 : Math.round((totalSalaryOvertime / totalOvertimHours) * 100) / 100d);
    }// Double.compare(0,totalOfficeHours)==0 so sanh 2 so gan bang nhau
}
