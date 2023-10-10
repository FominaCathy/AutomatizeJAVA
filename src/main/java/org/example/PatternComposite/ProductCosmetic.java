package org.example.PatternComposite;


public class ProductCosmetic implements ILeaf {

    private String name;
    private int volume;

    public ProductCosmetic(String name, int volume) {
        this.volume = volume;
        this.name = name;
    }

    @Override
    public int getVolumeItem() {
        return this.volume;
    }

    @Override
    public String getNameItem() {
        return "Product: " + this.name + ", volume=" + this.volume + " ml";
    }
}
