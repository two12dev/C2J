package com.c2j.musicjukebox.music;

import java.util.*;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MusicCollection implements MusicUtilities {

    private static Collection<MusicItem> musicItemCollections = new ArrayList<>();
    private static MusicCollection musicCollection = null;
    private static Map<MusicItem, Integer> PLAYED_MUSIC_HISTORY = new HashMap<>();

    static {
        musicItemCollections.add(new MusicItem("Goyard", "Keith Ape",
                MusicGenre.RAP, MusicRegions.ASIA, "2015", "MixtAPE #1"));
        musicItemCollections.add(new MusicItem("Main Ka Karoon Ram", "Lata Mangeshkar",
                MusicGenre.CLASSICAL, MusicRegions.ASIA, "1995", "In A Different Mood"));
        musicItemCollections.add(new MusicItem("Silent Jealousy", "X Japan",
                MusicGenre.ROCK, MusicRegions.ASIA, "2002", "Trance X"));
        musicItemCollections.add(new MusicItem("Acoustic Chicken", "Furusawa Ryojiro Quartet",
                MusicGenre.BLUES, MusicRegions.ASIA, "1976", "ou Wanna Rain"));
        musicItemCollections.add(new MusicItem("WISDOMINANT", "TRI4TH",
                MusicGenre.JAZZ, MusicRegions.ASIA, "2010", "Tri4th"));
        musicItemCollections.add(new MusicItem("Boom Boom Boys", "Kumi Koda",
                MusicGenre.POP, MusicRegions.ASIA, "2012", "Japonesque"));
        musicItemCollections.add(new MusicItem("Leave Me Alone", "Amaarae",
                MusicGenre.RAP, MusicRegions.AFRICA, "2020", "The Angel You Don't Know"));
        musicItemCollections.add(new MusicItem("Willow Song", "Miriam Makeba",
                MusicGenre.CLASSICAL, MusicRegions.AFRICA, "1964", "The Voice Of Africa"));
        musicItemCollections.add(new MusicItem("Marathon Dance", "Allez Allez",
                MusicGenre.ROCK, MusicRegions.AFRICA, "1981", "African Queen"));
        musicItemCollections.add(new MusicItem("Bakoytereye", "Ali Farka Touré",
                MusicGenre.BLUES, MusicRegions.AFRICA, "1987", "Ali Farka Touré"));
        musicItemCollections.add(new MusicItem("He's Gone Away", "Hugh Masekela",
                MusicGenre.JAZZ, MusicRegions.AFRICA, "1962", "Trumpet Africaine"));
        musicItemCollections.add(new MusicItem("Ladysmith Black Mambazo", "Nomathemba",
                MusicGenre.POP, MusicRegions.AFRICA, "1973", "Amabutho"));
        musicItemCollections.add(new MusicItem("Black Widow", "Iggy Azalea",
                MusicGenre.RAP, MusicRegions.AUSTRALIA, "2014", "Reclassified"));
        musicItemCollections.add(new MusicItem("Sonatina", "Ross Edwards",
                MusicGenre.CLASSICAL, MusicRegions.AUSTRALIA, "1972", "His Master's Voice"));
        musicItemCollections.add(new MusicItem("Why Won't They Talk To Me?", "Tame Impala",
                MusicGenre.ROCK, MusicRegions.AUSTRALIA, "2012", "Lonerism"));
        musicItemCollections.add(new MusicItem("Pain And Misery", "The Teskey Brothers",
                MusicGenre.BLUES, MusicRegions.AUSTRALIA, "2017", "Half Mile Harvest"));
        musicItemCollections.add(new MusicItem("Too Marvellous For Words", "Katie Noonan",
                MusicGenre.JAZZ, MusicRegions.AUSTRALIA, "2004", "Two Of A Kind"));
        musicItemCollections.add(new MusicItem("Never Coming Back", "Amy Shark",
                MusicGenre.POP, MusicRegions.AUSTRALIA, "2018", "Love Monster"));
        musicItemCollections.add(new MusicItem("Hammer Em Down", "Blade Brown",
                MusicGenre.RAP, MusicRegions.EUROPE, "2010", "Bags And Boxes"));
        musicItemCollections.add(new MusicItem("Straighten Up And Fly Right", "Voces8",
                MusicGenre.CLASSICAL, MusicRegions.EUROPE, "2008", "Evensong"));
        musicItemCollections.add(new MusicItem("Sparks", "Coldplay",
                MusicGenre.ROCK, MusicRegions.EUROPE, "2000", "Parachutes"));
        musicItemCollections.add(new MusicItem("Been Here Before", "Christone “Kingfish” Ingram",
                MusicGenre.BLUES, MusicRegions.EUROPE, "2019", "Kingfish"));
        musicItemCollections.add(new MusicItem("Not That Kind Of Girl", "Mindi Abair & the Boneshakers",
                MusicGenre.JAZZ, MusicRegions.EUROPE, "2019", "The Eastwest Sessions"));
        musicItemCollections.add(new MusicItem("Aural Exam", "Anna Abreu",
                MusicGenre.POP, MusicRegions.EUROPE, "2009", "Just A Pretty Face"));
        musicItemCollections.add(new MusicItem("Hammer Em Down", "Blade Brown",
                MusicGenre.RAP, MusicRegions.NORTH_AMERICA, "2010", "Bags And Boxes"));
        musicItemCollections.add(new MusicItem("Night Of The Living Junkies", "Kendrick Lamar",
                MusicGenre.CLASSICAL, MusicRegions.NORTH_AMERICA, "2010", "Overly Dedicated"));
        musicItemCollections.add(new MusicItem("The Pieces That Fall To Earth", "Christopher Cerrone",
                MusicGenre.ROCK, MusicRegions.NORTH_AMERICA, "2019", "The Pieces That Fall To Earth"));
        musicItemCollections.add(new MusicItem("Holding On To You", "twenty one pilots",
                MusicGenre.BLUES, MusicRegions.NORTH_AMERICA, "2011", "Regional At Best"));
        musicItemCollections.add(new MusicItem("I Heard It Through The Grapevine", "Bettye LaVette",
                MusicGenre.JAZZ, MusicRegions.NORTH_AMERICA, "1982", "Tell Me A Lie"));
        musicItemCollections.add(new MusicItem("Song Of Her", "Charles Lloyd",
                MusicGenre.POP, MusicRegions.NORTH_AMERICA, "1967", "Forest Flower"));
        musicItemCollections.add(new MusicItem("Don't Start Now", "Dua Lipa",
                MusicGenre.POP, MusicRegions.CENTRAL_SOUTH_AMERICA, "2020", "Future Nostalgia"));
        musicItemCollections.add(new MusicItem("Perra Del Futuro", "Tomasa Del Real",
                MusicGenre.RAP, MusicRegions.CENTRAL_SOUTH_AMERICA, "2018", "Bellaca Del Año"));
        musicItemCollections.add(new MusicItem("Prelude In E Flat Minor Op. 16 No. 4", "Gabriela Montero",
                MusicGenre.CLASSICAL, MusicRegions.CENTRAL_SOUTH_AMERICA, "2005", "Piano Recital"));
        musicItemCollections.add(new MusicItem("Big Baby Blues", "Ritchie Valens",
                MusicGenre.ROCK, MusicRegions.CENTRAL_SOUTH_AMERICA, "1959", "Ritchie"));
        musicItemCollections.add(new MusicItem("You Got It Diz", "David Sanchez",
                MusicGenre.BLUES, MusicRegions.CENTRAL_SOUTH_AMERICA, "1994", "The Departure"));
        musicItemCollections.add(new MusicItem("Lejos De Tu Amor", "Shakira",
                MusicGenre.POP, MusicRegions.CENTRAL_SOUTH_AMERICA, "1991", "Magia"));

    }

    // private constructor
    private MusicCollection() {
    }

    public static MusicCollection createInstance() {
        if (musicCollection == null) {
            musicCollection = new MusicCollection();
        }
        return musicCollection;
    }

    public static Collection<MusicItem> getAllMusic() {
        return Collections.unmodifiableCollection(musicItemCollections);
    }
    // End of Temp Constructor

    @Override
    public Collection<MusicItem> findByTitle(String targetTitle) throws IllegalArgumentException {
        if (targetTitle == null || targetTitle.length() == 0) {
            throw new IllegalArgumentException("You must put target title as input.");
        }
        Collection<MusicItem> foundSongs = null;
        foundSongs = musicItemCollections.stream()
                .filter(item -> item.getTitle().equalsIgnoreCase(targetTitle))
                .collect(Collectors.toList());


        // best possible matching
        if (foundSongs == null || foundSongs.size() == 0) {
            foundSongs = musicItemCollections.stream()
                    .filter(item -> item.getTitle().toLowerCase()
                            .startsWith(targetTitle.toLowerCase()))
                    .filter(item -> item.getTitle().toUpperCase()
                            .startsWith(targetTitle.toUpperCase()))
                    .collect(Collectors.toList());
        }


        // second best possible matching
        // base logic for if there are no exact matching song
        if (foundSongs == null || foundSongs.size() == 0) {
            // check if target title
            // get every thing starts from partial
            for (int i = 0; i < targetTitle.length(); i++) {
                String firstCharactertargetTitle = targetTitle.substring(0, targetTitle.length() - i);
                // System.out.println(firstCharactertargetTitle);
                foundSongs = musicItemCollections.stream()
                        .filter(item -> item.getTitle().toLowerCase()
                                .startsWith(firstCharactertargetTitle.toLowerCase()))
                        .filter(item -> item.getTitle().toUpperCase()
                                .startsWith(firstCharactertargetTitle.toUpperCase()))
                        .collect(Collectors.toList());
            }
        }

        // if the size of the collection is still null or zero
        if (foundSongs == null || foundSongs.size() == 0) {
            throw new IllegalArgumentException("We cannot find any matching song or contains any character " +
                    "you had inserted in");
        }
        return foundSongs;
    }

    @Override
    public Collection<MusicItem> findByRegion(String targetByRegion) throws IllegalArgumentException {
        final String findByRegionNullEmptyExceptionMessage = "You must put region as input.\n" +
                "Supported Region: ASIA, AFRICA, AUSTRALIA, EUROPE, NORTH_AMERICA, CENTRAL_SOUTH_AMERICA.";
        final String findByRegionNotFound = "We cannot find any matching song or contains any character you had inserted in\n" +
                "Supported Region: ASIA, AFRICA, AUSTRALIA, EUROPE, NORTH_AMERICA, CENTRAL_SOUTH_AMERICA.";
        if (targetByRegion == null || targetByRegion.length() == 0) {
            throw new IllegalArgumentException(findByRegionNullEmptyExceptionMessage);
        }
        Collection<MusicItem> foundSongs = null;
        foundSongs = musicItemCollections.stream()
                .filter(item -> item.getMusicRegions().toString()
                        .equalsIgnoreCase(targetByRegion))
                .sorted()
                .collect(Collectors.toList());

        // best possible matching
        if (foundSongs == null || foundSongs.size() == 0) {
            foundSongs = musicItemCollections.stream()
                    .filter(item -> item.getMusicRegions().toString()
                            .toLowerCase()
                            .startsWith(targetByRegion.toLowerCase()))
                    .filter(item -> item.getMusicRegions().toString()
                            .toUpperCase()
                            .startsWith(targetByRegion.toUpperCase()))
                    .collect(Collectors.toList());
        }

        // second best possible matching
        if (foundSongs == null || foundSongs.size() == 0) {
            for (int i = 0; i < targetByRegion.length(); i++) {
                String firstCharactertargetTitle = targetByRegion.substring(0, targetByRegion.length() - i);
                foundSongs = musicItemCollections.stream()
                        .filter(item -> item.getMusicRegions().toString()
                                .toLowerCase()
                                .startsWith(firstCharactertargetTitle.toLowerCase()))
                        .filter(item -> item.getMusicRegions().toString()
                                .toUpperCase()
                                .startsWith(firstCharactertargetTitle.toUpperCase()))
                        .collect(Collectors.toList());
            }
        }

        // if the size of the collection is still null or zero
        if (foundSongs == null || foundSongs.size() == 0) {
            throw new IllegalArgumentException(findByRegionNotFound);
        }
        return foundSongs;
    }

    @Override
    public Collection<MusicItem> findByRegion(MusicRegions targetByRegion) throws IllegalArgumentException {
        final String findByRegionNullEmptyExceptionMessage = "You must put region as input.\n" +
                        "Supported Region: ASIA, AFRICA, AUSTRALIA, EUROPE, NORTH_AMERICA, CENTRAL_SOUTH_AMERICA.";
        final String findByRegionNotFound = "We cannot find any matching song or contains any character you had inserted in\n" +
                "Supported Region: ASIA, AFRICA, AUSTRALIA, EUROPE, NORTH_AMERICA, CENTRAL_SOUTH_AMERICA.";

        if (targetByRegion == null) {
            throw new IllegalArgumentException(findByRegionNullEmptyExceptionMessage);
        }

        Collection<MusicItem> foundSongs = null;
        foundSongs = musicItemCollections.stream()
                .filter(item -> item.getMusicRegions() == targetByRegion)
                .sorted()
                .collect(Collectors.toList());

        if (foundSongs == null || foundSongs.size() == 0) {
            throw new IllegalArgumentException(findByRegionNotFound);
        }
        return foundSongs;
    }

    @Override
    public Collection<MusicItem> findByArtist(String targetArtist) throws IllegalArgumentException {
        final String findByArtistNullEmptyExceptionMessage = "You must put an artist as input.";
        final String findByArtistNotFound = "We cannot find any matching artist or contains any character you had inserted in.";

        if (targetArtist == null || targetArtist.length() == 0) {
            throw new IllegalArgumentException(findByArtistNullEmptyExceptionMessage);
        }
        Collection<MusicItem> foundSongs = null;
        foundSongs = musicItemCollections.stream()
                .filter(item -> item.getArtist().equalsIgnoreCase(targetArtist))
                .collect(Collectors.toList());

        // best possible matching
        if (foundSongs == null || foundSongs.size() == 0) {
            foundSongs = musicItemCollections.stream()
                    .filter(item -> item.getArtist()
                            .toLowerCase()
                            .startsWith(targetArtist.toLowerCase()))
                    .filter(item -> item.getArtist()
                            .toUpperCase()
                            .startsWith(targetArtist.toUpperCase()))
                    .collect(Collectors.toList());
        }

        // base logic for if there are no exact matching song
        if (foundSongs == null || foundSongs.size() == 0) {
            for (int i = 0; i < targetArtist.length(); i++) {
                String firstCharacterArtist = targetArtist.substring(0, targetArtist.length() - i);
                foundSongs = musicItemCollections.stream()
                        .filter(item -> item.getArtist().toLowerCase()
                                .startsWith(firstCharacterArtist.toLowerCase()))
                        .filter(item -> item.getArtist().toUpperCase()
                                .startsWith(firstCharacterArtist.toUpperCase()))
                        .collect(Collectors.toList());
            }
        }

        // cannot find what customer really wants
        if (foundSongs == null || foundSongs.size() == 0) {
            throw new IllegalArgumentException(findByArtistNotFound);
        }
        return foundSongs;
    }

    @Override
    public Collection<MusicItem> findByGenre(String targetGenre) throws IllegalArgumentException {
        final String findByGenreNullEmptyExceptionMessage =
                        "You must put Genre as an input.\n" +
                        "Supported Regions: BLUES, CLASSICAL, CLASSIC_ROCK, COUNTRY, JAZZ, POP, RAP, ROCK.";
        final String findByGenreNotFound = "We cannot find any matching genre that contains any character you had inserted in\n" +
                "Supported Regions: BLUES, CLASSICAL, CLASSIC_ROCK, COUNTRY, JAZZ, POP, RAP, ROCK.";

        if (targetGenre == null || targetGenre.length() == 0) {
            throw new IllegalArgumentException(findByGenreNullEmptyExceptionMessage);
        }

        Collection<MusicItem> foundSongs = null;
        foundSongs = musicItemCollections.stream()
                .filter(item -> item.getMusicGenre().toString().equalsIgnoreCase(targetGenre))
                .sorted()
                .collect(Collectors.toList());

        // best possible matching
        if (foundSongs == null || foundSongs.size() == 0) {
            foundSongs = musicItemCollections.stream()
                    .filter(item -> item.getMusicGenre().toString()
                            .toLowerCase()
                            .startsWith(targetGenre.toLowerCase()))
                    .filter(item -> item.getMusicGenre().toString()
                            .toUpperCase()
                            .startsWith(targetGenre.toUpperCase()))
                    .collect(Collectors.toList());
        }

        // second best possible matching
        if (foundSongs == null || foundSongs.size() == 0) {
            for (int i = 0; i < targetGenre.length(); i++) {
                String firstCharactertargetTitle = targetGenre.substring(0, targetGenre.length() - i);
                // System.out.println(firstCharactertargetTitle);
                foundSongs = musicItemCollections.stream()
                        .filter(item -> item.getMusicGenre().toString()
                                .toLowerCase()
                                .startsWith(firstCharactertargetTitle.toLowerCase()))
                        .filter(item -> item.getMusicGenre().toString()
                                .toUpperCase()
                                .startsWith(firstCharactertargetTitle.toUpperCase()))
                        .collect(Collectors.toList());
            }
        }
        // cannot find what customer really wants
        if (foundSongs == null || foundSongs.size() == 0) {
            throw new IllegalArgumentException(findByGenreNotFound);
        }
        return foundSongs;
    }

    @Override
    public Collection<MusicItem> findByGenre(MusicGenre targetGenre) throws IllegalArgumentException {
        final String findByGenreNullEmptyExceptionMessage = "You must put Genre as input.\n" +
                        "Supported Region: BLUES, CLASSICAL, CLASSIC_ROCK, COUNTRY, JAZZ, POP, RAP, ROCK.";
        final String findByGenreNotFound = "We cannot find any matching genre that contains any character you had inserted in\n" +
                "Supported Region: BLUES, CLASSICAL, CLASSIC_ROCK, COUNTRY, JAZZ, POP, RAP, ROCK.";

        if (targetGenre == null) {
            throw new IllegalArgumentException(findByGenreNullEmptyExceptionMessage);
        }
        Collection<MusicItem> foundSongs = null;
        foundSongs = musicItemCollections.stream()
                .filter(item -> item.getMusicGenre() == targetGenre)
                .sorted()
                .collect(Collectors.toList());

        if (foundSongs == null || foundSongs.size() == 0) {
            throw new IllegalArgumentException(findByGenreNotFound);
        }
        return foundSongs;
    }

    @Override
    public Collection<MusicItem> findByYear(String targetYear) throws IllegalArgumentException {
        String minimumYearInMusicDataSet = getMinimumYearInDataSet();
        String maximumYearInMusicDataSet = getMaximumYearInDataSet();
        final String findByYearNullOREMPTYExceptionMessage = "You must put target year as input.\n" +
                "Minimum year: " + minimumYearInMusicDataSet + " to " + maximumYearInMusicDataSet;

        final String findByYearNotANumberExceptionMessage = "The year must only contains numbers\n" +
                "Minimum year: " + minimumYearInMusicDataSet + " to " + maximumYearInMusicDataSet;

        final String findByYearNotAValidYearExceptionMessage = "You must put a valid year\nFor example: 2021.\n";

        final String findByYearNotFoundDataExceptionMessage = "Sorry, we cannot find any musics that released " +
                "on inserted year.\n" + getReleasedYearDistribution();

        if (targetYear == null || targetYear.length() == 0) {
            throw new IllegalArgumentException(findByYearNullOREMPTYExceptionMessage);
        }
        // check ascii for special character
        for (int i = 0; i < targetYear.length(); i++) {
            char eachLetter = targetYear.charAt(i);
            if (!(eachLetter >= '0' && eachLetter <= '9')) {
                // System.out.println("Got in here");
                throw new IllegalArgumentException(findByYearNotANumberExceptionMessage);
            }
        }

        // check if user year input is length of 4
        if (targetYear.trim().length() > 4) {
            throw new IllegalArgumentException(findByYearNotAValidYearExceptionMessage);
        }
        int currentYearInteger = Calendar.getInstance().get(Calendar.YEAR);
        int userInputYearInteger = Integer.parseInt(targetYear);
        // check if user year input is not bigger than current year
        if (userInputYearInteger > currentYearInteger) {
            throw new IllegalArgumentException("You must put a target year that is not in future as input.");
        }
        Collection<MusicItem> foundSongs = null;
        foundSongs = musicItemCollections.stream()
                .filter(item -> item.getYear().equals(targetYear))
                .sorted()
                .collect(Collectors.toList());

        // if cannot find anything that
        if (foundSongs == null || foundSongs.size() == 0) {
            throw new IllegalArgumentException(findByYearNotFoundDataExceptionMessage);
        }
        return foundSongs;
    }

    @Override
    public Collection<MusicItem> findByAlbum(String targetAlbum) throws IllegalArgumentException {
        final String findByAlbumNotFoundExceptionMessage = "we cannot find any matching song or contains " +
                "any character you had inserted in\n" + getAlbumDistribution();

        if (targetAlbum == null || targetAlbum.length() == 0) {
            throw new IllegalArgumentException("You must put target title as input.");
        }
        Collection<MusicItem> foundSongs = null;
        foundSongs = musicItemCollections.stream()
                .filter(item -> item.getAlbum().equalsIgnoreCase(targetAlbum))
                .collect(Collectors.toList());

        // find the best possible match
        if (foundSongs == null || foundSongs.size() == 0) {
            foundSongs = musicItemCollections.stream()
                    .filter(item -> item.getAlbum()
                            .toLowerCase()
                            .startsWith(targetAlbum.toLowerCase()))
                    .filter(item -> item.getAlbum()
                            .toUpperCase()
                            .startsWith(targetAlbum.toUpperCase()))
                    .collect(Collectors.toList());
        }

        // base logic for if there are no exact matching song find something similar to the user
        if (foundSongs == null || foundSongs.size() == 0) {
            for (int i = 0; i < targetAlbum.length(); i++) {
                String firstCharactertargetAlbum = targetAlbum.substring(0, targetAlbum.length() - i);
                foundSongs = musicItemCollections.stream()
                        .filter(item -> item.getAlbum().toLowerCase().startsWith(firstCharactertargetAlbum.toLowerCase()))
                        .filter(item -> item.getAlbum().toUpperCase().startsWith(firstCharactertargetAlbum.toUpperCase()))
                        .sorted()
                        .collect(Collectors.toList());
            }
        }
        
        if (foundSongs == null || foundSongs.size() == 0) {
            throw new IllegalArgumentException(findByAlbumNotFoundExceptionMessage);
        }
        return foundSongs;
    }

    @Override
    public void displayAllMusic(String sortedWay) throws IllegalArgumentException {
        if (sortedWay == null || sortedWay.trim().length() == 0) {
            throw new IllegalArgumentException("IllegalArgumentException=>displayAllMusic(String sortedWay)" +
                    " parameter cannot be null or empty");
        }
        switch (sortedWay.toLowerCase()) {
            case "region":
            case "r":
                displayAllMusicSortedByRegion();
                break;
            case "genre":
            case "g":
                displayAllMusicSortedByGenre();
                break;
            case "artist":
            case "a":
                displayAllMusicSortedByArtist();
                break;
            case "title":
            case "t":
                displayAllMusicSortedByTitle();
                break;
            case "year":
            case "y":
                displayAllMusicSortedByReleasedYear();
                break;
            default:
                System.out.println("Default Sorting: by title");
                displayAllMusicSortedByTitle();
                break;
        }
    }

    @Override
    public void play(Queue<MusicItem> userSelectedSong) throws IllegalArgumentException {
        if (userSelectedSong == null || userSelectedSong.isEmpty()) {
            throw new IllegalArgumentException("I cannot play song with empty play list...");
        }
        for (MusicItem selectedSong: userSelectedSong) {
            updatePlayedMusicRecordHelper(selectedSong);
            selectedSong.play();
        }
    }

    @Override
    public void printInvoice() {
        System.out.println("=".repeat(5) + "Invoice of my Music Junk Box" + "=".repeat(5) + "\n");
        // System.out.println(PLAYED_MUSIC_HISTORY);
        if (PLAYED_MUSIC_HISTORY == null || PLAYED_MUSIC_HISTORY.isEmpty()) {
            System.out.println("No music had been played...");
            System.out.println("=".repeat(15));
            System.out.println("Total $: " + calculateInvoice());
        } else {
            for (Map.Entry<MusicItem, Integer> entry: PLAYED_MUSIC_HISTORY.entrySet()) {
                System.out.println(entry.getKey() + " played count: "
                        + entry.getValue() + ", $" + (MusicItem.getDefaultPrice() * entry.getValue()));
            }
            System.out.println("=".repeat(15));
            System.out.println("Total $: " + calculateInvoice());
        }
    }

    @Override
    public void displayTop10PlayedSong() {
        System.out.println("=".repeat(5) + "Top 10 Most Played Music" + "=".repeat(5));
        if (PLAYED_MUSIC_HISTORY == null || PLAYED_MUSIC_HISTORY.size() == 0) {
            System.out.println("Cannot read any played music record");
        } else {
            PLAYED_MUSIC_HISTORY.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .limit(10)
                    .forEach(System.out::println);

        }
    }

    // ==========================================
    // private helper method to get the minimum year in the music data-set
    private String getMinimumYearInDataSet() {
        String minimumYearInString = musicItemCollections.stream()
                .map(musicItemReleasedYear -> musicItemReleasedYear.getYear())
                .sorted()
                .limit(1)
                .collect(Collectors.joining());
        return minimumYearInString;
    }

    // =========================================
    // private helper method to get the maximum year in the music data-set
    private String getMaximumYearInDataSet() {
        String maximumYearInString = musicItemCollections.stream()
                .sorted(Comparator.comparing(MusicItem::getYear).reversed())
                .map(musicItemReleasedYear -> musicItemReleasedYear.getYear())
                .limit(1)
                .collect(Collectors.joining());
        return maximumYearInString;
    }

    // ==========================================
    // private helper method to get released year distribution in music data-set
    private String getReleasedYearDistribution() {
        StringBuilder releasedYearDisBuilder = new StringBuilder();
        // get minimum year from the music data-set to get starting point
        int minYear = Integer.parseInt(getMinimumYearInDataSet().substring(0,4));
        // get current year to set up the ending point
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String currentYearString = String.valueOf(currentYear).substring(0,4);
        int maxYear = Integer.parseInt(currentYearString);

        for (int i = minYear; i <= maxYear; i++) {
            String targetYear = String.valueOf(i).substring(0, 4);
            long count = musicItemCollections.stream()
                    .filter(musicItem -> musicItem.getYear().equals(targetYear))
                    .count();
            if (count == 0) {
                continue;
            }
            releasedYearDisBuilder.append("Year: " + targetYear + ", we have " + count + "\n");
        }
        return releasedYearDisBuilder.toString();
    }

    // ===========================================
    // private helper method to get lists of album that music data-set contains
    private String getAlbumDistribution() {
        StringBuilder albumStrBuilder = new StringBuilder();
        List<String> distinctAlbumList = musicItemCollections.stream()
                .map(eachMusicAlbum -> eachMusicAlbum.getAlbum())
                .distinct()
                .collect(Collectors.toUnmodifiableList());
        // loop through the list and append data into stringBuilder
        albumStrBuilder.append("List of albums in the music data-set\n");
        for (int i = 0; i < distinctAlbumList.size(); i++) {
            albumStrBuilder.append(distinctAlbumList.get(i) + "\n");
        }
        return albumStrBuilder.toString();
    }

    // ===========================================
    // private helper method to calculate total earn through this music junk
    private double calculateInvoice() {
        double totalEarn = MusicItem.getDefaultPrice() * MusicItem.getSongCounter();
        return totalEarn;
    }

    // ============================================
    // private helper method for display playedMusicHistory
    private void updatePlayedMusicRecordHelper(MusicItem playedSong) {
        if (PLAYED_MUSIC_HISTORY.containsKey(playedSong)) {
            PLAYED_MUSIC_HISTORY.replace(playedSong, PLAYED_MUSIC_HISTORY.get(playedSong) + 1);
        } else {
            PLAYED_MUSIC_HISTORY.put(playedSong, 1);
        }
    }

    // ============================================
    // private helper methods for display all music
    private void displayAllMusicSortedByArtist() {
        System.out.println("=".repeat(50));
        System.out.println("Sorted By Music Artist" + "============================\n");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            String firstLetter = Character.toString(ch);
            // System.out.println(firstLetter);
            long count = musicItemCollections.stream()
                    .filter(musicItem -> musicItem.getArtist().toLowerCase()
                            .startsWith(firstLetter))
                    .count();

            // if count is 0 (not exist in my music data set no need to operate)
            if (count == 0) {
                continue;
            }

            System.out.println("=Artist starts with '" + firstLetter.toUpperCase() + "'= total count: " + count + " songs exists in the dataset for that year");
            musicItemCollections.stream()
                    .filter(song -> song.getArtist().toLowerCase()
                            .startsWith(firstLetter))
                    .forEach(musicItem -> {
                        System.out.println("Artist: " + musicItem.getArtist() + ", Title: " + musicItem.getTitle()
                                + ", Region: " + musicItem.getMusicRegions() + ", Genre: " + musicItem.getMusicGenre()
                                + ", Album: " + musicItem.getAlbum() + ", Released year: " + musicItem.getYear());
                    });
            System.out.println("=".repeat(50));
        }

    }

    private void displayAllMusicSortedByTitle() {
        // this is the default way of presenting
        System.out.println("=".repeat(50));
        System.out.println("Sorted By Music Title" + "==========================\n");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            String firstLetter = Character.toString(ch);
            long count = musicItemCollections.stream()
                    .filter(musicItem -> musicItem.getTitle().toLowerCase()
                            .startsWith(firstLetter))
                    .count();
            if (count == 0) {
                continue;
            }
            System.out.println("= Music title starts with '" + firstLetter.toUpperCase() + "'= total count: " + count
                    + " songs exists in the dataset for that year");
            musicItemCollections.stream()
                    .filter(musicItem -> musicItem.getTitle().toLowerCase().startsWith(firstLetter))
                    .forEach(musicItem -> {
                        System.out.println("Title: " + musicItem.getTitle() + ", Artist: " + musicItem.getArtist()
                                + ", Region: " + musicItem.getMusicRegions() + ", Genre: " + musicItem.getMusicGenre()
                                + ", Album: " + musicItem.getAlbum() + ", Released year: " + musicItem.getYear());
                    });
            System.out.println("=".repeat(50));
        }
    }

    private void displayAllMusicSortedByReleasedYear() {
        // prepare data
        String minimumYearInString = getMinimumYearInDataSet();
        // get minimum year from the music data-set to get starting point
        int minYear = Integer.parseInt(minimumYearInString.substring(0,3));
        // get current year to set up the ending point
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String currentYearString = String.valueOf(currentYear).substring(0,3);
        int maxYear = Integer.parseInt(currentYearString);
        // proceed the data to print all music data sorted by released year
        System.out.println("=".repeat(50));
        System.out.println("Sorted By Music Released Year" + "=====================\n");
        for (int i = minYear; i <= maxYear; i++) {
            String targetYear = String.valueOf(i).substring(0, 3);
            long count = musicItemCollections.stream()
                    .filter(musicItem -> musicItem.getYear().startsWith(targetYear))
                    .count();

            // if count is 0 (not exist in my music data set no need to operate)
            if (count == 0) {
                continue;
            }

            System.out.println("=" + targetYear + "0s music= total count: " + count + " songs exists in the dataset for that year");
            musicItemCollections.stream()
                   .filter(musicItem -> musicItem.getYear().startsWith(targetYear))
                   .sorted(Comparator.comparing(MusicItem::getYear))
                   .forEach(musicItem -> {
                       System.out.println("Released year: " + musicItem.getYear() + ", Title: " + musicItem.getTitle()
                               + ", Artist: " + musicItem.getArtist()
                               + ", Region: " + musicItem.getMusicRegions() + ", Genre: " + musicItem.getMusicGenre()
                               + ", Album: " + musicItem.getAlbum());
                   });
            System.out.println("=".repeat(50));
        }
    }

    private void displayAllMusicSortedByGenre() {
        System.out.println("=".repeat(50));
        System.out.println("Sorted By Music Genre ===========================\n");
        for (int i = 0; i < MusicGenre.values().length - 1; i++) {
            MusicGenre targetGenre = MusicGenre.values()[i];
            long count = musicItemCollections.stream()
                    .filter(musicItemGenre -> musicItemGenre.getMusicGenre() == targetGenre)
                    .count();

            // if count is 0 (not exist in my music data set no need to operate)
            if (count == 0) {
                continue;
            }
            System.out.println("=" + targetGenre + "= total count: " + count + " songs exists in the dataset for that Genre");
            musicItemCollections.stream()
                    .filter(musicItemGenre -> musicItemGenre.getMusicGenre() == targetGenre)
                    .forEach(musicItem -> {
                        System.out.println("Genre: "  + musicItem.getMusicGenre() + ", Title: " + musicItem.getTitle()
                                + ", Artist: " + musicItem.getArtist()
                                + ", Region: " + musicItem.getMusicRegions()
                                + ", Album: " + musicItem.getAlbum() + ", Released year: " + musicItem.getYear());
                    });
            System.out.println("=".repeat(50));
        }
    }

    // helper method to print sorted by region
    private void displayAllMusicSortedByRegion() {
        System.out.println("=".repeat(50));
        System.out.println("Sorted By Music Region ===========================\n");
        for (int i = 0; i < MusicRegions.values().length - 1; i++) {
            MusicRegions targetRegion = MusicRegions.values()[i];
            long count = musicItemCollections.stream()
                    .filter(musicItemRegion -> musicItemRegion.getMusicRegions() == targetRegion)
                    .count();

            // if count is 0 (not exist in my music data set no need to operate)
            if (count == 0) {
                continue;
            }
            System.out.println("=" + targetRegion + "= total count: " + count + " songs exists in the dataset for that region");
            musicItemCollections.stream()
                    .filter(musicItemRegion -> musicItemRegion.getMusicRegions() == targetRegion)
                    .forEach(musicItem -> {
                        System.out.println("Region: " + musicItem.getMusicRegions() + ", Title: " + musicItem.getTitle()
                                + ", Artist: " + musicItem.getArtist()
                                + ", Genre: " + musicItem.getMusicGenre()
                                + ", Album: " + musicItem.getAlbum() + ", Released year: " + musicItem.getYear());
                    });
            System.out.println("=".repeat(50));
        }
    }
}
