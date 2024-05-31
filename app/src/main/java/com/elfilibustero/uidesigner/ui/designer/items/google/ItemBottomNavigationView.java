package com.elfilibustero.uidesigner.ui.designer.items.google;

import android.content.Context;
import android.view.MotionEvent;

import com.elfilibustero.uidesigner.R;
import com.elfilibustero.uidesigner.ui.designer.DesignerItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ItemBottomNavigationView extends BottomNavigationView implements DesignerItem {

    public ItemBottomNavigationView(Context context) {
        super(context);
        initialize();
    }

    private void initialize() {
        inflateMenu(R.menu.dummy_bottom_navigation_item);
        setFocusable(false);
        setClickable(false);
    }

    private String className;

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public Class<?> getClassType() {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            return BottomNavigationView.class;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
