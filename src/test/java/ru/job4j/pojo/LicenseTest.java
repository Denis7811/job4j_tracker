package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import java.util.Date;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqOwnerModelDate() {
        License first = new License();
        first.setOwner("audio");
        first.setModel("audio");
        Date date = new Date();
        first.setCreated(date);
        License second = new License();
        second.setOwner("audio");
        second.setModel("audio");
        second.setCreated(date);
        assertThat(first, is(second));
    }
}