package com.sprint.mission.discodeit.dto;

import java.util.UUID;

public record FindIsReadStatusDto(
    UUID channelUUID,
    String channelName
) {
}
