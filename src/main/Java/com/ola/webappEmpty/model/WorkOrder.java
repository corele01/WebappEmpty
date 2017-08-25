package com.ola.webappEmpty.model;

public class WorkOrder {
    private Integer id;

    private String name;

    private String tel;

    private String carnum;

    private Integer mileage;

    private String orders;

    private String workorderpro;

    private String problemtype;

    private String problem;

    private String customerrequest;

    private String acceptancer;

    private String department;

    private String orderser;

    private String opinion;

    private String replydate;

    private String replytime;

    private String actualreplydate;

    private String actualreplytime;

    private String sturts;

    private String createDate;

    private String createTime;

    private String modifyDate;

    private String modifyTime;

    private String modifyUser;

    private String remarks;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders == null ? null : orders.trim();
    }

    public String getWorkorderpro() {
        return workorderpro;
    }

    public void setWorkorderpro(String workorderpro) {
        this.workorderpro = workorderpro == null ? null : workorderpro.trim();
    }

    public String getProblemtype() {
        return problemtype;
    }

    public void setProblemtype(String problemtype) {
        this.problemtype = problemtype == null ? null : problemtype.trim();
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    public String getCustomerrequest() {
        return customerrequest;
    }

    public void setCustomerrequest(String customerrequest) {
        this.customerrequest = customerrequest == null ? null : customerrequest.trim();
    }

    public String getAcceptancer() {
        return acceptancer;
    }

    public void setAcceptancer(String acceptancer) {
        this.acceptancer = acceptancer == null ? null : acceptancer.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getOrderser() {
        return orderser;
    }

    public void setOrderser(String orderser) {
        this.orderser = orderser == null ? null : orderser.trim();
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }

    public String getSturts() {
        return sturts;
    }

    public void setSturts(String sturts) {
        this.sturts = sturts == null ? null : sturts.trim();
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getReplydate() {
        return replydate;
    }

    public void setReplydate(String replydate) {
        this.replydate = replydate;
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime;
    }

    public String getActualreplydate() {
        return actualreplydate;
    }

    public void setActualreplydate(String actualreplydate) {
        this.actualreplydate = actualreplydate;
    }

    public String getActualreplytime() {
        return actualreplytime;
    }

    public void setActualreplytime(String actualreplytime) {
        this.actualreplytime = actualreplytime;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.id == ((WorkOrder) obj).getId()) {
            return true;
        }
        return super.equals(obj);
    }
}