package com.android.core.util

import android.util.Log
import java.nio.charset.StandardCharsets
import java.security.InvalidAlgorithmParameterException
import java.security.InvalidKeyException
import java.security.NoSuchAlgorithmException
import java.security.spec.AlgorithmParameterSpec
import javax.crypto.BadPaddingException
import javax.crypto.Cipher
import javax.crypto.IllegalBlockSizeException
import javax.crypto.NoSuchPaddingException
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec
import kotlin.experimental.and

class Encryption {
    companion object {

        fun encrypt(textBytes: ByteArray?): String {
            val ivSpec: AlgorithmParameterSpec = IvParameterSpec(
                "drowssapdrowssap".toByteArray(
                    StandardCharsets.UTF_8
                )
            )
            val newKey = SecretKeySpec(
                "passwordpasswordpasswordpassword".toByteArray(
                    StandardCharsets.UTF_8
                ), "AES"
            )
            var cipher: Cipher? = null
            try {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
                cipher.init(Cipher.ENCRYPT_MODE, newKey, ivSpec)
                Log.d("encrypted_data", bytesToHex(cipher.doFinal(textBytes)))
                return bytesToHex(cipher.doFinal(textBytes))
            } catch (e: BadPaddingException) {
                e.printStackTrace()
            } catch (e: IllegalBlockSizeException) {
                e.printStackTrace()
            } catch (e: NoSuchAlgorithmException) {
                e.printStackTrace()
            } catch (e: InvalidKeyException) {
                e.printStackTrace()
            } catch (e: InvalidAlgorithmParameterException) {
                e.printStackTrace()
            } catch (e: NoSuchPaddingException) {
                e.printStackTrace()
            }
            return ""
        }

        private val HEX_ARRAY = "0123456789ABCDEF".toCharArray()
        fun bytesToHex(bytes: ByteArray): String {
            val hexChars = CharArray(bytes.size * 2)
            for (j in bytes.indices) {
                val v: Int = (bytes[j] and 0xFF.toByte()).toInt()
                hexChars[j * 2] = HEX_ARRAY[v ushr 4]
                hexChars[j * 2 + 1] = HEX_ARRAY[v and 0x0F]
            }
            return String(hexChars)
        }

    }
}