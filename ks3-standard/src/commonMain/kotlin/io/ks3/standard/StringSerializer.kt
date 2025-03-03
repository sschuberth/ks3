package io.ks3.standard

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

inline fun <reified T> stringSerializer(
   crossinline decode: (String) -> T,
   crossinline encode: (T) -> String = { it.toString() },
   nameOverride: String? = null,
): KSerializer<T> = object : KSerializer<T> {
   override val descriptor = PrimitiveSerialDescriptor(nameOverride ?: T::class.simpleName!!, PrimitiveKind.STRING)

   override fun deserialize(decoder: Decoder) =
      decode(decoder.decodeString())

   override fun serialize(encoder: Encoder, value: T) =
      encoder.encodeString(encode(value))
}
