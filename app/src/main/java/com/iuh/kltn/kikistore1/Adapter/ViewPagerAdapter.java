package com.iuh.kltn.kikistore1.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> listFragment = new ArrayList<Fragment>();
    List<String> titleFragment = new ArrayList<String>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        listFragment.add(new com.iuh.kltn.kikistore1.View.TrangChu.Fragment.FragmentNoiBat());
        listFragment.add(new com.iuh.kltn.kikistore1.View.TrangChu.Fragment.FragmentChuongTrinhKhuyenMai());
        listFragment.add(new com.iuh.kltn.kikistore1.View.TrangChu.Fragment.FragmentDienTu());

        titleFragment.add("Nổi bật");
        titleFragment.add("Chương trình khuyến mãi");
        titleFragment.add("Điện tử");
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleFragment.get(position);
    }
}
