package com.zrx.mybatis.pojo;

public class emp {
    private Integer eid;
    private String empName;
    private Integer age;
    private String sex;
    private String email;
    private Integer did;

    @Override
    public String toString() {
        return "emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", did=" + did +
                ", dept=" + dept +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    private dept dept;

    public com.zrx.mybatis.pojo.dept getDept() {
        return dept;
    }

    public void setDept(com.zrx.mybatis.pojo.dept dept) {
        this.dept = dept;
    }

    public emp(Integer eid, String empName, Integer age, String sex, String email, Integer did) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public emp() {
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
