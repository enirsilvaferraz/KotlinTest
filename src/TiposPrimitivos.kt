

fun main(args: Array<String>) {

    /* Primitivos */

    // Double (64)
    val double1 = 1.5
    val double2 = 123.5e10
    val double3: Double = 1.5

    println(message = "double1 is Double? ${double1 is Double}" )
    println(message = "double2 is Double? ${double2 is Double}" )
    println(message = "double3 is Double? ${double3 is Double}" )

    // Float (32)
    val float1 = 1.5F
    val float2 = 123.5e-10f
    val float3: Float = 1.5f
    val float4 = 1e2f

    println(message = "float1 is Float? ${float1 is Float}" )
    println(message = "float3 is Float? ${float2 is Float}" )
    println(message = "float3 is Float? ${float3 is Float}" )
    println(message = "float4 == 100 ${float4 == 100f}" )

    // Long (65)
    val long1 = 1L
    val long2: Long = 15L

    println(message = "long1 is Long? ${long1 is Long}" )
    println(message = "long2 is Long? ${long2 is Long}" )

    // Int (32)
    val int1 = 1
    val int2: Int = 1
    val int3: Int = 0x0F // Hexadecimals
    val int4: Int = 0b00001011 // Binaries

    println(message = "int1 is Int? ${int1 is Int}" )
    println(message = "int2 is Int? ${int2 is Int}" )
    println(message = "int3 is Int? ${int3 is Int}" )
    println(message = "int4 is Int? ${int4 is Int}" )

    // Short (16)
    val short1: Short = 1

    println(message = "short1 is Short? ${short1 is Short}" )

    // Byte (8)
    val byte: Byte = 1

    println(message = "byte is Byte? ${byte is Byte}" )

    // Underscores
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

    val var1 = byte.toByte()
    val var2 = byte.toShort()
    val var3 = byte.toInt()
    val var4 = byte.toLong()
    val var5 = byte.toFloat()
    val var6 = byte.toDouble()
    val var7 = byte.toChar()

    val l = 1L + 3 // Long + Int => Long

    // Char (16)
    val char1 = 'c'
    val char2: Char = 'c'
    val unicode = '\u0000'

    println("char1 is Char? ${char1 is Char}")
    println("char2 is Char? ${char2 is Char}")
    println("unicode is Char? ${unicode is Char}")

    println("\t \b \n \r \' \" \\ \$")

    // Buleanos
    val bool1 = true
    val bool2: Boolean = false

    println("bool1 is Boolean? ${bool1 is Boolean}")
    println("bool2 is Boolean? ${bool2 is Boolean}")


    val array = arrayOf("SP", "RJ" )
    val mix = arrayOf (1, "String", 3)
    val ints = intArrayOf(1, 2, 3)
    val bools = booleanArrayOf(true, false, false)
    val nulls = arrayOfNulls<Int>(5)
    val empty = emptyArray<Char>()
    val asc = Array(5, { i -> (i * i).toString() })

    for (item in asc) print("$item, ")

    array[0] = "MG"


    // Strings
    val string1 = "String"
    val string2: String = "String"

    val string3 = " String\nString " // Prints: String\nString
    val string4 = """ String\nString """.trimMargin() // Prints: String\nString

    val string5 = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()

    println(string3)
    println(string4)
    println(string5)

    val int = 10
    val template = "int = $int" // evaluates to "int = 10"

    println("template: $template")

    val string6 = "abc"
    println("$string6.length is ${string6.length}") // evaluates to "abc.length is 3"

    val price1 = "R\$10,00"
    val price2 = """${'$'}9.99"""

    println(price1)
    println(price2)






    val a: Int = 10000
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    println("a === a ${a === a}") // Prints 'true'
    println("boxedA === anotherBoxedA ${boxedA === anotherBoxedA}") // !!!Prints 'false'!!!

    println("a == a ${a == a}") // Prints 'true'
    println("boxedA == anotherBoxedA ${boxedA == anotherBoxedA}") // !!!Prints 'true'!!!
}