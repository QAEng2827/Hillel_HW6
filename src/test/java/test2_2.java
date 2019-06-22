import annotationTask.task2_2.ResultZero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class test2_2 {
     ResultZero resultZero = new ResultZero();
    @Test
    public void resultZeroTest() {


        assertEquals(0, resultZero.resultCheck(7, 7));
    }

    @Test
    public void negativeResultZeroTest() {

       // resultZero.resultCheck(7, 8);

        assertEquals(true,resultZero.resultCheck(7,8)!=0);
    }
}
