import java.util.Arrays;

public class stringCalculator {
int count=0;
    String[] num;
    public int Add(String numbers) throws Exception {
        count++;
//        for (int i = 0; i < numbers.length(); i++) {
//            if (Integer.parseInt(String.valueOf(i)) < 0) {
//                throw new Exception("Negative Input");
//            } else if (Integer.parseInt(String.valueOf(i)) <= 1000); {
//                continue;
//            }
//        }
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.startsWith("/") ) {
            String delimiter = numbers.substring(2,3);


            String sub = numbers.substring(4);
            num =sub.split(delimiter);

        } else {
            num = numbers.split(",|\n");

        }

  //      System.out.println(Arrays.toString(num));
        if (num.length == 1) {
            return Integer.parseInt(num[0]);
        } else {
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i].startsWith("-")){
                    throw new Exception("Negative Input");
                }
                else if (Integer.parseInt(num[i])>=1000){
                    continue;
                }
                sum += Integer.parseInt(num[i]);

            }
            return sum;
        }
    }
    public int count() {
        return count;
    }
}