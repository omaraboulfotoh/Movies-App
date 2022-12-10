// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.android.model.responses.base.error

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.collections.emptySet
import kotlin.text.buildString

public class AuthErrorJsonAdapter(
  moshi: Moshi
) : JsonAdapter<AuthError>() {
  private val options: JsonReader.Options = JsonReader.Options.of("message", "errors")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "message")

  private val mapOfStringStringAdapter: JsonAdapter<Map<String, String>> =
      moshi.adapter(Types.newParameterizedType(Map::class.java, String::class.java,
      String::class.java), emptySet(), "errors")

  public override fun toString(): String = buildString(31) {
      append("GeneratedJsonAdapter(").append("AuthError").append(')') }

  public override fun fromJson(reader: JsonReader): AuthError {
    var message: String? = null
    var errors: Map<String, String>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> message = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("message",
            "message", reader)
        1 -> errors = mapOfStringStringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("errors", "errors", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return AuthError(
        message = message ?: throw Util.missingProperty("message", "message", reader),
        errors = errors ?: throw Util.missingProperty("errors", "errors", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: AuthError?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("message")
    stringAdapter.toJson(writer, value_.message)
    writer.name("errors")
    mapOfStringStringAdapter.toJson(writer, value_.errors)
    writer.endObject()
  }
}
