import java.util.Arrays;

public class stringCalculator {
    int count;

    String[] num;
    public int Add(String numbers) throws Exception {

        count++;

        if (numbers.isEmpty()) {
            return 0;

        }
        String delimiter;
        if(numbers.length() > 2 && numbers.charAt(2)=='['){
            int endOfDelimeter = numbers.indexOf(']');

            delimiter = numbers.substring(3, endOfDelimeter);
            String sub1 =numbers.substring(delimiter.length()+5);
            num =sub1.split("\\*\\*\\*");
            System.out.println(delimiter);



        }
        else if (numbers.startsWith("/") ) {
            delimiter = numbers.substring(2, 3);
            String sub = numbers.substring(4);
            num = sub.split(delimiter);
        }else {
            num = numbers.split(",|\n");}
//        else{
//            delimiter="";
//        }


        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
//              System.out.println(Arrays.toString(num));
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
    public int Count() {
        return count;
    }
}