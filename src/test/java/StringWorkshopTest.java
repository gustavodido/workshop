import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringWorkshopTest {
    private StringWorkshop regexpWorkshop = new StringWorkshop();

    @Test
    public void reverseArrayWithOddElements() {
        String actual = "a123&ˆˆ*@(JKLA()!*b";
        String expected = "a123JKLAb";

        assertThat(regexpWorkshop.replaceNonAlphanumericChars(actual), is(expected));
    }
}