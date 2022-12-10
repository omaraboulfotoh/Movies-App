package com.android.network.services


import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.reflect.TypeToken
import com.android.model.OptionItem
import com.android.model.OptionsList
import java.lang.reflect.Type

class OptionsListDeserializer : JsonDeserializer<OptionsList> {

    override fun deserialize(
        json: JsonElement,
        typeOfT: Type?,
        ctx: JsonDeserializationContext
    ): OptionsList {
        return when {
            json.isJsonArray -> {
                val listOfOptions =
                    ctx.deserialize<List<OptionItem>>(json, LIST_TYPE)
                OptionsList(list = listOfOptions)
            }
            json.isJsonObject -> {
                val listOfOptions =
                    ctx.deserialize<HashMap<String, List<OptionItem>>>(json, MAP_TYPE)
                OptionsList(map = listOfOptions)
            }
            else -> {
                throw RuntimeException("Unexpected JSON type: " + json.asString)
            }
        }
    }

    companion object {
        private val LIST_TYPE = object : TypeToken<List<OptionItem>>() {}.type
        private val MAP_TYPE = object : TypeToken<HashMap<String, List<OptionItem>>>() {}.type
    }
}
