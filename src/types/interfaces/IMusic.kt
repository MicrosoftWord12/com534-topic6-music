package types.interfaces

import Song

interface IMusic {

    fun getAllSongs(): List<Song>
    fun getPlayingTime(): Double

}