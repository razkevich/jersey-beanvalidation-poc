package org.razkevich.model;


import org.razkevich.model.constraints.IdConstraint;

public class OpenConfirmationSessionResponseVO extends CommonResponseVO {

    @IdConstraint
    private String smsSessionId;

    public String getSmsSessionId() {
        return smsSessionId;
    }

    public void setSmsSessionId(String smsSessionId) {
        this.smsSessionId = smsSessionId;
    }
}
