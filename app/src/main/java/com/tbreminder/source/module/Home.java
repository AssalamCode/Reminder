package com.tbreminder.source.module;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.tbreminder.source.R;
import com.tbreminder.source.navbar.AppBaseActivity;

/**
 * Created by Chandra on 11/04/2018.
 */

public class Home extends AppBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.drawable.ic_action_menu);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            //You can get
            Log.d("NAV","OPEN");
            bukaMenu();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
