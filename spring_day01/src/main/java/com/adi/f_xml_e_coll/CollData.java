package com.adi.f_xml_e_coll;

import java.util.*;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/1 14:33
 */
public class CollData {
    private String []arrayData;
    private List<String> listData;
    private Map<String,String>mapData;
    private Set setData;
    private Properties propertiesData;

    public String[] getArrayData() {
        return arrayData;
    }

    public void setArrayData(String[] arrayData) {
        this.arrayData = arrayData;
    }

    public List<String> getListData() {
        return listData;
    }

    public void setListData(List<String> listData) {
        this.listData = listData;
    }

    public Map<String, String> getMapData() {
        return mapData;
    }

    public void setMapData(Map<String, String> mapData) {
        this.mapData = mapData;
    }

    public Set getSetData() {
        return setData;
    }

    public void setSetData(Set setData) {
        this.setData = setData;
    }

    public Properties getPropertiesData() {
        return propertiesData;
    }

    public void setPropertiesData(Properties propertiesData) {
        this.propertiesData = propertiesData;
    }

    @Override
    public String toString() {
        return "CollData{" +
                "arrayData=" + Arrays.toString(arrayData) +
                ", listData=" + listData +
                ", mapData=" + mapData +
                ", setData=" + setData +
                ", propertiesData=" + propertiesData +
                '}';
    }
}
