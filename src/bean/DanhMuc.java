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
public class DanhMuc {
    private int id;
    private String tenDanhMuc;

    public DanhMuc(){    
    }
    
    public DanhMuc(int id, String tenDanhMuc) {
        this.id = id;
        this.tenDanhMuc = tenDanhMuc;
    }

    public int getId() {
        return id;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
    @Override
    public String toString(){
        return this.tenDanhMuc;
    }
}
