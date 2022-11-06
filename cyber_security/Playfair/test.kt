fun main(){
    var a = Song("Nơi này có anh","Sơn Tùng M-TP","2018",20000)
}

class Song(val title : String, val artist : String,val yearPublished : String,val playCount : Int){
     val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription (){
        "$title, performed by $artist, was released in $[yearPublished.\n$isPopular"
    }
}