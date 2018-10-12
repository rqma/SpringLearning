package com.adi.f_xml_b_setter;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/1 11:59
 */
public class Person {
    private String pname;
    private Integer age;
    private Address homeaddr;
    private Address companyaddr;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getHomeaddr() {
        return homeaddr;
    }

    public void setHomeaddr(Address homeaddr) {
        this.homeaddr = homeaddr;
    }

    public Address getCompanyaddr() {
        return companyaddr;
    }

    public void setCompanyaddr(Address companyaddr) {
        this.companyaddr = companyaddr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", age=" + age +
                ", homeaddr=" + homeaddr +
                ", companyaddr=" + companyaddr +
                '}';
    }


}
