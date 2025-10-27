import types.interfaces.IMusic

class RecordPlayer {
    fun play(musicObject: IMusic) {
        val songs = musicObject.getAllSongs()
        val getPlayTime = musicObject.getPlayingTime()

        println("Playing ${songs.size} songs for $getPlayTime minutes")
    }
}