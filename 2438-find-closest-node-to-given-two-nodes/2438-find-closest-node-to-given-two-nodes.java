import java.util.Arrays;

class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        final int[] dist1 = getDistances(edges, node1);
        final int[] dist2 = getDistances(edges, node2);
        int answer = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < edges.length; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                int maxDist = Math.max(dist1[i], dist2[i]);
                if (maxDist < minDistance) {
                    minDistance = maxDist;
                    answer = i;
                }
            }
        }

        return answer;
    }

    private int[] getDistances(int[] edges, int start) {
        int[] dist = new int[edges.length];
        Arrays.fill(dist, -1);

        int distance = 0;
        while (start != -1 && dist[start] == -1) {
            dist[start] = distance++;
            start = edges[start];
        }

        return dist;
    }
}
