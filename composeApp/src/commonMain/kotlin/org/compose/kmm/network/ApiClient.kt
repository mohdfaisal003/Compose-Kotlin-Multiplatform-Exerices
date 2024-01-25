package org.compose.kmm.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import kotlinx.serialization.ExperimentalSerializationApi

object ApiClient {
    @OptIn(ExperimentalSerializationApi::class)
    var client = HttpClient {
        /* Logging */
        install(Logging) {
            level = LogLevel.ALL
        }
    }
}