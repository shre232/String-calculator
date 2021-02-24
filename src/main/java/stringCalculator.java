public class stringCalculator {

    public static int Add(String numbers) {
        String[] num = numbers.split(",");
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else {
            int sum=0;
            for (int i=0;i<num.length;i++){
                sum+=Integer.parseInt(num[i]);
            }
            return sum;

        }
    }}