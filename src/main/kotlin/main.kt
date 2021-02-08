import java.lang.Exception

fun main() {

}

class NotSuchElementException(message: String) : Exception(message) {

}

fun <T> MutableList<T>.find(predicate: (T) -> Boolean): T? {
    for (element in this) {
        if (predicate(element))
            return element
    }
    return null
}

fun <T> MutableList<T>.first(predicate: (T) -> Boolean): T {
    for (element in this) {
        if (predicate(element))
            return element
    }
    throw NotSuchElementException("Predicate not match any element")
}

fun <T> MutableList<T>.foreEach(logic: (T) -> Unit) {
    for (element in this)
        logic(element)
}

fun <T> MutableList<T>.all(predicate: (T) -> Boolean): Boolean {
    for (element in this) {
        if (!predicate(element))
            return false
    }

    return true
}