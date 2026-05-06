package com.enna.lite.together

  import kotlinx.coroutines.CoroutineScope

  class TogetherServer(private val scope: CoroutineScope) {
      suspend fun start(
          port: Int,
          sessionId: String,
          sessionKey: String,
          settings: TogetherRoomSettings,
      ): String = ""

      fun stop() {}

      fun broadcast(state: TogetherRoomState) {}
      fun approveParticipant(participantId: String, approved: Boolean) {}
      fun kickParticipant(participantId: String, reason: String? = null) {}
      fun banParticipant(participantId: String, reason: String? = null) {}
  }
  