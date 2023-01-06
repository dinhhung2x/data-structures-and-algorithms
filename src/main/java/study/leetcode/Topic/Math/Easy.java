package study.leetcode.Topic.Math;

public class Easy {

    public boolean _9PalindromeNumber(int number) {
        if (number < -9) {
            return false;
        }
        String numberCal = String.valueOf(number);
        int lengthNum = numberCal.length();
        String[] spl = numberCal.split("");

        for (int i = 0; i < lengthNum / 2; i++) {

            if (!spl[i].equals(spl[lengthNum - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    public int _13RomanToInteger(String numberRoman) {
        int answer = 0, number = 0, prev = 0;
        for (int i = numberRoman.length() - 1; i >= 0; i--) {
            switch (numberRoman.charAt(i)) {
                case 'M':
                    number = 1000;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'I':
                    number = 1;
                    break;
            }
            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}
