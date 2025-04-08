package com.sprint.mission.discodeit.dto.message;

import java.util.UUID;

public record MessageCreateRequest(
    UUID channelId,
    UUID authorId,
    String content
) {

}
