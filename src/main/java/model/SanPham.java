/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int masp;
    private String tensp;
    private float dongia;
    private String hinh;
    private int maloai;
    private Date ngaycapnhat;

    public SanPham() {
    }

    public SanPham(int masp, String tensp, float dongia, String hinh, int maloai, Date ngaycapnhat) {
        this.masp = masp;
        this.tensp = tensp;
        this.dongia = dongia;
        this.hinh = hinh;
        this.maloai = maloai;
        this.ngaycapnhat = ngaycapnhat;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    @Override
    public String toString() {
        return "SanPham{" + "masp=" + masp + ", tensp=" + tensp + ", dongia=" + dongia + ", hinh=" + hinh + ", maloai=" + maloai + ", ngaycapnhat=" + ngaycapnhat + '}';
    }
    
}
