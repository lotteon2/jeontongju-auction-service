package com.jeontongju.auction.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessageDto {
  private Long memberId;
  private String message;
}
