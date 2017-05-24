package cr.taller.ejercicio2.equipo5;

import org.junit.Assert;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void testWeak() {
        Assert.assertFalse(PasswordUtil.isStrongPassword("asfd"));
        Assert.assertFalse(PasswordUtil.isStrongPassword("123443"));
    }

    @Test
    public void testStrong() {
        Assert.assertTrue(PasswordUtil.isStrongPassword(".fdhyeaj."));
        Assert.assertTrue(PasswordUtil.isStrongPassword(",bdhyeami"));
        Assert.assertTrue(PasswordUtil.isStrongPassword("asfdhyeead"));
    }

}
