fun main(){
    var str = readLine()!!.split(" ")
    var str1 = mutableListOf<Double>()
    for (i in str) {str1.add(i.toDouble())}
    println(med(str1).toString().replace(",","").replace('[', ' ').replace(']',' ').trim())
}

fun med(si:List<Double>):List<Double> {
    var so = mutableListOf(0.0, 0.0)

    si.sorted()

    var sum: Double = 0.0
    for (i in si) sum +=i
    so[0] = sum/si.size

    if (si.size % 2 == 0) {
        so[1] = (si[si.size/2-1]+si[si.size/2])/2
    }
    else {
        so[1] = si[si.size/2]
    }
    return so
}

/** * Необходимо разработать программу для поиска среднего и медианного значений списка действительных
 * чисел со знаком, подаваемого на вход программы. Медианным значением считается такое число выборки,
 * что ровно половина из элементов выборки больше него, а другая половина меньше него.
 * Если в выборке чётное число элементов, медиана вычисляется как полусумма двух центральных элементов в упорядоченной выборке.
 * Вход: список с n элементами.
 * Выход: два значения (среднее, медиана)
 **/