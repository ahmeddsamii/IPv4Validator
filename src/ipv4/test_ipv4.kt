gipackage ipv4

fun main() {

    testIpV4(
        name = "Given an empty string when call isIpCorrect then should return false",
        result = isIpCorrect(""),
        expectedResult = false
    )


    testIpV4(
        name = "Given a valid ip address when call isIpCorrect then should return true",
        result = isIpCorrect("192.168.1.1"),
        expectedResult = true
    )


    testIpV4(
        name = "Given an ip address with three segments when call isIpCorrect then should return false",
        result = isIpCorrect("192.168.1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip with five segments when call isIpCorrect then should return false",
        result = isIpCorrect("192.168.1.1.1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip which end with dot when call isIpCorrect then should return false",
        result = isIpCorrect("192.168.1."),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip which start with dot when call isIpCorrect then should return false",
        result = isIpCorrect(".192.168.1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given ip which has two dots in sequence when call isIpCorrect then should return false",
        result = isIpCorrect("192..168.1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip which has spaces instead of dots when call isIpCorrect then should return false",
        result = isIpCorrect("192 168 1 1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip has a number which out of range 0-255 when call isIpCorrect then should return false",
        result = isIpCorrect("256.168.1.1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip has a number which has a leading zero when call isIpCorrect then should return false",
        result = isIpCorrect("01.168.1.1"),
        expectedResult = false
    )

    testIpV4(
        name = "Given an ip has 0 in any segments when call isIpCorrect then should return true",
        result = isIpCorrect("0.168.1.2"),
        expectedResult = true
    )


    testIpV4(
        name = "Given an ip which has letters instead of numbers when call isIpCorrect then should return false",
        result = isIpCorrect("a.b.c.d"),
        expectedResult = false
    )


}

fun testIpV4(name:String, result:Boolean, expectedResult:Boolean){
    if (result == expectedResult){
        println("Success - $name")
    }else{
        println("Failed - $name")
    }
}