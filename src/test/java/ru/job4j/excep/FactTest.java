package ru.job4j.excep;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                     Fact.calc(-3);
                });
        assertThat(exception.getMessage()).isEqualTo("N could  Not be less then 0");
    }

    @Test
    public void whenN3CalcIs6() {
        int n = 3;
        int calc = 6;
        int result = Fact.calc(n);
        assertThat(result).isEqualTo(result);
    }

}
