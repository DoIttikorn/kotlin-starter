import main.kotlin.abbrevName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCodeWars {
    @Test
    fun TestAbbrevName() {
        assertEquals("S.H", abbrevName("Sam Harris"))
        assertEquals("P.F", abbrevName("Patrick Feenan"))
        assertEquals("E.C", abbrevName("Evan Cole"))
        assertEquals("P.F", abbrevName("P Favuzzi"))
        assertEquals("D.M", abbrevName("David Mendieta"))
    }
}