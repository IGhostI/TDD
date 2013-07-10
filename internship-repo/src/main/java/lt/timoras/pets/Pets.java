package lt.timoras.pets;

import java.util.ArrayList;
import java.util.List;

public class Pets {
    public Pets() {
    }

    public List<String> getPets() {
        ArrayList<String> petsList = new ArrayList<String>();
        petsList.add("dog");
        return petsList;
    }
}