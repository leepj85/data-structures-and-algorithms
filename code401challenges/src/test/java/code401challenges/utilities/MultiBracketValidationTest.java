package code401challenges.utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidationTest() {
        String test1 = "{}";
        String test2 = "{}(){}";
        String test3 = "()[[Extra Characters]]";
        String test4 = "(){}[[]]";
        String test5 = "{Code}[Fellows](())";
        String test6 = "(](";
        String test7 = "{(})";
        String test8 = "{";
        String test9 = "[}";

        assertTrue(MultiBracketValidation.multiBracketValidation(test1));
        assertTrue(MultiBracketValidation.multiBracketValidation(test2));
        assertTrue(MultiBracketValidation.multiBracketValidation(test3));
        assertTrue(MultiBracketValidation.multiBracketValidation(test4));
        assertTrue(MultiBracketValidation.multiBracketValidation(test5));
        assertTrue(!MultiBracketValidation.multiBracketValidation(test6));
        assertTrue(!MultiBracketValidation.multiBracketValidation(test7));
        assertTrue(!MultiBracketValidation.multiBracketValidation(test8));
        assertTrue(!MultiBracketValidation.multiBracketValidation(test9));
    }
}