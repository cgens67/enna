/*
 * 恩纳 (Enna) Project Original (2026)
 * Chartreux Westia (github.com/恩纳 (Enna))
 * Licensed Under GPL-3.0 | see git history for contributors
 * Don't remove this copyright holder!
 */




package com.enna.music.lite.innertube.pages

import com.enna.music.lite.innertube.models.SongItem

data class PlaylistContinuationPage(
    val songs: List<SongItem>,
    val continuation: String?,
)
