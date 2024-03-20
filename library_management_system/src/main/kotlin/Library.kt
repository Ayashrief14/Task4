class Library (var booksOfLibrary : MutableList<Book>){
    fun removeBook (book: Book){
        booksOfLibrary.remove(book)
    }
    fun addBook (book: Book){
        booksOfLibrary.add(book)
    }
    fun checkOutBook (patron: Patron,book: Book):Boolean{
        patron.checkedOutBooks.add(book)
        book.checkOut()
        return true

    }
}