package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    public void whenListSortDown() {
        List<Item> items = Arrays.asList(
                new Item("Xmen"),
                new Item("Azbuka"),
                new Item("Bazuka")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Xmen"),
                new Item("Bazuka"),
                new Item("Azbuka")
        );
        assertThat(items).isEqualTo(expected);
    }
}