class Book(var title: String, var author: String, var publicationYear: Int, ) :
    LibraryItem {
    private var isCheckedOut: Boolean = false
    override fun checkOut(): Boolean {
        if(!isCheckedOut){
            isCheckedOut = true
            return true
        }else{
            return false
        }
    }


    override fun returnItem(): Boolean {
        isCheckedOut = false
        return true

    }

    override fun isAvailable(): Boolean {
        return isCheckedOut
    }

    fun bookStatus () {
        println("Book name : $title , author : $author , publication year : $publicationYear ")
        println("is book checked out ? ${checkOut()} \n is book returned ? ${returnItem()}  \n is book available ? ${isAvailable()}")
    }

}
