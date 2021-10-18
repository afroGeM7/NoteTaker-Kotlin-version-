package com.gemmausiku.notekeeper

class DataManager {
    val chapters = HashMap<String, ChapterInfo>() //properties
    val notes = ArrayList<NoteInfo>() //properties

    init{
        initializeChapters() // code within the initializer block will automatically run
                            // anytime an instance of the Data Manager is created

    }


    private fun initializeChapters () {
        var chapter = ChapterInfo("chapter_1" , "Chapter 1: INTRODUCTION")
        chapters.set(chapter.chapterId, chapter)

        chapter = ChapterInfo(chapterId = "chapter_2" , title = "Chapter 2: LITERATURE REVIEW")
        chapters.set(chapter.chapterId, chapter)

        chapter = ChapterInfo(chapterId = "chapter_3" , title = "Chapter 3: METHODOLOGY")
        chapters.set(chapter.chapterId, chapter)

        chapter = ChapterInfo("chapter_4" , "Chapter 4: FINDINGS")
        chapters.set(chapter.chapterId, chapter)

        chapter = ChapterInfo("chapter_5" , "Chapter 5: DISCUSSION")
        chapters.set(chapter.chapterId, chapter)


    }



}