package ipv4

fun main() {

    //region Empty and Basic Validation Tests
    testIpV4(
        name = "Given an empty string when call testIpValidity then should return false",
        result = testIpAddressValidity(""),
        expectedResult = false
    )


    testIpV4(
        name = "Given a valid ip address when call testIpValidity then should return true",
        result = testIpAddressValidity("192.168.1.1"),
        expectedResult = true
    )
    //endregion


    //region Segment Count Tests
    testIpV4(
        name = "Given an ip address with three segments when call testIpValidity then should return false",
        result = testIpAddressValidity("192.168.1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip with five segments when call testIpValidity then should return false",
        result = testIpAddressValidity("192.168.1.1.1"),
        expectedResult = false
    )
    //endregion


    //region Dot Placement Tests
    testIpV4(
        name = "Given an ip which end with dot when call testIpValidity then should return false",
        result = testIpAddressValidity("192.168.1."),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip which start with dot when call testIpValidity then should return false",
        result = testIpAddressValidity(".192.168.1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given ip which has two dots in sequence when call testIpValidity then should return false",
        result = testIpAddressValidity("192..168.1"),
        expectedResult = false
    )
    //endregion


    //region Format Tests
    testIpV4(
        name = "Given an ip which has spaces instead of dots when call testIpValidity then should return false",
        result = testIpAddressValidity("192 168 1 1"),
        expectedResult = false
    )
    //endregion


    //region Numeric Value Tests
    testIpV4(
        name = "Given an ip has a number which out of range 0-255 when call testIpValidity then should return false",
        result = testIpAddressValidity("256.168.1.1"),
        expectedResult = false
    )


    testIpV4(
        name = "Given an ip has a number which has a leading zero when call testIpValidity then should return false",
        result = testIpAddressValidity("01.168.1.1"),
        expectedResult = false
    )

    testIpV4(
        name = "Given an ip has 0 in any segments when call testIpValidity then should return true",
        result = testIpAddressValidity("0.168.1.2"),
        expectedResult = true
    )
    //endregion


    //region Character Type Tests
    testIpV4(
        name = "Given an ip which has letters instead of numbers when call testIpValidity then should return false",
        result = testIpAddressValidity("a.b.c.d"),
        expectedResult = false
    )
    //endregion


}

fun testIpV4(name:String, result:Boolean, expectedResult:Boolean){
    if (result == expectedResult){
        println("Success - $name")
    }else{
        println("Failed - $name")
    }
}