import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testThatJUnitWorks(){
        //Arrange

        //Act
        int expected = 1;
        int actual = calculator.sum(1,1);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testCorrectInputAndCorrectResult(){
        //Arrange
        //Act
        int expected = 45;
        int actual = calculator.sum(19,25);
        //assert
        assertEquals(expected, actual);
    }

    public void testForWrongInputThrowException(){
        assertThrows(InputMismatchException.class, ()->{
            calculator.sum(1001,2);
        });

    }
    @Test
    public void testForWrongParameter(){
        assertThrows(InputMismatchException.class, ()->{
            calculator.isEven(5);
        });


    }


}