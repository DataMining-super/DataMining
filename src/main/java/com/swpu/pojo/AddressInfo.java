package com.swpu.pojo;

/**
 * 描述:
 * 地址信息
 *
 * @author ace-huang
 * @create 2019-08-12 4:53 PM
 */
public class AddressInfo {

    private  Integer addressId;

    private String country;

    private String province;

    private String detail;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}