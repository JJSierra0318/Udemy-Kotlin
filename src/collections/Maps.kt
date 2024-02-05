package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter", 24), "Roger" to 42)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToPeople = mutableMapOf(
        "Germany" to 80_000_000,
        "USA" to 300_000_000
    )
    countryToPeople.putIfAbsent("Australia", 23_000_000)

    println(countryToPeople.contains("Australia"))
    println(countryToPeople.containsValue(20_000_000))

    println(countryToPeople["Germany"])
}