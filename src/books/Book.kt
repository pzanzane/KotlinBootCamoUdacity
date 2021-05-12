package books

import java.util.*

const val MAXIMUM_BORROW = 10
open class Book(val title:String, val author:String, val year: Int, var pages: Int) {

    companion object {
        const val BASE_URL = "https//www.library.com/%s.html"
    }

    private var currentPage = 0;
    open fun readPage() = currentPage.inc()

    fun titleAuthor(): Pair<String, String> {
        return title to author
    }

    fun titleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(alreadyBorrowed: Int):Boolean = alreadyBorrowed < MAXIMUM_BORROW

    fun printUrl() {
        println(kotlin.String.format(BASE_URL, title))
    }
}

class EBook(title:String,
            author:String,
            year:Int,
            pages: Int,
            format:String = "text")
            :Book(title, author, year, pages) {
    private var wordCount = 0;
    override fun readPage() = wordCount.plus(250)
}

object Constats {
    const val BASE_URL = "https//www.library.com/%s.html"
}

val Book.weight : Float
    get() = pages * 1.5f

fun Book.tornPages(numberOfPages: Int) {  pages = pages.minus(numberOfPages) }

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(18))
    }
}

fun main(arr: Array<String>) {
    val book = Book("Effective Java", "Joshua Bloch", 2005, 213)
    val (title, author, year) = book.titleAuthorYear()
    println("Here is your book $title written by $author in $year")
    book.printUrl()

    wightPractice()

}

fun wightPractice() {
    val bookForPuppy = Book("Title", "Author", 1988, 210)
    val puppy = Puppy()

    while (bookForPuppy.pages > 0) {
        puppy.playWithBook(bookForPuppy)
        println("Book weight ${bookForPuppy.weight}")
    }
}