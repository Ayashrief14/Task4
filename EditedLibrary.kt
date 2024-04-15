class Library (var booksOfLibrary : MutableList<Book>){
    fun removeBook (book: Book){
        booksOfLibrary.remove(book)
    }
    fun addBook (book: Book){
        booksOfLibrary.add(book)
    }
    fun checkOutBook (patron: Patron,book: Book):Boolean{
        if (!book.isAvailable()){
           return false
        }else{
            patron.checkedOutBooks.add(book)
            book.checkOut()
            return true
        }
        
    }
}