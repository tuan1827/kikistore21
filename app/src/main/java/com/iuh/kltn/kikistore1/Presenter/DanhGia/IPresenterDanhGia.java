package com.iuh.kltn.kikistore1.Presenter.DanhGia;

import android.widget.ProgressBar;

import com.iuh.kltn.kikistore1.Model.ObjectClass.DanhGia;

public interface IPresenterDanhGia {
    void ThemDanhGia(DanhGia danhGia);
    void LayDanhSachDanhGiaCuaSanPham(int masp, int limit, ProgressBar progressBar);
}
