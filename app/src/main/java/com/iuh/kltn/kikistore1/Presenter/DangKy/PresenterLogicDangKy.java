package com.iuh.kltn.kikistore1.Presenter.DangKy;

import com.iuh.kltn.kikistore1.Model.DangNhap_DangKy.ModelDangKy;
import com.iuh.kltn.kikistore1.Model.ObjectClass.NhanVien;
import com.iuh.kltn.kikistore1.View.DangNhap_DangKy.ViewDangKy;

public class PresenterLogicDangKy implements IPresenterDangKy {
    ViewDangKy viewDangKy;
    ModelDangKy modelDangKy;

    public PresenterLogicDangKy(ViewDangKy viewDangKy){
        this.viewDangKy = viewDangKy;
        modelDangKy = new ModelDangKy();
    }

    @Override
    public void ThucHienDangKy(NhanVien nhanvien) {
        boolean kiemtra = modelDangKy.DangKyThanhVien(nhanvien);
        if(kiemtra){
            viewDangKy.DangKyThangCong();
        }else{
            viewDangKy.DangKyThatBai();
        }
    }
}
