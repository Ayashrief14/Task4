fun main() {
    val book1 = Book("New Day", "Ismail Ahmed", 2020)

    val book2 = Book("flowers", "Mona Ahmed", 2019)

    val book3 = Book("success", "Abdallah", 2021)


    val Townlibrary = Library(mutableListOf(book1, book2, book3))


    val patron1 = Patron("Ahmed Mohammed", mutableListOf(book1, book2))

    val patron2 = Patron("Samir Ali", mutableListOf(book3))


    Townlibrary.checkOutBook(patron1, book1)

    Townlibrary.checkOutBook(patron1, book2)

    Townlibrary.checkOutBook(patron2, book3)

    println("Our Books : ")
    book1.bookStatus()
    println("-".repeat(50))
    book2.bookStatus()
    println("-".repeat(50))

    book3.bookStatus()
    println("-".repeat(50))

    println("-".repeat(50))
    println("OUr patrons : ")
    patron1.patronStatus()
    println("-".repeat(50))
    patron2.patronStatus()


}