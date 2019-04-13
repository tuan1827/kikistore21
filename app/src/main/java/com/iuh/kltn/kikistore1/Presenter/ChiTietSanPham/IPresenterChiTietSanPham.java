package com.iuh.kltn.kikistore1.Presenter.ChiTietSanPham;

import android.content.Context;

import com.iuh.kltn.kikistore1.Model.ObjectClass.SanPham;

public interface IPresenterChiTietSanPham {
    void LayChiTietSanPham(int masp);
    void LayDanhSachDanhGiaTheoCuaSanPham(int masp, int limit);
    void ThemGioHang(SanPham sanPham, Context context);
}
