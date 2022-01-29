package samsung.mobiles.web.exception;

import samsung.mobiles.web.ApiStatus;

/**
 * @author ock
 */
public class ForbiddenException extends ApiException {
    /**
     *
     */
    public ForbiddenException() {
        super(ApiStatus.FORBIDDEN, "");
    }

    /**
     * @param message
     */
    public ForbiddenException(String message) {
        super(ApiStatus.FORBIDDEN, message);
    }
}
