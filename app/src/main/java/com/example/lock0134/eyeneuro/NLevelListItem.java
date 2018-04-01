package com.example.lock0134.eyeneuro;

/**
 * Created by lock0134 on 2018-03-31.
 */
import android.view.View;

public interface NLevelListItem {

    public boolean isExpanded();
    public void toggle();
    public NLevelListItem getParent();
    public View getView();
}
