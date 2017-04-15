package org.razkevich.model.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@NotNullConstraint
@Pattern(message = "${SmsCodeConstraintMessage}", regexp = "^[0-9]*$")
@Size(message = "${MaxLenConstraintMessage} {max}", max = 5)
public @interface SmsCodeConstraint {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
