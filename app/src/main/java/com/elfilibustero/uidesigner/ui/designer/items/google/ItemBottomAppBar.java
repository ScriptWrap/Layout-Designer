package com.elfilibustero.uidesigner.ui.designer.items.google;

import android.content.Context;
import android.view.MotionEvent;

import com.elfilibustero.uidesigner.R;

import com.elfilibustero.uidesigner.ui.designer.DesignerItem;
import com.google.android.material.bottomappbar.BottomAppBar;

public class ItemBottomAppBar extends BottomAppBar implements DesignerItem {

    public ItemBottomAppBar(Context context) {
        super(context);
        initialize();
    }

    private void initialize() {
        replaceMenu(R.menu.dummy_bottom_navigation_item);
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
            return BottomAppBar.class;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return true;
    }
}
