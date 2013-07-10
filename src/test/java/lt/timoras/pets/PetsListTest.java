package lt.timoras.pets;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.IsCollectionContaining.hasItem;
import static org.junit.internal.matchers.IsCollectionContaining.hasItems;


public class PetsListTest {

    private final Pets pets = new Pets();

    @Test
    public void shouldReturnNotEmptyList() throws Exception {

        List<String> petsList = pets.getPets();
        assertNotNull("should return not empty list", petsList);
    }

    @Test
    public void shouldContainsDod() throws Exception {

        List<String> petsList = pets.getPets();
        assertThat(petsList, hasItem("dog"));
    }


}