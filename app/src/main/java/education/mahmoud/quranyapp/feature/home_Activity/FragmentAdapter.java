package education.mahmoud.quranyapp.feature.home_Activity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragments ;
    List<String> titles ;

    public FragmentAdapter(FragmentManager fm , List<Fragment> fragmentList , List<String> titlesList) {
        super(fm);
        fragments = new ArrayList<>(fragmentList);
        titles = new ArrayList<>(titlesList);
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
