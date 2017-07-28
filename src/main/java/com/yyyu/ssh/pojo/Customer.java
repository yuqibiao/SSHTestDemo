package com.yyyu.ssh.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/24.
 */
public class Customer implements Serializable {
    private long custId;
    private String custName;
    private Long custUserId;
    private Long custCreateId;
    private String custSource;
    private String custIndustry;
    private String custLevel;
    private String custLinkman;
    private String custPhone;
    private String custMobile;
    private String custZipcode;
    private String custAddress;
    private Timestamp custCreatetime;

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(Long custUserId) {
        this.custUserId = custUserId;
    }

    public Long getCustCreateId() {
        return custCreateId;
    }

    public void setCustCreateId(Long custCreateId) {
        this.custCreateId = custCreateId;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public Timestamp getCustCreatetime() {
        return custCreatetime;
    }

    public void setCustCreatetime(Timestamp custCreatetime) {
        this.custCreatetime = custCreatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (custId != customer.custId) return false;
        if (custName != null ? !custName.equals(customer.custName) : customer.custName != null) return false;
        if (custUserId != null ? !custUserId.equals(customer.custUserId) : customer.custUserId != null) return false;
        if (custCreateId != null ? !custCreateId.equals(customer.custCreateId) : customer.custCreateId != null)
            return false;
        if (custSource != null ? !custSource.equals(customer.custSource) : customer.custSource != null) return false;
        if (custIndustry != null ? !custIndustry.equals(customer.custIndustry) : customer.custIndustry != null)
            return false;
        if (custLevel != null ? !custLevel.equals(customer.custLevel) : customer.custLevel != null) return false;
        if (custLinkman != null ? !custLinkman.equals(customer.custLinkman) : customer.custLinkman != null)
            return false;
        if (custPhone != null ? !custPhone.equals(customer.custPhone) : customer.custPhone != null) return false;
        if (custMobile != null ? !custMobile.equals(customer.custMobile) : customer.custMobile != null) return false;
        if (custZipcode != null ? !custZipcode.equals(customer.custZipcode) : customer.custZipcode != null)
            return false;
        if (custAddress != null ? !custAddress.equals(customer.custAddress) : customer.custAddress != null)
            return false;
        if (custCreatetime != null ? !custCreatetime.equals(customer.custCreatetime) : customer.custCreatetime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (custId ^ (custId >>> 32));
        result = 31 * result + (custName != null ? custName.hashCode() : 0);
        result = 31 * result + (custUserId != null ? custUserId.hashCode() : 0);
        result = 31 * result + (custCreateId != null ? custCreateId.hashCode() : 0);
        result = 31 * result + (custSource != null ? custSource.hashCode() : 0);
        result = 31 * result + (custIndustry != null ? custIndustry.hashCode() : 0);
        result = 31 * result + (custLevel != null ? custLevel.hashCode() : 0);
        result = 31 * result + (custLinkman != null ? custLinkman.hashCode() : 0);
        result = 31 * result + (custPhone != null ? custPhone.hashCode() : 0);
        result = 31 * result + (custMobile != null ? custMobile.hashCode() : 0);
        result = 31 * result + (custZipcode != null ? custZipcode.hashCode() : 0);
        result = 31 * result + (custAddress != null ? custAddress.hashCode() : 0);
        result = 31 * result + (custCreatetime != null ? custCreatetime.hashCode() : 0);
        return result;
    }
}
