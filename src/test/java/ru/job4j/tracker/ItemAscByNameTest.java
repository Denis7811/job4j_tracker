package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {
    @Test
    public void whenListSortUp() {
        List<Item> items = Arrays.asList(
                new Item("Xmen"),
                new Item("Azbuka"),
                new Item("Bazuka")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Azbuka"),
                new Item("Bazuka"),
                new Item("Xmen")
        );
        assertThat(items).isEqualTo(expected);

    }
}