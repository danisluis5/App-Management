/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author vuongluis
 */
public class TinTuc {
    private int id_tin;
    private String tenTin;
    private String danhMuc;
    private String moTa;
    private String ngayDang;
    private String hinhAnh;
    private String chiTiet;
    
    public TinTuc() {
    }

    public TinTuc(int id_tin, String tenTin, String danhMuc, String moTa, String ngayDang, String chiTiet) {
        this.id_tin = id_tin;
        this.tenTin = tenTin;
        this.danhMuc = danhMuc;
        this.moTa = moTa;
        this.ngayDang = ngayDang;
        this.chiTiet = chiTiet;
    }

    public TinTuc(String tenTin, String danhMuc, String moTa, String ngayDang, String hinhAnh,String chiTiet) {
        this.tenTin = tenTin;
        this.danhMuc = danhMuc;
        this.moTa = moTa;
        this.ngayDang = ngayDang;
        this.hinhAnh = hinhAnh;
        this.chiTiet = chiTiet;
    }

    public TinTuc(String tenTin, String danhMuc, String hinhAnh,String moTa, String ngayDang) {
        this.tenTin = tenTin;
        this.danhMuc = danhMuc;
        this.moTa = moTa;
        this.ngayDang = ngayDang;
        this.hinhAnh = hinhAnh;
    }
    
    public TinTuc(String tenTin, String danhMuc, String hinhAnh,String moTa) {
        this.tenTin = tenTin;
        this.danhMuc = danhMuc;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
    

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    
    public int getId_tin() {
        return id_tin;
    }

    public String getTenTin() {
        return tenTin;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getNgayDang() {
        return ngayDang;
    }

    public void setId_tin(int id_tin) {
        this.id_tin = id_tin;
    }

    public void setTenTin(String tenTin) {
        this.tenTin = tenTin;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setNgayDang(String ngayDang) {
        this.ngayDang = ngayDang;
    }
}
