package ipv4


fun isIpCorrect(ip:String):Boolean{
    // Checking if the number of parts is 4 or not
    val parts = ip.split(".")
    if (parts.size != 4) return false

    parts.forEach { part ->

        // Ensure that each segment is not blank
        if (part.isBlank()) return false


        // Checking if the number has leading zero or not
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