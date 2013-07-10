package lt.timoras.toDoTest;


import lt.timoras.toDo.StackExercise;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackExerciseTest {

    private StackExercise stack = new StackExercise();

    @Test
    public void isStackInitialized() throws Exception {
        assertNotNull("Should be not null", stack.getStack());
    }

    @Test
    public void stackCapacity() throws Exception {
        assertEquals("Should return 0", 0, StackExercise.getStackPointer());
        assertEquals("Should return 100", 100, StackExercise.getSTACK_SIZE());
    }

    @Test
    public void isStackEmpty() throws Exception {
        assertEquals("Should be true", true, stack.isEmpty());
    }

    @Test
    public void isPushWorking() throws Exception {
        stack.push(1);
        assertEquals("Should be false", false, stack.isEmpty());
    }

    @Test
    public void isPopWorking() throws Exception {
        stack.pop();
        assertEquals("Should be 0", 0, stack.getStack()[StackExercise.getStackPointer()+1]);
    }

    @Test
    public void isTopWorking() throws Exception {
        stack.push(2);
        stack.push(15);
        assertNotSame("Should be not 0", 0, stack.top());
    }

}
