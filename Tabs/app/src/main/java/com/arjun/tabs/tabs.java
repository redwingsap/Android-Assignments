package com.arjun.tabs;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class tabs extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);


        TabHost tabHost = getTabHost();




        TabHost.TabSpec vid = tabHost.newTabSpec("Videos");
        vid.setIndicator("",getResources().getDrawable(R.drawable.videos));
        Intent v = new Intent(this, Videos.class);
        vid.setContent(v);

        TabHost.TabSpec img = tabHost.newTabSpec("Images");
        img.setIndicator("",getResources().getDrawable(R.drawable.images));
        Intent m = new Intent(this, Images.class);
        img.setContent(m);

        TabHost.TabSpec gam = tabHost.newTabSpec("Games");
        gam.setIndicator("",getResources().getDrawable(R.drawable.games));
        Intent g = new Intent(this, Games.class);
        gam.setContent(g);

        tabHost.addTab(vid);
        tabHost.addTab(img);
        tabHost.addTab(gam);

        tabHost.setCurrentTab(0);
    }

}
