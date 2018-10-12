package com.adi.f_xml_b_setter;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/1 12:01
 */
public class Address {
    private String addr;
    private String phone;

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
