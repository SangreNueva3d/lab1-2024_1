package lab1_2024_1;
import java.math.BigInteger;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.tp24.ApplicationRunner;
import org.tp24.data.Cliente;

public class test {
    @Test

        public void test1(){
            ApplicationRunner applicationRunner = new ApplicationRunner();
            applicationRunner.run();
            BigInteger numerotururu = BigInteger.valueOf(777);
            Cliente nombrexd = new Cliente("1041631335", "Camilo", "Koran", LocalDate.of(2005, 11, 20), "carrera no se donde",numerotururu);
        }   

}
