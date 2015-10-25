package psyco.codebot.web.core;

import java.io.Serializable;

/**
 * Created by peng on 15/10/25.
 */
public class WebResponse implements Serializable {

    private boolean isSuccess = true;
    private Object data;
    private String errorMessage;

    public static WebResponse success(Object obj) {
        WebResponse re = new WebResponse();
        re.setData(obj);
        return re;
    }

    public static WebResponse error(String message) {
        WebResponse re = new WebResponse();
        re.setIsSuccess(false);
        re.setErrorMessage(message);
        return re;
    }


    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
