package org.example.PatternComposite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class BoxCosmetic implements ILeaf {

    private String name;
    private List<ILeaf> listBox = new ArrayList<>();

    public BoxCosmetic(String name) {
        this.name = name;
    }

    @Override
    public int getVolumeItem() {
        AtomicInteger summVolume = new AtomicInteger();
        listBox.forEach(item -> summVolume.addAndGet(item.getVolumeItem()));
        return summVolume.get();
    }

    @Override
    public String getNameItem() {
        return "Box: " + this.name;
    }


    public boolean addProduct(ILeaf item) {
        if (!listBox.contains(item)) {
            listBox.add(item);
            return true;
        }
        return false;
    }

    public boolean removeProduct(ILeaf item) {
        if (listBox.contains(item)) {
            listBox.remove(item);
            return true;
        }
        return false;
    }

}
