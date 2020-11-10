package fr.umontpellier.iut.algogen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;


class AppTest {

    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> App.main(new String[1]));
    }
}