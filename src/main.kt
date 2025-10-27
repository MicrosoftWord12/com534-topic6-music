fun main() {
    val listOfSongs = mutableListOf<Song>()
    listOfSongs.add(Song("One More Time", "Imagine Dragons", 2.5))
    listOfSongs.add(Song("Song", "Michael Jackson", 5.0))

    val singles = mutableListOf<Single>()
    val album = Album(listOfSongs)
    val recordPlayer = RecordPlayer()



    for (song in album.getAllSongs()) {
        singles.add(Single(song, song))
    }

    for (single in singles) {
        println(single.getPlayingTime())
    }

    recordPlayer.play(album)
    recordPlayer.play(Single(Song("Song", "Michael Jackson", 5.0), Song("Song", "Imagine Dragons", 2.5)))
}