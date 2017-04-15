package org.razkevich.jersey;


import org.razkevich.model.*;

import javax.validation.Valid;

public interface ConfirmationService {

    @Valid
    OpenConfirmationSessionResponseVO openConfirmationSession(@Valid OpenConfirmationSessionRequestVO request);

    @Valid
    CommonResponseVO sendSms(@Valid SendSmsRequestVO request);

    @Valid
    CommonResponseVO checkCode(@Valid CheckCodeRequestVO request);
}
