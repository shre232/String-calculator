
public class stringCalculator {
int count=0;
    String[] num= {};
    public int Add(String numbers) throws Exception {

        count++;

        for (int i = 0; i < num.length; i++)
            if (Integer.parseInt(String.valueOf(i)) < 0) {
                throw new Exception("Negative Input");
            } else if (Integer.parseInt(String.valueOf(i)) < 1000) {
                continue;
            }

        if (numbers.isEmpty()) {
            return 0;

        }


//        if (numbers.charAt(0) == '\\') {
//            char delimitor = numbers.charAt(2);
//
//            num = numbers.substring(4).split(" delimiter|\n ");
//            return Integer.parseInt(numbers);
//        } else {
            num = numbers.split(",|\n");

//        }


        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else {
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum += Integer.parseInt(num[i]);
            }
            return sum;


        }


    }

    public int count() {
        return count;
    }
}