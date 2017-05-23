import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class BritishPoundTest {

    @Test
    public void britishPoundToEuroTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 39.90;
        double actual = britishPound.britishPoundToEuro(35);

        Assert.assertEquals("This should return 39.90", expected, actual, .01);
    }

    @Test
    public void britishPoundToRupeeTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 840.49;
        double actual = britishPound.britishPoundToRupee(5.95);

        Assert.assertEquals("This should return 840.49", expected, actual, .01);
    }

    @Test
    public void britishPoundToAmericanDollarTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 59.86;
        double actual = britishPound.britishPoundToAmericanDollar(73);

        Assert.assertEquals("This should return 59.86", expected, actual, .01);
    }

    @Test
    public void britishPoundToAustralianDollarTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 80.36;
        double actual = britishPound.britishPoundToAustralianDollar(49);

        Assert.assertEquals("This should return 80.36",expected,actual, .01);
    }

    @Test
    public void britishPoundToCanadianDollarTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 99.20;
        double actual = britishPound.britishPoundToCanadianDollar(62);

        Assert.assertEquals("This should return 99.20", expected, actual, .01);
    }

    @Test
    public void britishPoundToSingaporeDollarTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 33.06;
        double actual = britishPound.britishPoundToSinagporeDollar(19);

        Assert.assertEquals("This should return 33.06", expected, actual, .01);
    }

    @Test
    public void britishPoundToSwissFrancTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 71.34;
        double actual = britishPound.britishPoundToSwissFranc(58);

        Assert.assertEquals("This should return 71.34", expected, actual, .01);
    }

    @Test
    public void britishPoundToMalaysianRinggitTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 299.75;
        double actual = britishPound.britishPoundToMalaysianRinggit(55);

        Assert.assertEquals("This should return 299.75", expected, actual, .01);
    }

    @Test
    public void britishPoundToJapaneseYenTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 8475.60;
        double actual = britishPound.britishPoundToJapaneseYen(60);

        Assert.assertEquals("This should return 8475.60", expected, actual, .01);
    }

    @Test
    public void britishPoundToChineseYuanRenminbiTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 16.86;
        double actual = britishPound.britishPoundToChineseYuanRenminbi(2);

        Assert.assertEquals("This should return 16.80", expected, actual, .01);
    }
}
