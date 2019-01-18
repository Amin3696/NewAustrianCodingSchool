package exercises.week5Interface.ex06IkeaWardrobe;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WardrobeBuilderTest {

    WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();

    @Test
    void testBuild() {
        String[] split = "Bottom,Side,Side,Back,Top,shelf,shelf,shelf,shelf,shelf,shelf,shelf,shelf,Door,Door".split(",");
        List<String> expected = Arrays.asList(split);

        Wardrobe wardrobe = (Wardrobe) wardrobeBuilder.build();
        List<String> parts = wardrobe.getParts();


        assertEquals(expected.size(), parts.size());
        assertEquals(expected, parts);

    }
}