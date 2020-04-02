package com.example.googlemapsclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, Tab2.OnFragmentInteractionListener, Tab3.OnFragmentInteractionListener {
    private Toolbar toolbarr;
    private ViewPager viewPagerr;
    private TabLayout tabLayoutt;

    private Tab1 mTab1;
    private Tab2 mTab2;
    private Tab3 mTab3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbarr = findViewById(R.id.toolbar);
        setSupportActionBar(toolbarr);

        viewPagerr = findViewById(R.id.viewpagger);
        tabLayoutt = findViewById(R.id.tablayout);

        mTab1 = new Tab1();
        mTab2= new Tab2();
        mTab3 = new Tab3();

        tabLayoutt.setupWithViewPager(viewPagerr);

        ViewPagerAdapter mVP = new ViewPagerAdapter(getSupportFragmentManager(),0);

        mVP.addFragment(mTab1, "Tab1");
        mVP.addFragment(mTab2, "Tab2");
        mVP.addFragment(mTab3, "Tab3 ");
        viewPagerr.setAdapter(mVP);

        tabLayoutt.getTabAt(0).setIcon(R.drawable.ic_tab1);
        tabLayoutt.getTabAt(1).setIcon(R.drawable.ic_tab2);
        tabLayoutt.getTabAt(2).setIcon(R.drawable.ic_tab3);


//        NotificationCompat.BadgeIconType badgeIconType= (NotificationCompat.BadgeIconType) Objects.requireNonNull(tabLayout.getTabAt(0)).getIcon();
//


    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
