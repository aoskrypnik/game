import org.junit.Assert;
import org.junit.Test;

public class TestGame {

    @Test
    public void testRandForOne() {
        Model model = new Model();
        boolean oneExists = false;
        int m;
        for (int i = 0; i < 10000; i++) {
            m = model.getRandomNumber();
            if (m == 1)
                oneExists = true;
        }
        Assert.assertTrue(oneExists);
    }

    @Test
    public void testRandForNintyNine() {
        Model model = new Model();
        boolean nintyNineExists = false;
        int m;
        for (int i = 0; i < 10000; i++) {
            m = model.getRandomNumber();
            if (m == 99)
                nintyNineExists = true;
        }
        Assert.assertTrue(nintyNineExists);
    }

    @Test
    public void testRandForZero() {
        Model model = new Model();
        boolean zeroNotExists = true;
        int m;
        for (int i = 0; i < 10000; i++) {
            m = model.getRandomNumber();
            if (m == 0)
                zeroNotExists = false;
        }
        Assert.assertTrue(zeroNotExists);
    }

    @Test
    public void testRandForHundred() {
        Model model = new Model();
        boolean hundredNotExists = true;
        int m;
        for (int i = 0; i < 10000; i++) {
            m = model.getRandomNumber();
            if (m == 100)
                hundredNotExists = false;
        }
        Assert.assertTrue(hundredNotExists);
    }
}
