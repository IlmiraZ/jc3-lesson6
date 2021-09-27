package ru.ilmira;


import org.junit.Assert;
import org.junit.Test;

public class AppTest1 {
    private final App app;

    public AppTest1() {
        this.app = new App();
    }

    @Test
    public void OutputNumbersAfterFour() {
        int[] before = {1, 4, 5, 8, 7, 6, 9};
        int[] after = {5, 8, 7, 6, 9};

        Assert.assertArrayEquals(after, app.containFour(before));
    }

    @Test(expected = RuntimeException.class)
    public void checkNumberFour() {
        int[] before = {1, 5, 8, 7, 6, 9};
        int[] after = {};

        Assert.assertArrayEquals(after, app.containFour(before));

    }

    @Test
    public void outputArrayAfterLastFour() {
        int[] before = {1, 4, 5, 8, 7, 6, 4};
        int[] after = {};

        Assert.assertArrayEquals(after, app.containFour(before));
    }
}
