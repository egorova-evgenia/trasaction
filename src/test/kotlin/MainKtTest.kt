import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommission() {
//        arrange
        val money: Int = 1000;
        val typeOfCard: String = "VK_Pay"
        val moneyBeforeNow: Int = 0
        val isThereAction: Boolean = true
//        act
        val result = calculateCommission(
            money,
            typeOfCard,
            moneyBeforeNow,
            isThereAction
        )
//        assert
        assertEquals(0.0,result,0.001)
    }
    @Test
    fun calculateCommission_overMaximum() {
//        arrange
        val money: Int = 1000;
        val typeOfCard: String = "VK_Pay"
        val moneyBeforeNow: Int = 700000
        val isThereAction: Boolean = true
//        act
        val result = calculateCommission(
            money,
            typeOfCard,
            moneyBeforeNow,
            isThereAction
        )
//        assert
        assertEquals(0.0,result,0.001)
    }

    @Test
    fun calculateCommission_overMaximum_Visa() {
//        arrange
        val money: Int = 1000;
        val typeOfCard: String = "Visa"
        val moneyBeforeNow: Int = 700000
        val isThereAction: Boolean = true
//        act
        val result = calculateCommission(
            money,
            typeOfCard,
            moneyBeforeNow,
            isThereAction
        )
//        assert
        assertEquals(0.0,result,0.001)
    }

    @Test
    fun calculateCommission_mir() {
//        arrange
        val money: Int = 1000;
        val typeOfCard: String = "Мир"
        val moneyBeforeNow: Int = 0
        val isThereAction: Boolean = true
//        act
        val result = calculateCommission(
            money,
            typeOfCard,
            moneyBeforeNow,
            isThereAction
        )
//        assert
        assertEquals((money*0.75/100),result,0.001)
    }

    @Test
    fun calculateCommission_mirMinimum() {
//        arrange
        val money: Int = 30;
        val typeOfCard: String = "Мир"
        val moneyBeforeNow: Int = 0
        val isThereAction: Boolean = true
//        act
        val result = calculateCommission(
            money,
            typeOfCard,
            moneyBeforeNow,
            isThereAction
        )
//        assert
        assertEquals(0.0,result,0.001)
    }

    @Test
    fun calculateCommission_master() {
//        arrange
        val money: Int = 1000;
        val typeOfCard: String = "MasterCard"
        val moneyBeforeNow: Int = 0
        val isThereAction: Boolean = true
//        act
        val result = calculateCommission(
            money,
            typeOfCard,
            moneyBeforeNow,
            isThereAction
        )
//        assert
        assertEquals(0.0,result,0.001)
    }

    @Test
    fun calculateCommission_master_without_Action() {
//        arrange
        val money: Int = 1000;
        val typeOfCard: String = "MasterCard"
        val moneyBeforeNow: Int = 0
        val isThereAction: Boolean = false
//        act
        val result = calculateCommission(
            money,
            typeOfCard,
            moneyBeforeNow,
            isThereAction
        )
//        assert
        assertEquals((money*0.6/100+20.0),result,0.001)
    }

}