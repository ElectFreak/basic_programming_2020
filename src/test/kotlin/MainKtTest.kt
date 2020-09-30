import org.junit.Test
import kotlin.test.assertEquals

//import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun printFibonacci() {
        assertEquals(mutableListOf(0, 1, 1, 2, 3), printFibonacci(5))
    }
}