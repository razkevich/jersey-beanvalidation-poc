package org.razkevich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.razkevich.jerseyconfig.ValidationPropertiesHelper;

import javax.validation.ConstraintViolation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ConstraintsViolatedResponseVO extends CommonResponseVO {

    private List<ViolatedConstraint> violatedConstraints = new ArrayList<>();

    public List<ViolatedConstraint> getViolatedConstraints() {
        return violatedConstraints;
    }

    public void setViolatedConstraints(List<ViolatedConstraint> violatedConstraints) {
        this.violatedConstraints = violatedConstraints;
    }

    @JsonIgnore
    public void setViolatedConstraintsByObject(Set<ConstraintViolation<?>> constraints) {
        for (ConstraintViolation constraint : constraints) {
            violatedConstraints.add(new ViolatedConstraint(
                    constraint.getPropertyPath() == null ? null : constraint.getPropertyPath().toString(),
                    ValidationPropertiesHelper.interpolate(constraint.getMessage()),
                    constraint.getInvalidValue()));
        }
    }

    public static class ViolatedConstraint {
        private String propertyPath;
        private String message;
        private Object wrongValue;

        public ViolatedConstraint(String propertyPath, String message, Object wrongValue) {
            this.propertyPath = propertyPath;
            this.message = message;
            this.wrongValue = wrongValue;
        }

        public ViolatedConstraint() {
            //empty constructor is needed for deserialization
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Object getWrongValue() {
            return wrongValue;
        }

        public void setWrongValue(Object wrongValue) {
            this.wrongValue = wrongValue;
        }

        public String getPropertyPath() {
            return propertyPath;
        }

        public void setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
        }
    }
}
