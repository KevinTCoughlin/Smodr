package com.kevintcoughlin.smodr.feature

import com.kevintcoughlin.smodr.feature.repos.EpisodeRepo
import org.junit.Assert
import org.junit.Test


class EpisodeRepoUnitTest {
    @Test
    fun get_returnsEpisode() {
        val repo = EpisodeRepo()
        val episode = repo.get("foo")
        Assert.assertNotNull(episode)
    }

    @Test
    fun fetch_returnsEpisodes() {
        val repo = EpisodeRepo()
        val episodes = repo.fetch()
        Assert.assertNotNull(episodes)
    }
}