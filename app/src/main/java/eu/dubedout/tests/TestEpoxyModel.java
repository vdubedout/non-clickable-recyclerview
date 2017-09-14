package eu.dubedout.tests;

import android.widget.LinearLayout;

import com.airbnb.epoxy.EpoxyModel;

class TestEpoxyModel extends EpoxyModel<LinearLayout> {
    private final int color;

    public TestEpoxyModel(int color) {
        this.color = color;
    }

    @Override
    protected int getDefaultLayout() {
        return R.layout.item_test_list;
    }

    @Override
    public void bind(LinearLayout view) {
        super.bind(view);
        view.setBackgroundColor(color);

        // Test 2 remove focusable on lower items
        view.setFocusable(false);
        view.setClickable(false);
    }
}
