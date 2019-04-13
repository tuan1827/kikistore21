package com.iuh.kltn.kikistore1.View.TrangChu;

import com.iuh.kltn.kikistore1.Model.ObjectClass.DienTu;
import com.iuh.kltn.kikistore1.Model.ObjectClass.SanPham;
import com.iuh.kltn.kikistore1.Model.ObjectClass.ThuongHieu;

import java.util.List;

public interface ViewDienTu {
    void HienThiDanhSach(List<DienTu> dienTus);
    void HienThiLogoThuongHieu(List<ThuongHieu> thuongHieus);
    void LoiLayDuLieu();
    void HienThiSanPhamMoiVe(List<SanPham> sanPhams);
}
