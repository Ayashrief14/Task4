class Book(var title: String, var author: String, var publicationYear: Int, ) :
    LibraryItem {
    private var isCheckedOut: Boolean = false
    override fun checkOut(): Boolean {
        isCheckedOut = true
        return true
    }


    override fun returnItem(): Boolean {
        return isCheckedOut

    }

    override fun isAvailable(): Boolean {
        return returnItem()
    }

    fun bookStatus () {
        println("Book name : $title , author : $author , publication year : $publicationYear ")
        println("is book checked out ? ${checkOut()} \n is book returned ? ${returnItem()}  \n is book available ? ${isAvailable()}")
    }

}