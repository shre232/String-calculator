import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class testCalculate {
    @Test
    public void emptyStringReturnZero() {
        Assertions.assertEquals(stringCalculator.Add(""), 0);
    }

    @Test
    public void number_for_one_number(){
        Assertions.assertEquals(stringCalculator.Add("1") ,1);
    }
    @Test
    public void sum_of_two_numbers() {
        Assertions.assertEquals(stringCalculator.Add("1,2"), 3);
    }}