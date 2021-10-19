import java.io.File

fun main(){
        // This is the homework number 1


    val city = mutableListOf("Riyadh","Jeddah", "Mekkah")
    city.addAll(listOf("Abha", "Maddina"))
    city[city.size-1] = "Dammam"

    city.forEachIndexed{index, data ->     // for each to print the entire list
        println("$index - $data ")

    }
    println("\n -----------------------------------------------") // to separate the homework results in the consul

    //---------------------------------------------------------------//
                    // This is homework number 2


    val integerNo = mutableListOf(10, 13, 6, 7, 9)
    integerNo[2] = 12
    println(integerNo)

    for (item in integerNo){
        if (item == 12) {
            integerNo.removeAt(integerNo.indexOf(item))         //remove the specified element
            break
        }
    }
    println(integerNo)
    println("\n -----------------------------------------------")

// ------------------------------------------------------------------------------------ //
                        // optional homework part 1 //

    // first I create a file named phone brand under data directory
    println(File("data/phone brand.txt").readText())        // print the file named phone brand
    println("\n -----------------------------------------------")

//--------------------------------------------------------------------------------------//
                       // optional homework part 2 //

    val listOfNumbers = listOf(12, 6, 34, 8, 9, 3, 7, 20, 0, 23)
    var index = 0       // initialize the index

    var number1 = listOfNumbers[index]          // this variable will take the first element
    var number2 = listOfNumbers[index+1]         // this variable will take the first element

    // this next code is to compare first element in the list with the next element and update the results
    for (item in listOfNumbers){
        if (index < 8){
            index++
            if (number1 >= number2){
                number2 = listOfNumbers[index+1]

            }else{
                number1 = number2
                number2 = listOfNumbers[index+1]

            }

        }else{
            break
        }

    }
    println("The maximum number = $number1")


}