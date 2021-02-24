import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class testCalculate {
    stringCalculator stringcalculator=new stringCalculator();

    @Test
    public void emptyStringReturnZero() {
        stringCalculator stringcalculator=new stringCalculator();
        Assertions.assertEquals(stringcalculator.Add(""), 0);
    }

    @Test
    public void number_for_one_number(){
        Assertions.assertEquals(stringcalculator.Add("1") ,1);
    }
    @Test
    public void sum_of_two_numbers() {
        Assertions.assertEquals(stringcalculator.Add("1,2"), 3);
    }
    @Test
    public void sum_of_unknown_numbers() {
        Assertions.assertEquals(stringcalculator.Add("1,2,3"), 6);
    }
    @Test
    public void sum_of_two_with_newline_delimeter_numbers(){
        Assertions.assertEquals(stringcalculator.Add( "1\n2"),3);
    }
//    @Test
//    public void supporting_different_delimiters(){
//        Assertions.assertEquals(stringcalculator.Add("//;\n1;2"),3);

   }
//    @Test
//    public void Exeption_for_comma(){
//        Assertions.(()->stringcalculator.Add("1,\n2"))
//                .isInstanceOf(NumberFormatException);




