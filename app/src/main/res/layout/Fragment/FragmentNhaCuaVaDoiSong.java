package com.checongbinh.lazada.View.TrangChu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.checongbinh.lazada.R;

/**
 * Created by Lenovo S410p on 6/23/2016.
 */
public class FragmentNhaCuaVaDoiSong extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_nhacuavadoisong,container,false);
        return view;
    }
}
