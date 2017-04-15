package org.razkevich.jersey;


import org.razkevich.model.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/confirmation")
@Produces(APPLICATION_JSON + "; charset=UTF-8")
@Consumes(APPLICATION_JSON)
public class ConfirmationServiceImpl implements ConfirmationService {

    @POST
    @Path("/openConfirmationSession")
    public OpenConfirmationSessionResponseVO openConfirmationSession(OpenConfirmationSessionRequestVO request) {
        return new OpenConfirmationSessionResponseVO();
    }

    @POST
    @Path("/sendSms")
    public CommonResponseVO sendSms(SendSmsRequestVO request) {
        return new CommonResponseVO();

    }

    @POST
    @Path("/checkCode")
    public CommonResponseVO checkCode(CheckCodeRequestVO request) {
        return new CommonResponseVO();
    }
}
