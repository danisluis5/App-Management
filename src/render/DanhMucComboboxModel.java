/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package render;

import bean.DanhMuc;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import model.ModelDanhMuc;

/**
 *
 * @author vuongluis
 */
public class DanhMucComboboxModel implements ComboBoxModel{

    private ArrayList<DanhMuc> listDM = new ArrayList<DanhMuc>();
    private DanhMuc object = new DanhMuc();
    
    public DanhMucComboboxModel() {
        // model
//        listDM.add(new DanhMuc(1,"Tin Thế Giới"));
//        listDM.add(new DanhMuc(2,"Tin Thể Thao"));
//        listDM.add(new DanhMuc(3,"Tin Bóng Đá"));
        //database
        listDM = new ModelDanhMuc().getList();
        
        object = listDM.get(0);
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        object = (DanhMuc) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return object;
    }
    @Override
    public int getSize() {
        return listDM.size();
    }

    @Override
    public DanhMuc getElementAt(int index) {
        return listDM.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        //
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        // 
    }
}
