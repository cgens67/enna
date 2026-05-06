package com.enna.lite.together

  object TogetherOnlineApi {
      suspend fun createSession(endpoint: String, bearerToken: String, settings: TogetherRoomSettings): String = ""
      suspend fun joinSession(endpoint: String, code: String): String = ""
  }
  