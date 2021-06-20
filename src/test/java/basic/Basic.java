package basic;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class Basic {
    @Test
    void should_success_when_validate(){
        BigDecimal d = new BigDecimal("3.555");
        System.out.println(d.doubleValue());
        float f = 3.5f;
        Double d2 = 3.55;
        System.out.println(f);
        System.out.println(d2.equals(d));
    }
}
