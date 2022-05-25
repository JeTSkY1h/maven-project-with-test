package week2.AnimalList;
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
public class AnimalListTest {
    Animal axolotl = new Animal("Axolotl");
    Animal huhn = new Animal("Huhn");
    Animal eichhörnchen = new Animal("Eichhörnchen");


    @Test
    void shouldAddItemToList(){
        AnimalList animalList = new AnimalList();
        animalList.add(axolotl);
        assertEquals("Axolotl", animalList.toString());
    }

    @Test
    void schouldOutputString(){
        AnimalList animalList = new AnimalList();
        animalList.add(axolotl);
        animalList.add(huhn);
        animalList.add(eichhörnchen);

        assertEquals("Axolotl -> Huhn -> Eichhörnchen", animalList.toString());

    }

    @Test
    void shouldRemoveFirstItemFromList(){
        AnimalList animalList = new AnimalList();
        Animal axolotl = new Animal("Axolotl");
        animalList.add(axolotl);
        animalList.add(huhn);
        animalList.add(eichhörnchen);
        animalList.remove(axolotl);
        assertEquals("Huhn -> Eichhörnchen", animalList.toString());
    }

    @Test
    void shouldRemoveMiddleItemToList(){
        AnimalList animalList = new AnimalList();
        Animal axolotl = new Animal("Axolotl");
        animalList.add(axolotl);
        animalList.add(huhn);
        animalList.add(eichhörnchen);
        animalList.remove(huhn);
        assertEquals("Axolotl -> Eichhörnchen", animalList.toString());
    }
}