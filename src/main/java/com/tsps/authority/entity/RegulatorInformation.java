package com.tsps.authority.entity;

public class RegulatorInformation {
    private Integer id;

    private String regulatorAccount;

    private String regulatorPwd;

    private String ragulatorName;

    private String regulatorTel;

    private String regulatorMob;

    private String regulatorAddressShengfen;

    private String regulatorAddressShiqu;

    private String regulatorAddressXianqu;

    private String regulatorAddress;

    private String regulatorWebsite;

    private String regulatorEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegulatorAccount() {
        return regulatorAccount;
    }

    public void setRegulatorAccount(String regulatorAccount) {
        this.regulatorAccount = regulatorAccount == null ? null : regulatorAccount.trim();
    }

    public String getRegulatorPwd() {
        return regulatorPwd;
    }

    public void setRegulatorPwd(String regulatorPwd) {
        this.regulatorPwd = regulatorPwd == null ? null : regulatorPwd.trim();
    }

    public String getRagulatorName() {
        return ragulatorName;
    }

    public void setRagulatorName(String ragulatorName) {
        this.ragulatorName = ragulatorName == null ? null : ragulatorName.trim();
    }

    public String getRegulatorTel() {
        return regulatorTel;
    }

    public void setRegulatorTel(String regulatorTel) {
        this.regulatorTel = regulatorTel == null ? null : regulatorTel.trim();
    }

    public String getRegulatorMob() {
        return regulatorMob;
    }

    public void setRegulatorMob(String regulatorMob) {
        this.regulatorMob = regulatorMob == null ? null : regulatorMob.trim();
    }

    public String getRegulatorAddressShengfen() {
        return regulatorAddressShengfen;
    }

    public void setRegulatorAddressShengfen(String regulatorAddressShengfen) {
        this.regulatorAddressShengfen = regulatorAddressShengfen == null ? null : regulatorAddressShengfen.trim();
    }

    public String getRegulatorAddressShiqu() {
        return regulatorAddressShiqu;
    }

    public void setRegulatorAddressShiqu(String regulatorAddressShiqu) {
        this.regulatorAddressShiqu = regulatorAddressShiqu == null ? null : regulatorAddressShiqu.trim();
    }

    public String getRegulatorAddressXianqu() {
        return regulatorAddressXianqu;
    }

    public void setRegulatorAddressXianqu(String regulatorAddressXianqu) {
        this.regulatorAddressXianqu = regulatorAddressXianqu == null ? null : regulatorAddressXianqu.trim();
    }

    public String getRegulatorAddress() {
        return regulatorAddress;
    }

    public void setRegulatorAddress(String regulatorAddress) {
        this.regulatorAddress = regulatorAddress == null ? null : regulatorAddress.trim();
    }

    public String getRegulatorWebsite() {
        return regulatorWebsite;
    }

    public void setRegulatorWebsite(String regulatorWebsite) {
        this.regulatorWebsite = regulatorWebsite == null ? null : regulatorWebsite.trim();
    }

    public String getRegulatorEmail() {
        return regulatorEmail;
    }

    public void setRegulatorEmail(String regulatorEmail) {
        this.regulatorEmail = regulatorEmail == null ? null : regulatorEmail.trim();
    }
}