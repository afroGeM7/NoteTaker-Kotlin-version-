package com.gemmausiku.notetaker

class ChapterInfo (val chapterId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

class NoteInfo (var chapter: ChapterInfo, var title: String, var text: String)