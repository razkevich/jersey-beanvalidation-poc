package org.razkevich.model;


import org.razkevich.model.constraints.IdConstraint;

public class OpenConfirmationSessionRequestVO {

    @IdConstraint
    private String operationId;

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }
}
