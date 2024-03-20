class Patron (var name : String,var checkedOutBooks : MutableList<Book>){
    fun patronStatus(){
        println("Patron name : $name , books responsible for ${checkedOutBooks.map{ it.title}.distinct()} ")
    }
}