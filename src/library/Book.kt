package library

open class Book(var currentPage: Int = 0) {

    open fun readPage() = ++currentPage
}