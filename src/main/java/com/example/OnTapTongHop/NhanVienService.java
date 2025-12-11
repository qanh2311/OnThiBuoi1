package com.example.OnTapTongHop;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> dsNhanVien = new ArrayList<>();

    public boolean themNhanVien(NhanVien nv) {
        if (nv == null) {
            throw new IllegalArgumentException("Đối tượng đang bị null");
        }

        if (nv.getMaNV().isEmpty() || nv.getTenNV().isEmpty() || nv.getPhongBan().isEmpty()) {
            throw new IllegalArgumentException("Các trường không được để trống");
        }

        if (nv.getLuong() <= 0 || nv.getLuong() >= 100_000_000) {
            throw new IllegalArgumentException("Lương phải > 0 và <= 100tr");
        }
        for (NhanVien nv1 : dsNhanVien) {
            if (nv1.getMaNV().equals(nv.getMaNV())) {
                throw new IllegalArgumentException("ID da ton tai" + nv.getMaNV());
            }
        }
        dsNhanVien.add(nv);
        return true;
    }

    public boolean suaNV(String ma, double luongMoi) {
        for (NhanVien nv : dsNhanVien) {
            if (nv.getMaNV().equals(ma)) {
                if (luongMoi <= 0 || luongMoi >= 100_000_000) {
                    throw new IllegalArgumentException("Lương phải > 0 và <= 100tr");
                }
                nv.setLuong(luongMoi);
                return true;
            }
        }
        throw new IllegalArgumentException("Khong tim thay ma");
    }
}
