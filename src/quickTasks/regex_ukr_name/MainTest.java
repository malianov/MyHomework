package quickTasks.regex_ukr_name;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @BeforeAll
    public static void Start() {
        System.out.println("Lets start the tests!");
    }

    @BeforeEach
    public void StartTest() {
        System.out.println("It is started!");
    }

    @AfterEach
    public void End() {
        System.out.println("It is finished!");
    }

    @AfterAll
    public static void Complete() {
        System.out.println("The tests are complete, hope successfully!");
    }

    @Test
    public void testUkrName() {
        assert(Main.checkUkrName("Лук'ян"));
    }

    @Disabled("For this test lets use old type")
    @Test
    public void testUkrName_2() {
        assertEquals(false, Main.checkUkrName("Лук'ян"));
    }

    @Test
    public void testNonUkrName() {
        assertEquals(false, Main.checkUkrName("Бъянки"));
    }

    @DisplayName("Test Антонова-Овсієнко")
    @Test
    void testAdd() {
        assertEquals(true, Main.checkUkrName("Антонова-Овсієнко"));
    }
}