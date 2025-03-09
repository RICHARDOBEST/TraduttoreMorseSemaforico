package com.example.traduttore

class TraduttoreMorseSemaforico {
    private val morse = mapOf(
        "0" to "-----", "1" to ".----", "2" to "..---", "3" to "...--", "4" to "....-",
        "5" to ".....", "6" to "-....", "7" to "--...", "8" to "---..", "9" to "----.",
        "a" to ".-", "b" to "-...", "c" to "-.-.", "d" to "-..", "e" to ".",
        "f" to "..-.", "g" to "--.", "h" to "....", "i" to "..", "j" to ".---",
        "k" to "-.-", "l" to ".-..", "m" to "--", "n" to "-.", "o" to "---",
        "p" to ".--.", "q" to "--.-", "r" to ".-.", "s" to "...", "t" to "-",
        "u" to "..-", "v" to "...-", "w" to ".--", "x" to "-..-", "y" to "-.--",
        "z" to "--..", " " to ""
    )

    private val numeri = "\u2196\u2198/"
    private val semaforico = mapOf(
        "a" to "\u2199", "b" to "\u2190", "c" to "\u2196", "d" to "\u2191", "e" to "\u2197",
        "f" to "\u2192", "g" to "\u2198", "h" to "\u2199\u2190", "i" to "\u2199\u2196",
        "j" to "\u2191\u2192", "k" to "\u2199\u2191", "l" to "\u2199\u2197", "m" to "\u2199\u2192",
        "n" to "\u2199\u2198", "o" to "\u2190\u2196", "p" to "\u2190\u2191", "q" to "\u2190\u2197",
        "r" to "\u2190\u2192", "s" to "\u2190\u2198", "t" to "\u2196\u2191", "u" to "\u2196\u2197",
        "v" to "\u2191\u2198", "w" to "\u2197\u2192", "x" to "\u2197\u2198", "y" to "\u2196\u2192",
        "z" to "\u2192\u2198", " " to ""
    ).toMutableMap().apply {
        put("0", numeri + get("j"))
        put("1", numeri + get("a"))
        put("2", numeri + get("b"))
        put("3", numeri + get("c"))
        put("4", numeri + get("d"))
        put("5", numeri + get("e"))
        put("6", numeri + get("f"))
        put("7", numeri + get("g"))
        put("8", numeri + get("h"))
        put("9", numeri + get("i"))
    }

    fun traduciMorse(messaggio: String): String {
        return messaggio.lowercase().map { morse[it.toString()] ?: "?" }.joinToString("/") + "//"
    }

    fun traduciSemaforico(messaggio: String): String {
        return messaggio.lowercase().map { semaforico[it.toString()] ?: "?" }.joinToString("/") + "//"
    }
}
