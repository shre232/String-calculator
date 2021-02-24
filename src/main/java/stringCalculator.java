
public class stringCalculator {

    String[] num= {};
    public  int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }


//            if(numbers.charAt(0) == '\\') {
//              char delimitor = numbers.charAt(2);
//
//               num = numbers.substring(4).split("delimiter|\n");
//               return Integer.parseInt(numbers);     }
//           else {
                num = numbers.split(",|\n");
//           }


            if (numbers.length() == 1) {
                return Integer.parseInt(numbers);}
              else{  int sum = 0;
                for (int i = 0; i < num.length; i++) {

                    sum += Integer.parseInt(num[i]);
                }
                return sum;
            }





        }}