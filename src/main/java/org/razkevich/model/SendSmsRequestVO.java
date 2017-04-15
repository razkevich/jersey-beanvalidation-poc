package org.razkevich.model;


import org.razkevich.model.constraints.IdConstraint;
import org.razkevich.model.constraints.NotNullConstraint;
import org.razkevich.model.constraints.SmsTemplateConstraint;

public class SendSmsRequestVO {

    @SmsTemplateConstraint
    private String smsTemplate;
    @NotNullConstraint
    private String phoneNumber;
    @IdConstraint
    private String smsSessionId;

    public String getSmsTemplate() {
        return smsTemplate;
    }

    public void setSmsTemplate(String smsTemplate) {
        this.smsTemplate = smsTemplate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSmsSessionId() {
        return smsSessionId;
    }

    public void setSmsSessionId(String smsSessionId) {
        this.smsSessionId = smsSessionId;
    }
}
