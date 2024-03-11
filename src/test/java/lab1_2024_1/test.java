package lab1_2024_1;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.tp24.ApplicationRunner;
import org.tp24.repository.clientes;

public class test {
    @Test

        public void test1(){
            ApplicationRunner applicationRunner = new ApplicationRunner();
            applicationRunner.run();

            clientes nombrexd = new clientes("1041631335", "Camilo", "Koran", LocalDate.of(2005, 11, 20), "carrera no se donde",33333);
        }   

}
