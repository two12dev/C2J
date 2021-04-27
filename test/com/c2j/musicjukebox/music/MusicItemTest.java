package com.c2j.musicjukebox.music;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicItemTest {

    MusicItem basicMusicItemAllString = null;
    @Before
    public void setUp() {
        basicMusicItemAllString =
                new MusicItem("SongTitle1", "Artist1",
                        "pop", "asia",
                        "1990-01-03", "album1");
    }

    @Test
    public void testGetTitleSuccess() {
        String expectedTitle = "SongTitle1";
        String actualTitle = basicMusicItemAllString.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void setTitle() {
    }

    @Test
    public void getArtist() {
    }

    @Test
    public void setArtist() {
    }

    @Test
    public void getYear() {
    }

    @Test
    public void getMusicGenre() {
    }

    @Test
    public void setMusicGenre() {
    }

    @Test
    public void testSetMusicGenre() {
    }

    @Test
    public void getMusicRegions() {
    }

    @Test
    public void setMusicRegions() {
    }

    @Test
    public void testSetMusicRegions() {
    }

    @Test
    public void setYear() {
    }

    @Test
    public void testSetYear() {
    }

    @Test
    public void getAlbum() {
    }

    @Test
    public void setAlbum() {
    }

    @Test
    public void getDefaultPrice() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void compareTo() {
    }

    @Test
    public void testEquals() {
    }
}