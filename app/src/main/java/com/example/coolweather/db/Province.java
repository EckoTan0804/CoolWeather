package com.example.coolweather.db;

import org.litepal.crud.DataSupport;


/**
 * Project: CoolWeather
 * Package: com.example.coolweather.db
 * Author: Ecko Tan
 * E-mail: ecko0804@gmail.com
 * Created at 2017/1/6:08:46
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
