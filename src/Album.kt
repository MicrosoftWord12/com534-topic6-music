import types.interfaces.IMusic

class Album(val songs: List<Song>): IMusic {

    fun filterSongs(author: String): List<Song> {
        return songs.filter { it.artist == author}
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }

    override fun getPlayingTime(): Double {
        var totalPlayingTime = 0.0

        for (song in songs) {
            totalPlayingTime += song.playingTime
        }

        return totalPlayingTime
    }


}