import types.interfaces.IMusic

class Single(val aSide: Song, val bSide: Song): IMusic {

    override fun getAllSongs(): List<Song> {
        return listOf(aSide, bSide)

//        val newList = mutableListOf<Song>()
//
//        newList.add(aSide)
//        newList.add(bSide)
//        return newList.toList()
    }

    override fun getPlayingTime(): Double {
        return aSide.playingTime + bSide.playingTime
    }

}