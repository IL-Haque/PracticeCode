
public class Grade {
    public static double getNumericGrade(String letterGrade) {
        char grade = Character.toUpperCase(letterGrade.charAt(0));
        double numericGrade = 0.0;
        if (grade == 'A') {
            numericGrade = 4.0;
        } else if (grade == 'B') {
            numericGrade = 3.0;
        } else if (grade == 'C') {
            numericGrade = 2.0;
        } else if (grade == 'D') {
            numericGrade = 1.0;
        } else if (grade == 'F') {
            numericGrade = 0.0;
        } else {
            return -1.0;
        }

        if (letterGrade.length() > 1) {
            char modifier = letterGrade.charAt(1);
            if (modifier == '+') {
                numericGrade += 0.3;
            } else if (modifier == '-') {
                numericGrade -= 0.3;
            }
        }
        return numericGrade;
    }

}
