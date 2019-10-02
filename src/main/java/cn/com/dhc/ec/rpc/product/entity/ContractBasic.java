package cn.com.dhc.ec.rpc.product.entity;

import java.util.Date;

public class ContractBasic {
    private Long id;

    private Long cooperationBasicId;

    private String venderName;

    private String venderCode;

    private String joinDept;

    private String mainBrand;

    private String firstParty;

    private Integer cooperationModes;

    private Integer cooperationArea;

    private String companyAddress;

    private String createUser;

    private Date createDate;

    private String modifyUser;

    private Date modifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCooperationBasicId() {
        return cooperationBasicId;
    }

    public void setCooperationBasicId(Long cooperationBasicId) {
        this.cooperationBasicId = cooperationBasicId;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName == null ? null : venderName.trim();
    }

    public String getVenderCode() {
        return venderCode;
    }

    public void setVenderCode(String venderCode) {
        this.venderCode = venderCode == null ? null : venderCode.trim();
    }

    public String getJoinDept() {
        return joinDept;
    }

    public void setJoinDept(String joinDept) {
        this.joinDept = joinDept == null ? null : joinDept.trim();
    }

    public String getMainBrand() {
        return mainBrand;
    }

    public void setMainBrand(String mainBrand) {
        this.mainBrand = mainBrand == null ? null : mainBrand.trim();
    }

    public String getFirstParty() {
        return firstParty;
    }

    public void setFirstParty(String firstParty) {
        this.firstParty = firstParty == null ? null : firstParty.trim();
    }

    public Integer getCooperationModes() {
        return cooperationModes;
    }

    public void setCooperationModes(Integer cooperationModes) {
        this.cooperationModes = cooperationModes;
    }

    public Integer getCooperationArea() {
        return cooperationArea;
    }

    public void setCooperationArea(Integer cooperationArea) {
        this.cooperationArea = cooperationArea;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}