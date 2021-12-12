import java.util.*;

public class DayTwelve {

    private static final String start = "start";
    private static final String end = "end";

    public int numberOfPaths(String input) {
        Map<String, List<String>> startWithDestinations = getLocationsToVisit(input);
        Queue<Node> bfs = new ArrayDeque<>();
        List<String> visited = new ArrayList<>();
        Set<String> lowerVisited = new HashSet<>();
        visited.add(start);
        lowerVisited.add(start);
        bfs.add(new Node(start, lowerVisited, visited, false));
        int numberOfPaths = 0;
        while (bfs.size() > 0) {
            Node n = bfs.poll();
            if (n.location.equals(end)) {
                System.out.println("way to get to end " + n.cavesVisited.toString());
                numberOfPaths++;
            }
            else {
                if (startWithDestinations.containsKey(n.location)) {
                    for (String location : startWithDestinations.get(n.location)) {
                        if (canVisit(location, n)) {
                            List<String> cavesVisited = new ArrayList<>(n.cavesVisited);
                            Set<String> lowerCaseVisited = new HashSet<>(n.lowerCaseDestinationsVisited);
                            cavesVisited.add(location);
                            if (isLowerCase(location)) {
                                lowerCaseVisited.add(location);
                            }
                            Node placeToVisit = new Node(location, lowerCaseVisited, cavesVisited, false);
                            bfs.add(placeToVisit);
                        }
                    }
                }
            }
        }
        return numberOfPaths;
    }


    public int numberOfPathsWithSeeingSmallCaveTwice(String input) {
        Map<String, List<String>> startWithDestinations = getLocationsToVisit(input);
        Queue<Node> bfs = new ArrayDeque<>();
        List<String> visited = new ArrayList<>();
        Set<String> lowerVisited = new HashSet<>();
        visited.add(start);
        lowerVisited.add(start);
        bfs.add(new Node(start, lowerVisited, visited, false));
        int numberOfPaths = 0;
        while (bfs.size() > 0) {
            Node n = bfs.poll();
            if (n.location.equals(end)) {
                numberOfPaths++;
            }
            else {
                if (startWithDestinations.containsKey(n.location)) {
                    for (String location : startWithDestinations.get(n.location)) {
                        if (canVisit(location, n) && !location.equals(start)) {
                            boolean twoCavesVisited = n.lowerCaseDestinationsVisited.contains(location) || n.smallCaveVisitedTwice;
                            List<String> cavesVisited = new ArrayList<>(n.cavesVisited);
                            Set<String> lowerCaseVisited = new HashSet<>(n.lowerCaseDestinationsVisited);
                            cavesVisited.add(location);
                            if (isLowerCase(location)) {
                                lowerCaseVisited.add(location);
                            }
                            Node placeToVisit = new Node(location, lowerCaseVisited, cavesVisited, twoCavesVisited);
                            bfs.add(placeToVisit);
                        }
                    }
                }
            }
        }
        return numberOfPaths;
    }


    public Map<String, List<String>> getLocationsToVisit(String input) {
        String[] lines = input.split("\n");
        Map<String, List<String>> locationsToVisit = new HashMap<>();
        for (String line : lines) {
            String[] places = line.split("-");
            String start = places[0];
            String destination = places[1];
            List<String> startToDestinations = locationsToVisit.getOrDefault(start, new ArrayList<>());
            startToDestinations.add(destination);
            List<String> destinationsToStart = locationsToVisit.getOrDefault(destination, new ArrayList<>());
            destinationsToStart.add(start);
            locationsToVisit.put(destination, destinationsToStart);
            locationsToVisit.put(start, startToDestinations);
        }
        return locationsToVisit;
    }


    private boolean canVisit(String destination, Node currentLocation) {
        return !currentLocation.lowerCaseDestinationsVisited.contains(destination) || !currentLocation.smallCaveVisitedTwice;
    }

    private boolean isLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLowerCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    class Node {

        Set<String> lowerCaseDestinationsVisited;
        String location;
        List<String> cavesVisited;
        boolean smallCaveVisitedTwice;

        public Node(String startLocation, Set<String> lowerVisited, List<String> cavesVisited, boolean smallCaveVisitedTwice) {
            this.location = startLocation;
            this.lowerCaseDestinationsVisited = lowerVisited;
            this.cavesVisited = cavesVisited;
            this.smallCaveVisitedTwice = smallCaveVisitedTwice;
        }
    }
}
