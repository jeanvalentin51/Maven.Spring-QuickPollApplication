package io.zipcoder.tc_spring_poll_application.dtos.error;

public class ValidationError {

    String code;
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
