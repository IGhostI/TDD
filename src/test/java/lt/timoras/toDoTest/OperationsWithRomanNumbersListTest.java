package lt.timoras.toDoTest;

import lt.timoras.toDo.OperationsWithRomanNumbersList;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperationsWithRomanNumbersListTest {

    @Test
    public void romanNumbersListHaveItems() throws Exception {
        assertEquals("Should return false", false,
                OperationsWithRomanNumbersList.getLinkedListWithRomanNumbers().isEmpty());
    }


}
