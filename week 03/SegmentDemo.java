import java.util.Scanner;
import java.util.ArrayList;

public class SegmentDemo {
    // Method to find all segments with minimum length
    public static Segment[] minSegments(Segment[] segments) {
        int minLen = segments[0].length();
        for (int i = 1; i < segments.length; i++) {
            int len = segments[i].length();
            if (len < minLen) {
                minLen = len;
            }
        }
        ArrayList<Segment> minList = new ArrayList<>();
        for (Segment s : segments) {
            if (s.length() == minLen) {
                minList.add(s);
            }
        }
        return minList.toArray(new Segment[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of segments: ");
        int n = sc.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter start and end for segment " + (i+1) + ": ");
            int start = sc.nextInt();
            int end = sc.nextInt();
            segments[i] = new Segment(start, end);
        }
        Segment[] minSegs = minSegments(segments);
        System.out.println("\nSegments with minimum length:");
        for (Segment s : minSegs) {
            System.out.println(s);
        }
        sc.close();
    }
} 