package cr.taller.ejercicio1;

import org.junit.Assert;
import org.junit.Test;

public class ProgramameTest {

    @Test
    public void testFortaleza() {
        Assert.assertEquals(15, Programame.fortaleza("a"));
        Assert.assertEquals(20, Programame.fortaleza("aa"));
        Assert.assertEquals(50, Programame.fortaleza("aAa"));
        Assert.assertEquals(35, Programame.fortaleza("aab"));
        Assert.assertEquals(40, Programame.fortaleza("aabb"));
        Assert.assertEquals(20, Programame.fortaleza("a1"));
        Assert.assertEquals(30, Programame.fortaleza("a2569547"));
        Assert.assertEquals(45, Programame.fortaleza("abbb"));
        Assert.assertEquals(45, Programame.fortaleza("abc"));
        Assert.assertEquals(65, Programame.fortaleza("aBc"));
    }

}
