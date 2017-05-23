import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class testSwissFranc {
    SwissFranc swissFranc;

    @Before
    public void setup(){
        swissFranc = new SwissFranc();
    }

    @Test
    public void testConvertToSwissFranc(){
        //: Given
        double usDollarAmountToConvert = 81.22;
        double expectedConversion = 82.03;
        //: When
        double actualConversion = swissFranc.convertToSwissFranc(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Swiss Franc is: 82.03",expectedConversion,actualConversion,0.001);

    }
}
