/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.DanhMuc;
import bean.TinTuc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import library.LibraryConnectDb;

/**
 *
 * @author vuongluis
 */
public class ModelDanhMuc {
    private Connection conn;
    private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public ArrayList<DanhMuc> getList() {
        lcdb = new LibraryConnectDb();
        ArrayList<DanhMuc> alDanhMuc = new ArrayList<>();
        //mở connect
        conn = lcdb.getConnectMySQL();
        String sql = "SELECT * FROM category";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                alDanhMuc.add(new DanhMuc(rs.getInt("id"),rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return alDanhMuc;
    }
}
