import java.util.*;

public class DayFifteen {


    public int getMinimumRiskPath(String input) {
        String[] lines = input.split("\n");

        int[][] riskLevels = new int[lines.length][lines[0].length()];
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[0].length(); j++) {
                int val = Character.getNumericValue(lines[i].charAt(j));
                riskLevels[i][j] = val;
            }
        }

        Queue<NodeWithCost> bfs = new PriorityQueue<>(Comparator.comparingInt(val -> val.cost));
        bfs.add(new NodeWithCost(new Point(0,0), 0));
        Set<Point> visited = new HashSet<>();
        while (bfs.size() > 0 ){
            NodeWithCost node = bfs.poll();
            if (node.point.x == lines.length - 1 && node.point.y == lines[0].length() - 1)
                return node.cost;
            addNeighborsToQueue(bfs, node, riskLevels, visited);
        }

        return 0;
    }

    public int getExtendedRiskLevels(String input) {
        String[] lines = input.split("\n");

        int[][] riskLevels = new int[lines.length*5][lines[0].length()*5];
        for (int i = 0; i < riskLevels.length; i++) {
            for (int j = 0; j < riskLevels[0].length; j++) {
                int val = 0 ;
                if (i < lines.length && j < lines[0].length()) {
                    val = Character.getNumericValue(lines[i].charAt(j));
                } else {
                    if (j >= lines[0].length()){
                        val = riskLevels[i][j - lines[0].length()] + 1;
                    } else {
                        val = riskLevels[i-lines.length][j] + 1;
                    }
                    val = val == 10 ? 1 : val;
                }
                riskLevels[i][j]=val;
            }
        }

        Queue<NodeWithCost> bfs = new PriorityQueue<>(Comparator.comparingInt(val -> val.cost));
        bfs.add(new NodeWithCost(new Point(0,0), 0));
        Set<Point> visited = new HashSet<>();
        while (bfs.size() > 0 ){
            NodeWithCost node = bfs.poll();
            if (node.point.x == riskLevels.length - 1 && node.point.y == riskLevels[0].length - 1)
                return node.cost;
            addNeighborsToQueue(bfs, node, riskLevels, visited);
        }

        return 0;
    }



    private void addNeighborsToQueue(Queue<NodeWithCost> bfs, NodeWithCost node, int[][] riskLevels, Set<Point> visited) {
        Point currentPoint = node.point;
        if (node.point.x < riskLevels.length - 1) {
            Point point = new Point(currentPoint.x + 1, currentPoint.y);
            addIfNotVisited(bfs, point, node, riskLevels, visited);
        }
        if (node.point.x > 0) {
            Point point = new Point(currentPoint.x - 1, currentPoint.y);
            addIfNotVisited(bfs, point, node, riskLevels, visited);
        }
        if (node.point.y < riskLevels[0].length - 1) {
            Point point = new Point(currentPoint.x, currentPoint.y + 1);
            addIfNotVisited(bfs, point, node, riskLevels, visited);
        }
        if (node.point.y > 0) {
            Point point = new Point(currentPoint.x, currentPoint.y - 1);
            addIfNotVisited(bfs, point, node, riskLevels, visited);
        }
    }

    private void addIfNotVisited(Queue<NodeWithCost> bfs, Point point, NodeWithCost node, int[][] riskLevels, Set<Point> visited) {

        NodeWithCost n = new NodeWithCost(point, riskLevels[point.x][point.y] + node.cost);
        if (!visited.contains(point)) {
            bfs.add(n);
            visited.add(point);
        }
    }


    class NodeWithCost {


        Point point;
        int cost;


        public NodeWithCost(Point point, int cost) {
            this.point = point;
            this.cost = cost;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NodeWithCost that = (NodeWithCost) o;
            return cost == that.cost && Objects.equals(point, that.point);
        }

        @Override
        public int hashCode() {
            return Objects.hash(point, cost);
        }
    }

}
