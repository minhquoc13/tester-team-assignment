package model;

public class Fund {
    private String payersAccountNo;
    private String PayeesAccountNo;
    private String amount;
    private String description;

    public Fund(String payersAccountNo, String payeesAccountNo, String amount, String description) {
        this.payersAccountNo = payersAccountNo;
        PayeesAccountNo = payeesAccountNo;
        this.amount = amount;
        this.description = description;
    }

    public String getPayersAccountNo() {
        return payersAccountNo;
    }

    public void setPayersAccountNo(String payersAccountNo) {
        this.payersAccountNo = payersAccountNo;
    }

    public String getPayeesAccountNo() {
        return PayeesAccountNo;
    }

    public void setPayeesAccountNo(String payeesAccountNo) {
        PayeesAccountNo = payeesAccountNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
