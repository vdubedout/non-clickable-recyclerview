package eu.dubedout.tests;

import android.graphics.Color;

import com.airbnb.epoxy.EpoxyAdapter;

import java.util.Random;

class TestAdapter extends EpoxyAdapter {
    private final Random rnd;

    public TestAdapter() {
        rnd = new Random();
    }

    public void initializeTestItems(){
        for (int i=0; i< 50; i++){
            addModel(new TestEpoxyModel(randomColor()));
        }
    }

    private int randomColor() {
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return color;
    }
}
