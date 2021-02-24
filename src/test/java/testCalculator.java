import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class testCalculate {
    stringCalculator stringcalculator=new stringCalculator();

    @Test
    public void emptyStringReturnZero() throws Exception {
        stringCalculator stringcalculator=new stringCalculator();
        Assertions.assertEquals(stringcalculator.Add(""), 0);
    }

    @Test
    public void number_for_one_number() throws Exception {
        Assertions.assertEquals(stringcalculator.Add("1") ,1);
    }
    @Test
    public void sum_of_two_numbers() throws Exception {
        Assertions.assertEquals(stringcalculator.Add("1,2"), 3);
    }
    @Test
    public void sum_of_unknown_numbers() throws Exception {
        Assertions.assertEquals(stringcalculator.Add("1,2,3"), 6);
    }
    @Test
    public void sum_of_two_with_newline_delimeter_numbers() throws Exception {
        Assertions.assertEquals(stringcalculator.Add( "1\n2"),3);
    }
//    @Test
//    public void supporting_different_delimiters()throws Exception{
//        Assertions.assertEquals (stringcalculator.Add("//;\n1;2"),3);
//}
@Test
        public void negative_number_return_exeption() throws Exception {
       stringcalculator.Add("-1");
    }

public void numbers_greater_than_1000()throws Exception {
    Assertions.assertEquals(stringcalculator.Add("2,2,1000"),4);
   }
    @Test    public void getAddCalledCount() throws Exception {
        stringcalculator.Add("1,3");
        Assertions.assertEquals(stringcalculator.count(),1);
}}
