package org.example.PatternComposite;

import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractTestPComposite {

    static BoxCosmetic boxForHear = new BoxCosmetic("For hear");
    static BoxCosmetic boxForFace = new BoxCosmetic("For face");

    @BeforeAll
    static void createProduct() {
        ILeaf cream = new ProductCosmetic("cream for face", 50);
        ILeaf micelar = new ProductCosmetic("micelar water", 150);
        ILeaf filer = new ProductCosmetic("filer for hear", 13);
        ILeaf shampoo = new ProductCosmetic("shampoo for hear", 200);
        ILeaf balsam = new ProductCosmetic("balsam for hear", 200);

        boxForFace.addProduct(cream);
        boxForFace.addProduct(micelar);

        boxForHear.addProduct(shampoo);
        boxForHear.addProduct(balsam);
        boxForHear.addProduct(filer);
    }


}
