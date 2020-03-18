package library

class EBook(var wordCount: Int = 0): Book() {

    override fun readPage(): Int {
        wordCount = wordCount + 250
        return wordCount
    }
}