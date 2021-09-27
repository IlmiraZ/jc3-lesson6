package ru.ilmira;


import org.junit.Assert;
import org.junit.Test;

public class AppTest2 {
    private final App app;

    public AppTest2() {
        this.app = new App();
    }

    @Test
    public void checkOneAndFour1() {
        int[] arr = {1, 2, 3};
        Assert.assertTrue(app.checkNumber(arr));
    }

    @Test
    public void checkOneAndFour2() {
        int[] arr = {2, 3, 4};
        Assert.assertTrue(
                app.checkNumber(arr));
    }

    @Test
    public void checkOneAndFour3() {
        int[] arr = {1, 2, 3, 4};
        Assert.assertTrue(app.checkNumber(arr));
    }

    @Test
    public void checkOneAndFour4() {
        int[] arr = {5, 5};
        Assert.assertFalse(app.checkNumber(arr));
    }
}
