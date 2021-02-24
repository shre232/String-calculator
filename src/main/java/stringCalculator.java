public class stringCalculator {

    public static int Add(String numbers) {
        String[] num = numbers.split(",");
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else {
            return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);


        }
    }}