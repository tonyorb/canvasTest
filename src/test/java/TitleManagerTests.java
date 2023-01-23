import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleManagerTests {

    @Test
    void userCaseArticle(){
        String article = "Volvo released a new car with the following spec: V6 236HP. It will cost $22647 and going to be sold in New York only";
        String expectedTitle = "Volvo released a new...";

        assertEquals(expectedTitle, TitleManager.createATitle(article));
    }

    @Test
    void emptyArticle(){
        String article = "";
        String expectedTitle = "Article is empty";

        assertEquals(expectedTitle, TitleManager.createATitle(article));
    }

    @Test
    void articleWithoutSpacesTest(){
        String article = "Arcticlewithoutspacesactriclewithoutspaces";
        String expectedTitle = "No spaces in article";

        assertEquals(expectedTitle, TitleManager.createATitle(article));
    }

    @Test
    void articleWithNumberToCut(){
        String article = "Article with number 10000000 to cut";
        String expectedTitle = "Article with number...";

        assertEquals(expectedTitle, TitleManager.createATitle(article));
    }

    @Test
    void articleWithSpecialCharsToCut(){
        String article = "Article with special !!! chars to cut";
        String expectedTitle = "Article with special...";

        assertEquals(expectedTitle, TitleManager.createATitle(article));
    }

    @Test
    void articleNothingToCut(){
        String article = "Article nothing to cut";
        String expectedTitle = "Article nothing to cut";

        assertEquals(expectedTitle, TitleManager.createATitle(article));
    }

    @Test
    void articleWithoutWords(){
        String article = "10101 0101 1101010 1010 10010101";
        String expectedTitle = "Unable to create a title";

        assertEquals(expectedTitle, TitleManager.createATitle(article));
    }

}
