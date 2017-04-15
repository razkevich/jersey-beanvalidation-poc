package org.razkevich.jerseyconfig;


import org.razkevich.model.ConfirmationErrorCodeEnum;
import org.razkevich.model.ConstraintsViolatedResponseVO;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {
    @Override
    public Response toResponse(final ConstraintViolationException e) {
        ConstraintsViolatedResponseVO response = new ConstraintsViolatedResponseVO();
        response.setResult(ConfirmationErrorCodeEnum.CONSTRAINTS_VIOLATED);
        response.setViolatedConstraintsByObject(e.getConstraintViolations());
        return Response.ok(response).type(APPLICATION_JSON + "; charset=UTF-8").build();
    }
}
