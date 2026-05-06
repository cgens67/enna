package com.enna.lite.together

  import kotlinx.coroutines.CoroutineScope

  class TogetherOnlineHost(private val scope: CoroutineScope) {
      suspend fun start(endpoint: String, bearerToken: String, settings: TogetherRoomSettings): String = ""
      fun stop() {}
      fun broadcast(state: TogetherRoomState) {}
      fun approveParticipant(participantId: String, approved: Boolean) {}
      fun kickParticipant(participantId: String, reason: String? = null) {}
      fun banParticipant(participantId: String, reason: String? = null) {}
  }
  