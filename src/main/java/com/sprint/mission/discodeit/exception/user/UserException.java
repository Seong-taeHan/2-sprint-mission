package com.sprint.mission.discodeit.exception.user;

import com.sprint.mission.discodeit.constant.ErrorCode;
import com.sprint.mission.discodeit.exception.DiscodeitException;
import java.util.Map;

public class UserException extends DiscodeitException {

    public UserException(ErrorCode errorCode, Map<String, Object> details) {
        super(errorCode, details);
    }

}
