package org.razkevich.model;


import org.razkevich.model.constraints.IdConstraint;
import org.razkevich.model.constraints.SmsCodeConstraint;

public class CheckCodeRequestVO {

    @SmsCodeConstraint
    private String smsCode;
    @IdConstraint
    private String smsSessionId;
    @IdConstraint
    private String operationId;

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getSmsSessionId() {
        return smsSessionId;
    }

    public void setSmsSessionId(String smsSessionId) {
        this.smsSessionId = smsSessionId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }
}
