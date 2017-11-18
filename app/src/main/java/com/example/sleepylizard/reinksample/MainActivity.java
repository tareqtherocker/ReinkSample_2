package com.example.sleepylizard.reinksample;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager =  (ViewPager) findViewById(R.id.mainViewPager);
        tabLayout =  (TabLayout) findViewById(R.id.tabs);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }

    void setUpViewPager(ViewPager vp){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new FragHome(), "Home");
        viewPagerAdapter.addFragments(new FragOffer(), "Offers");

        vp.setAdapter(viewPagerAdapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> frag_list = new ArrayList<Fragment>();
        private final List<String> frag_titles = new ArrayList<String>();

        public ViewPagerAdapter (FragmentManager fragmentManager){
            super (fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return frag_list.get(position);
        }

        @Override
        public int getCount() {
            return frag_list.size();
        }


        void addFragments(Fragment f, String title){
            frag_list.add(f);
            frag_titles.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return frag_titles.get(position);
        }
    }
}
