package lt.timoras.toDoTest;


import lt.timoras.toDo.InterestCalculator;
import org.junit.Test;

public class InterestCalculatorTest {
    @Test
    public void workingDaysBetweenTwoDatesTheSameMonth() throws Exception {
        InterestCalculator calculator = new InterestCalculator();
        String date1 = "2013-07-01";
        String date2 = "2013-07-10";
        assertEquals("Should return 8", 8, calculator.getWorkingDays(date1, date2));
        date1 = "2013-06-01";
        date2 = "2013-07-10";
        assertEquals("Should return 28", 28, calculator.getWorkingDays(date1, date2));
        date1 = "2012-06-01";
        date2 = "2013-07-10";
        assertEquals("Should return 289", 289, calculator.getWorkingDays(date1, date2));
        date1 = "2012-07-01";
        date2 = "2013-07-10";
        assertEquals("Should return 269", 269, calculator.getWorkingDays(date1, date2));
        date1 = "2013-07-10";
        date2 = "2013-07-10";
        assertEquals("Should return 0", 0, calculator.getWorkingDays(date1, date2));
        date1 = "2013-07-10";
        date2 = "2013-07-01";
        assertEquals("Should be error", 8, calculator.getWorkingDays(date1, date2));
    }


}
