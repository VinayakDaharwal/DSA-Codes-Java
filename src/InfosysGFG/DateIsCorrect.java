package InfosysGFG;

public class DateIsCorrect {


        public static void main(String[] args) {

            int d = 23;
            int m = 8;
            int y = 2003;

            boolean ans = true;

            // Check year, month and day range
            if (y > 9999 || y < 1800)
                ans = false;
            else if (m < 1 || m > 12)
                ans = false;
            else if (d < 1 || d > 31)
                ans = false;
            else if (m == 2) {

                // Check leap year
                boolean leap = ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));

                if (leap) {
                    if (d > 29) ans = false;
                } else {
                    if (d > 28) ans = false;
                }
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d > 30) ans = false;
            }

            System.out.println(ans);


        }
    }

