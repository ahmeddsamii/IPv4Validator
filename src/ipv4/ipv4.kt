package ipv4


fun isIpCorrect(ip:String):Boolean{
    val parts = ip.split(".")
    if (parts.size != 4) return false

    parts.forEach { part ->

        if (part.isBlank()) return false
        if (part.length > 1 && part.startsWith("0")) return false
        val number = part.toIntOrNull()
        if (number == null) {
            return false
        }else{
            if (number < 0 || number > 255) return false
        }
    }
    return true
}