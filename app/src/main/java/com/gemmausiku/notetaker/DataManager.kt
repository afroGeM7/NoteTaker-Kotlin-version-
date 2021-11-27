package com.gemmausiku.notetaker

class DataManager {
    val chapters = HashMap<String, ChapterInfo>()
    val notes = ArrayList<NoteInfo>()

    init {   //initializer block
        initializeChapters()
    }

    private fun initializeChapters() {
        var chapter = ChapterInfo("chapter_1", "Chapter 1: INTRODUCTION")
        chapters.set(chapter.chapterId,chapter)

        chapter = ChapterInfo("chapter_2", "Chapter 2: LITERATURE REVIEW")
        chapters.set(chapter.chapterId,chapter)

        chapter = ChapterInfo("chapter_3", "Chapter 3: METHODOLOGY")
        chapters.set(chapter.chapterId,chapter)

        chapter = ChapterInfo("chapter_4", "Chapter 4: FINDINGS")
        chapters.set(chapter.chapterId,chapter)

        chapter = ChapterInfo("chapter_5", "Chapter 5: DISCUSSION")
        chapters.set(chapter.chapterId,chapter)

    }
}