import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator();

    @BeforeEach
    void message(){
        System.out.println(" marks begin of new Test ");
    }

    @AfterEach
    void anotherMessage(){
        System.out.println(" marks end of test " + "\n");
    }
    @org.junit.jupiter.api.Test
    void add() {

        assertEquals(4, c.add(2,2));
    }

    @Test
    void addTest2(){
         assertEquals(10,c.add(5,5));
    }

    @Test
    void multiplyTest(){
        assertEquals(4,c.multiply(2,2));
    }

    @Test
    void moduloTest(){
        assertEquals(0,c.modulo(5,5));
    }

    @Test
    void exceptionTest(){
    assertThrows(  IllegalStateException.class, () -> { c.throwError();});

    }
}
