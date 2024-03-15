package Lab01;

import javax.swing.JOptionPane;

public class Days_Month_Year {
    private static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
    };
    private static final String[] MONTH_ABBREVIATIONS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    private static final String[] MONTH_NUMBERS = {
            "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"
    };
    private static final int[] DAYS_IN_MONTHS_NON_LEAP = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    private static final int[] DAYS_IN_MONTHS_LEAP = {
            31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        while (true) {
            String inputMonth = JOptionPane.showInputDialog(null, "Please input month: ", "Enter the month:",
                    JOptionPane.INFORMATION_MESSAGE);
            int monthIndex = getMonthIndex(inputMonth);

            if (monthIndex == -1) {
                JOptionPane.showMessageDialog(null, "Please enter a valid month.", "Invalid month input",
                        JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            while (true) {
                String inputYear = JOptionPane.showInputDialog(null, "Please input year: ", "Enter the year:",
                        JOptionPane.INFORMATION_MESSAGE);
                if (!isNumeric(inputYear)) {
                    JOptionPane.showMessageDialog(null, "Please enter a non-negative integer.", "Invalid year input",
                            JOptionPane.INFORMATION_MESSAGE);
                    continue;
                }

                int year = Integer.parseInt(inputYear);
                int[] daysInMonth = isLeapYear(year) ? DAYS_IN_MONTHS_LEAP : DAYS_IN_MONTHS_NON_LEAP;
                int days = daysInMonth[monthIndex];

                JOptionPane.showMessageDialog(null, "Number of days in " + MONTHS[monthIndex] + ": " + days,
                        "Calendar in " + year, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }

    private static int getMonthIndex(String input) {
        for (int i = 0; i < MONTHS.length; i++) {
            if (MONTHS[i].equalsIgnoreCase(input) || MONTH_ABBREVIATIONS[i].equalsIgnoreCase(input)
                    || MONTH_NUMBERS[i].equals(input)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}