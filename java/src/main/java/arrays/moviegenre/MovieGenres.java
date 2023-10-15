package arrays.moviegenre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieGenres {

    public static void main(String[] args) {

        int numUsers = 3;
        int numGenres = 3;

        HashMap<String, List<String>> userBooksListenedTo = new HashMap<>();
        HashMap<String, List<String>> bookGenres = new HashMap<>();

        userBooksListenedTo.put("Fred", new ArrayList<String>() {{
            add("mass");
            add("void");
            add("stress");
        }});

        userBooksListenedTo.put("Jenie", new ArrayList<String>() {{
            add("happy");
            add("pride");
        }});

        userBooksListenedTo.put("Rone", new ArrayList<String>() {{
            add("alexander");
        }});

        bookGenres.put("Horror", new ArrayList<String>() {{
            add("mass");
            add("stress");
        }});

        bookGenres.put("Comedy", new ArrayList<String>() {{
            add("happy");
        }});

        bookGenres.put("Romance", new ArrayList<String>() {{
            add("world");
            add("alexander");
            add("pride");
        }});


        System.out.println(favoriteVideoGenre(numUsers, userBooksListenedTo, numGenres, bookGenres));
    }

    static HashMap<String, List<String>> favoriteVideoGenre(int numUsers,
                                                            HashMap<String, List<String>> userBooksListenedTo,
                                                            int numGenres,
                                                            HashMap<String, List<String>> bookGenres) {

        HashMap<String, List<String>> result = new HashMap<>();
        HashMap<String, String> moviesToGenre = new HashMap<>();

        for (String genre : bookGenres.keySet()) {
            List<String> songs = bookGenres.get(genre);
            for (String song : songs) {
                moviesToGenre.put(song, genre);
            }
        }

        Map<String, Map<String, Integer>> userGenreCount = new HashMap<>();

        for (String user : userBooksListenedTo.keySet()) {
            if (!userGenreCount.containsKey(user)) {
                userGenreCount.put(user, new HashMap<>());
            }

            List<String> movies = userBooksListenedTo.get(user);

            for (String movie : movies) {
                String genre = moviesToGenre.get(movie);
                int count = userGenreCount.get(user).getOrDefault(genre, 0) + 1;
                userGenreCount.get(user).put(genre, count);
            }
        }

        for (String user : userGenreCount.keySet()) {
            if (!result.containsKey(user)) {
                result.put(user, new ArrayList<>());
            }

            Map<String, Integer> pair = userGenreCount.get(user);
            int max = 0;

            List<String> favoriteGenre = new ArrayList<>();

            for (String genre : pair.keySet()) {
                if (favoriteGenre.size() == 0) {
                    favoriteGenre.add(genre);
                    max = pair.get(genre);
                } else if (pair.get(genre) > max) {
                    favoriteGenre.clear();
                    favoriteGenre.add(genre);
                    max = pair.get(genre);
                } else if (pair.get(genre) == max)
                    favoriteGenre.add(genre);
            }
            result.put(user, favoriteGenre);
        }

        return result;
    }
}
