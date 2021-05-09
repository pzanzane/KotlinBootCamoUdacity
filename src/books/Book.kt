package books

open class Book(title:String, author:String) {

    private var currentPage = 0;
    open fun readPage() = currentPage.inc()
}

class EBook(title:String,
            author:String,
            format:String = "text")
            :Book(title, author) {
    private var wordCount = 0;
    override fun readPage() = wordCount.plus(250)
}