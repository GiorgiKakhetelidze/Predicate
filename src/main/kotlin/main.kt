import java.lang.Exception
import java.util.function.Predicate

fun main() {

}

class NotSuchElementException(message: String) : Exception(message) {

}

fun <T> MutableList<T>.find(predicate: Predicate<T>): T? {
    for (element in this) {
        if (predicate.test(element))
            return element
    }
    return null
}

fun <T> MutableList<T>.first(predicate: Predicate<T>): T? {
    for (element in this) {
        if (predicate.test(element))
            return element
    }
    throw NotSuchElementException("Predicate not match any element")
}

fun <T> MutableList<T>.foreEach(logic: (T) -> Boolean) {
    for (element in this)
        logic(element)
}

fun <T> MutableList<T>.all(predicate: Predicate<T>): Boolean {
    for (element in this) {
        if (!predicate.test(element))
            return false
    }

    return true
}