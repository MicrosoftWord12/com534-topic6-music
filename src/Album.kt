class Album(val songs: List<Song>) {

    fun filterSongs(author: String): List<Song> {
        return songs.filter { it.artist == author}
    }
}