package com.enna.lite.together

  import androidx.compose.runtime.Immutable
  import kotlinx.coroutines.flow.Flow
  import kotlinx.coroutines.flow.emptyFlow

  @Immutable
  sealed interface TogetherClientEvent

  class TogetherClient {
      val events: Flow<TogetherClientEvent> get() = emptyFlow()

      suspend fun connect(url: String, sessionId: String, sessionKey: String, clientId: String, displayName: String): Boolean = false
      suspend fun send(message: TogetherMessage) {}
      fun close() {}
  }
  