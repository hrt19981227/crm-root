package com.qy25.sm.entity;

import com.qy25.sm.entity.base.BaseEntity;

import java.util.Date;

public class Supplier extends BaseEntity {


    private String supplierName;

    private String supplierContact;

    private String supplierPhone;

    private String supplierEmail;

    private String supplierAddress;

    private String supplierBank;

    private String supplierBrankCode;


    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact == null ? null : supplierContact.trim();
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone == null ? null : supplierPhone.trim();
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    public String getSupplierBank() {
        return supplierBank;
    }

    public void setSupplierBank(String supplierBank) {
        this.supplierBank = supplierBank == null ? null : supplierBank.trim();
    }

    public String getSupplierBrankCode() {
        return supplierBrankCode;
    }

    public void setSupplierBrankCode(String supplierBrankCode) {
        this.supplierBrankCode = supplierBrankCode == null ? null : supplierBrankCode.trim();
    }

}