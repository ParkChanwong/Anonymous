package com.mr.pcw.anonymous;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mr.pcw.anonymous.Fragment.AlarmFragment;
import com.mr.pcw.anonymous.Fragment.HomeFragment;
import com.mr.pcw.anonymous.Fragment.SearchFragment;
import com.mr.pcw.anonymous.Fragment.UserFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager= getSupportFragmentManager();
    private HomeFragment homeFragment= new HomeFragment();
    private UserFragment userFragment= new UserFragment();
    private AlarmFragment alarmFragment= new AlarmFragment();
    private SearchFragment searchFragment= new SearchFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, homeFragment);

        BottomNavigationView bottomNavigationView= findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());

        fragmentManager.beginTransaction().add(R.id.frameLayout, homeFragment).commit();
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.menu_home:
                    fragmentTransaction.replace(R.id.frameLayout, homeFragment).commitAllowingStateLoss();
                    break;

                case R.id.menu_user:
                    fragmentTransaction.replace(R.id.frameLayout, userFragment).commitAllowingStateLoss();
                    break;

                case R.id.menu_alram:
                    fragmentTransaction.replace(R.id.frameLayout, alarmFragment).commitAllowingStateLoss();
                    break;

                case R.id.menu_search:
                    fragmentTransaction.replace(R.id.frameLayout, searchFragment).commitAllowingStateLoss();
                    break;
            }

            return true;
        }
    }

}
