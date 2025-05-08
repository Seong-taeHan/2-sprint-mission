package com.sprint.mission.discodeit.exception.channel;

import com.sprint.mission.discodeit.constant.ErrorCode;
import com.sprint.mission.discodeit.exception.DiscodeitException;
import java.util.Map;

public class ChannelException extends DiscodeitException {

    public ChannelException(ErrorCode errorCode,
        Map<String, Object> details) {
        super(errorCode, details);
    }
}
