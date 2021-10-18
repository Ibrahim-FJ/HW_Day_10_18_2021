fun main(){
        // This is the first homework
    val city = mutableListOf("Riyadh","Jeddah", "Mekkah")
    city.addAll(listOf("Abha", "Maddina"))
    city[city.size-1] = "Dammam"

    city.forEachIndexed{index, data ->
        println("$index - $data ")

    }

    //---------------------------------------------------------------//

    // This is homework number 2
    val integerNo = mutableListOf(10, 13, 6, 7, 9)
    integerNo[2] = 12
    println(integerNo)

    for (item in integerNo){
        if (item == 12) {
            integerNo.removeAt(integerNo.indexOf(item))
            break
        }
    }
    println(integerNo)

}