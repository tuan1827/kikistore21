package com.iuh.kltn.kikistore1.Presenter.KhuyenMai;

import com.iuh.kltn.kikistore1.Model.KhuyenMai.ModelKhuyenMai;
import com.iuh.kltn.kikistore1.Model.ObjectClass.KhuyenMai;
import com.iuh.kltn.kikistore1.View.TrangChu.ViewKhuyenMai;

import java.util.List;


public class PresenterLogicKhuyenMai implements IPresenterKhuyenMai {

    ViewKhuyenMai viewKhuyenMai;
    ModelKhuyenMai modelKhuyenMai;

    public PresenterLogicKhuyenMai(ViewKhuyenMai viewKhuyenMai){
        this.viewKhuyenMai = viewKhuyenMai;
        modelKhuyenMai = new ModelKhuyenMai();
    }

    @Override
    public void LayDanhSachKhuyenMai() {
        List<KhuyenMai> khuyenMaiList = modelKhuyenMai.LayDanhSachSanPhamTheoMaLoai("LayDanhSachKhuyenMai","DANHSACHKHUYENMAI");
        if(khuyenMaiList.size() > 0){
            viewKhuyenMai.HienThiDanhSachKhuyenMai(khuyenMaiList);
        }
    }
}
