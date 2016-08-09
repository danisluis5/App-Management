/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.TinTuc;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import model.ModelTinTuc;

/**
 *
 * @author vuongluis
 */
public class ControllerTinTuc extends AbstractTableModel{
    
    private ArrayList<TinTuc> listTT = new ArrayList<TinTuc>();
    private String[] cols = {
        "<html><strong>Id tin</strong></html>",
        "<html><strong>Tên tin</strong></html>",
        "<html><strong>Danh mục</strong></html>",
        "<html><strong>Mô tả</strong></html>",
        "<html><strong>Ngày đăng</strong></html>"
    };
    private JTable tbNew;
    /** database **/
    private ModelTinTuc model;
    
    public ControllerTinTuc(JTable table){
        tbNew = table;
        model = new ModelTinTuc();
        listTT = model.getList();
    }
    @Override
    public int getRowCount() {
        return listTT.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TinTuc object = listTT.get(rowIndex);
        Object result = null;
        switch(columnIndex){
            case 0:
                result = object.getId_tin();
                break;
            case 1:
                result = object.getTenTin();
                break;
            case 2:
                result = object.getDanhMuc();
                break;
            case 3:
                result  = object.getMoTa();
                break;
            case 4:
                result = object.getNgayDang();
                break;
        }
        return result;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 0){
            return Integer.class;
        }
        return  super.getColumnClass(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
    
    /** Setting TABLE contain data **/
    public void loadTable(){
        tbNew.setModel(this);
        
        tbNew.getTableHeader().setPreferredSize(new Dimension(0, 30));
        tbNew.getTableHeader().setFont(new Font("Tahoma",Font.BOLD, 11));
        tbNew.setRowHeight(26);
        tbNew.setFont(new Font("Tahoma",Font.BOLD, 11));
        
        tbNew.getColumnModel().getColumn(0).setPreferredWidth(40);
        tbNew.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbNew.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbNew.getColumnModel().getColumn(3).setPreferredWidth(80);
        tbNew.getColumnModel().getColumn(4).setPreferredWidth(80);
    }

    public int addItem(TinTuc tinTuc,String chiTietTin) {
        //thêm vào database
        int id = model.addItem(tinTuc,chiTietTin);
        tinTuc.setId_tin(id);
        //thêm vào model
        listTT.add(tinTuc);
        this.fireTableDataChanged();
        //cuộn đến cuối dòng
        tbNew.scrollRectToVisible(tbNew.getCellRect(this.getRowCount()-1, 0, true));
        return id;
    }

    public int delItem(int id, int row) {
        // xóa trong database 
        int result = model.delItem(id);
        // xóa trong model
        int rowmodel = tbNew.convertRowIndexToModel(row);
        listTT.remove(rowmodel);
        this.fireTableDataChanged();
        return result;
        
    }

    public int editItem(TinTuc tinTuc, String chiTietTin,int row) {
        // sữa trong database
        int id=model.editItem(tinTuc,chiTietTin);
        // sữa trong model
        int rowModel=tbNew.convertRowIndexToModel(row);
        listTT.set(rowModel,tinTuc);
        this.fireTableDataChanged();
        return id;
    }
}
