fun main(args: Array<String>) {


    /**
     * LABEL
     */

    foreach@ for (i in 0..100) {
        for (j in 0..100) {
            if (i == 10 && j == 10) break@foreach
        }
    }

    var ints = intArrayOf(1, 2, 3)
    print("START ")
    ints.forEach list@ {
        if (it == 3) return@list
        print("$it ")
    }
    print("END")

    println()

    print("START ")
    ints.forEach {
        if (it == 3) return@forEach
        print("$it ")
    }
    print("END")


}