package ru.job4j.tracker;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class ItemDescByNameTest {

    @Test
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