package maodun.mvc.wrapper;

import maodun.mvc.result.ErrorCode;
import maodun.mvc.result.FastResult;

import java.util.Objects;

/**
 * @author DELL
 * @date 2023/5/16
 */
public class DefaultResponseWrapper {
    public Object resultWrapper(Object data) {
        if (data == null) {
            return new FastResult<>();
        }
        if (Objects.equals(FastResult.class, data.getClass())) {
            return data;
        }
        return new FastResult<>(data);
    }

    public Object errorCodeWrapper(int code, String message) {
        return new FastResult<>(new ErrorCode() {
            @Override
            public String getMessage() {
                return message;
            }

            @Override
            public int getCode() {
                return code;
            }
        });
    }
}
