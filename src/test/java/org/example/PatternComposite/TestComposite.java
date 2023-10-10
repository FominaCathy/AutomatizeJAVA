package org.example.PatternComposite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;



public class TestComposite extends AbstractTestPComposite {

    @Test
    void testGetNameBox(){
        BoxCosmetic testBox = new BoxCosmetic("Test box");

        Assertions.assertEquals("Box: Test box", testBox.getNameItem());
    }

    @Test
    void testGetNameProduct(){
        ILeaf disc = new ProductCosmetic("disc cotton", 100);

        Assertions.assertEquals("Product: disc cotton, volume=100 ml", disc.getNameItem());
    }


    @Test
    void testAddProductInBox() {
        BoxCosmetic testBox = new BoxCosmetic("Test box");
        ILeaf disc = new ProductCosmetic("disc cotton", 100);
        Assumptions.assumeTrue(testBox.addProduct(disc));

        Assertions.assertEquals(100, testBox.getVolumeItem());
    }

    @Test
    void testAddBoxInBox() {
        BoxCosmetic testBox = new BoxCosmetic("Test box");
        Assumptions.assumeTrue(testBox.addProduct(boxForHear));

        Assertions.assertEquals(413, testBox.getVolumeItem());
    }

    @Test
    void testNotAddProductInBox() {
        BoxCosmetic testBox = new BoxCosmetic("Test box");
        ILeaf disc = new ProductCosmetic("disc cotton", 100);
        Assumptions.assumeTrue(testBox.addProduct(disc));

        Assertions.assertFalse(testBox.addProduct(disc));
    }

    @Test
    void testRemoveProductInBox() {
        BoxCosmetic testBox = new BoxCosmetic("Test box");
        ILeaf disc = new ProductCosmetic("disc cotton", 100);
        testBox.addProduct(disc);
        Assumptions.assumeTrue(testBox.removeProduct(disc));

        Assertions.assertEquals(0, testBox.getVolumeItem());

    }

    @Test
    void testRemoveBoxInBox() {
        BoxCosmetic testBox = new BoxCosmetic("Test box");
        ILeaf disc = new ProductCosmetic("disc cotton", 100);
        Assumptions.assumeTrue(testBox.addProduct(disc));
        Assumptions.assumeTrue(testBox.addProduct(boxForHear));
        Assumptions.assumeTrue(testBox.removeProduct(boxForHear));

        Assertions.assertEquals(100, testBox.getVolumeItem());
    }

    @Test
    void testNotRemoveBoxInBox() {
        BoxCosmetic testBox = new BoxCosmetic("Test box");
        ILeaf disc = new ProductCosmetic("disc cotton", 100);
        Assumptions.assumeTrue(testBox.addProduct(disc));
        Assumptions.assumeTrue(testBox.addProduct(boxForHear));

        Assertions.assertFalse(testBox.removeProduct(boxForFace));
    }

    @Test
    void testSummBoxComposeOnlyProduct() {
        Assertions.assertEquals(413, boxForHear.getVolumeItem());

    }

    @Test
    void testSummBoxComposeOnlyBox() {
        BoxCosmetic testBox = new BoxCosmetic("Test box");
        Assumptions.assumeTrue(testBox.addProduct(boxForHear));
        Assumptions.assumeTrue(testBox.addProduct(boxForFace));

        Assertions.assertEquals(613, testBox.getVolumeItem());
    }

    @Test
    void testSummBoxMixed() {
        BoxCosmetic testBox = new BoxCosmetic("Test box");
        Assumptions.assumeTrue(testBox.addProduct(boxForHear));
        ILeaf disc = new ProductCosmetic("disc cotton", 100);
        Assumptions.assumeTrue(testBox.addProduct(disc));

        Assertions.assertEquals(513, testBox.getVolumeItem());
    }
}
