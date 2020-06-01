import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkWithTextTest {

    @Test
    void readFromFileTest() throws IOException {
        TextMove workWithText = new TextMove();
        ArrayList<String> actual = workWithText.readFromFile("test.txt");
        List<String> expected = List.of("Hello","My","Name","Van");
        assertEquals(expected,actual);
    }
    @Test
    void sortTest() {
        TextMove workWithText = new TextMove();
        List<String> startList = List.of("Hello","My","Name","Van");
        ArrayList<String> actual = new ArrayList<>();
        actual.addAll(startList);
        workWithText.sort(actual);
        List<String> expected = List.of("My","Van","Name","Hello");
        assertEquals(expected,actual);
    }

    @Test
    void writeToFileTest() throws IOException {
        TextMove workWithText = new TextMove();
        List<String> text = List.of("Hello","My","Name","Van");
        ArrayList<String> result = new ArrayList<>();
        result.addAll(text);
        workWithText.writeToFile(result,"testWrite.txt");
        ArrayList<String> actual = workWithText.readFromFile("testWrite.txt");
        List<String> expected = List.of("Hello","My","Name","Van");
        assertEquals(expected,actual);
    }
} 