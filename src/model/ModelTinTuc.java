/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.TinTuc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import library.LibraryConnectDb;

/**
 *
 * @author vuongluis
 */
public class ModelTinTuc {
    private Connection conn;
    private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public ArrayList<TinTuc> getList() {
        lcdb = new LibraryConnectDb();
        ArrayList<TinTuc> alNews = new ArrayList<>();
        //mở connect
        conn = lcdb.getConnectMySQL();
        String sql = "SELECT * FROM tintuc";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                alNews.add(new TinTuc(rs.getInt("id_tin"), rs.getString("tentin"), rs.getString("danhmuc"), rs.getString("mota"), rs.getString("ngaydang"),rs.getString("chitiet")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return alNews;
    }
    public int addItem(TinTuc item,String chiTietTin){
        int result = 0;
        lcdb = new LibraryConnectDb();
        conn = lcdb.getConnectMySQL();
        Date utitlDate = new Date();
        String date = new SimpleDateFormat("yyyy-MM-dd").format(utitlDate);
        String sql = "INSERT INTO tintuc(tentin,danhmuc,hinhanh,mota,chitiet,ngaydang) VALUES (?,?,?,?,?,?)";
        try {
                pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                pst.setString(1, item.getTenTin());
                pst.setString(2, item.getDanhMuc());
                pst.setString(3, item.getHinhAnh());
                pst.setString(4, item.getMoTa());
                pst.setString(5, chiTietTin);
                pst.setString(6, date);
                result = pst.executeUpdate();
                //get last id
                rs = pst.getGeneratedKeys();
                if (rs.next()){
                    result = rs.getInt(1);
                }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                    pst.close();
                    conn.close();
                } catch (SQLException e) {
            }
        }
        return result;
    }

    public TinTuc getItem(int id) {
        lcdb = new LibraryConnectDb();
        conn = lcdb.getConnectMySQL();
        TinTuc tinTuc = null;
        String  sql = "SELECT * FROM tintuc WHERE id_tin = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
                tinTuc = new TinTuc(rs.getInt("id_tin"), rs.getString("tentin"), rs.getString("danhmuc"), rs.getString("mota"), rs.getString("ngaydang"),rs.getString("chitiet"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelTinTuc.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return tinTuc;
    }

    public int delItem(int id) {
        int result = 0;
        lcdb = new LibraryConnectDb();
        conn = lcdb.getConnectMySQL();

        String sql = "DELETE FROM tintuc WHERE id_tin = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            result = pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public int editItem(TinTuc tinTuc, String chiTietTin) {
        int result = 0;
        lcdb = new LibraryConnectDb();
        conn = lcdb.getConnectMySQL();
        String sql = "UPDATE tintuc SET tentin = ?, danhmuc = ?,hinhanh = ?,mota=?,chitiet = ? WHERE id_tin = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tinTuc.getTenTin());
            pst.setString(2, tinTuc.getDanhMuc());
            pst.setString(3, tinTuc.getHinhAnh());
            pst.setString(4, tinTuc.getMoTa());
            pst.setString(5, chiTietTin);
            pst.setInt(6, tinTuc.getId_tin());
            result = pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}
