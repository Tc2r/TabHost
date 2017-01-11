package projects.tc2r.tabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec(getString(R.string.hosttab_1));
        TabHost.TabSpec tab2 = tabHost.newTabSpec(getString(R.string.hosttab_2));

        tab1.setIndicator(getString(R.string.hosttab_1_title));
        //tab1.setIndicator("", getResources().getDrawable(R.mipmap.ic_launcher));
        tab1.setContent(new Intent(this, Tab1.class));

        tab2.setIndicator(getString(R.string.hosttab_2_title));
        //tab2.setIndicator("", getResources().getDrawable(R.mipmap.ic_launcher));
        tab2.setContent(new Intent(this, Tab2.class));



        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        initTabsAppearance(tabHost.getTabWidget());
        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            View v = tabHost.getTabWidget().getChildAt(i);
            v.setBackgroundResource(R.drawable.tab_normal);

            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(getResources().getColor(R.color.White));
        }


   }
    private void initTabsAppearance(TabWidget tabWidget) {
        // Change background
        for(int i=0; i < tabWidget.getChildCount(); i++)
            tabWidget.getChildAt(i).setBackgroundResource(R.drawable.tab_normal);


    }


}
