@file:Suppress("unused")

package io.ks3.java.`typealias`

import io.ks3.java.net.UriSerializer
import io.ks3.java.net.UrlSerializer
import io.ks3.java.time.InstantAsLongSerializer
import io.ks3.java.time.InstantAsStringSerializer
import io.ks3.java.time.LocalDateAsStringSerializer
import io.ks3.java.time.LocalDateTimeAsStringSerializer
import io.ks3.java.time.LocalTimeAsStringSerializer
import io.ks3.java.time.OffsetDateTimeAsStringSerializer
import io.ks3.java.time.YearMonthAsStringSerializer
import io.ks3.java.util.UuidSerializer
import kotlinx.serialization.Serializable
import java.net.URI
import java.net.URL
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.YearMonth
import java.util.UUID

//-- NET --
typealias UrlAsString = @Serializable(with = UrlSerializer::class) URL
typealias UriAsString = @Serializable(with = UriSerializer::class) URI

//-- TIME --
typealias YearMonthAsString = @Serializable(with = YearMonthAsStringSerializer::class) YearMonth
typealias InstantAsString = @Serializable(with = InstantAsStringSerializer::class) Instant
typealias InstantAsLong = @Serializable(with = InstantAsLongSerializer::class) Instant
typealias LocalDateAsString = @Serializable(with = LocalDateAsStringSerializer::class) LocalDate
typealias LocalDateTimeAsString = @Serializable(with = LocalDateTimeAsStringSerializer::class) LocalDateTime
typealias LocalTimeAsString = @Serializable(with = LocalTimeAsStringSerializer::class) LocalTime
typealias OffsetDateTimeAsString = @Serializable(with = OffsetDateTimeAsStringSerializer::class) OffsetDateTime

//-- UTIL --
typealias UuidAsString = @Serializable(with = UuidSerializer::class) UUID

