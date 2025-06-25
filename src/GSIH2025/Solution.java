package GSIH2025;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Solution {
    // Image dimensions
    private static final int WIDTH = 512;
    private static final int HEIGHT = 512;

    // Class to represent a point
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    // Convert RGB to grayscale
    private static int toGrayScale(int rgb) {
        int r = (rgb >> 16) & 0xFF;
        int g = (rgb >> 8) & 0xFF;
        int b = rgb & 0xFF;
        return (r + g + b) / 3;
    }

    // Detect lines and intersections
    private static int countIntersections(BufferedImage image) {
        // Convert to binary image (1 for line pixels, 0 for background)
        int[][] binary = new int[HEIGHT][WIDTH];
        int threshold = 128; // Assume dark lines (adjust if needed)
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                int gray = toGrayScale(image.getRGB(x, y));
                binary[y][x] = (gray < threshold) ? 1 : 0; // Line pixels are dark
            }
        }

        // Identify axes (assume they are near edges or straight)
        // For simplicity, assume axes are at x=0 or y=0 or near edges
        // Remove axis pixels (set to 0)
        for (int y = 0; y < HEIGHT; y++) {
            if (binary[y][0] == 1 || binary[y][WIDTH - 1] == 1) {
                // Vertical axis at x=0 or x=511
                for (int x = 0; x < WIDTH; x++) {
                    binary[y][x] = 0;
                }
            }
        }
        for (int x = 0; x < WIDTH; x++) {
            if (binary[0][x] == 1 || binary[HEIGHT - 1][x] == 1) {
                // Horizontal axis at y=0 or y=511
                for (int y = 0; y < HEIGHT; y++) {
                    binary[y][x] = 0;
                }
            }
        }

        // Find connected components (lines)
        List<Set<Point>> lines = new ArrayList<>();
        boolean[][] visited = new boolean[HEIGHT][WIDTH];
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}}; // 8-connectivity

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (binary[y][x] == 1 && !visited[y][x]) {
                    // Start a new line
                    Set<Point> line = new HashSet<>();
                    Queue<Point> queue = new LinkedList<>();
                    Point start = new Point(x, y);
                    queue.add(start);
                    visited[y][x] = true;
                    line.add(start);

                    // BFS to trace the line
                    while (!queue.isEmpty()) {
                        Point p = queue.poll();
                        for (int[] dir : directions) {
                            int ny = p.y + dir[0];
                            int nx = p.x + dir[1];
                            if (nx >= 0 && nx < WIDTH && ny >= 0 && ny < HEIGHT && !visited[ny][nx] && binary[ny][nx] == 1) {
                                Point next = new Point(nx, ny);
                                queue.add(next);
                                visited[ny][nx] = true;
                                line.add(next);
                            }
                        }
                    }
                    if (!line.isEmpty()) {
                        lines.add(line);
                    }
                }
            }
        }

        // Count intersections
        Set<Point> intersections = new HashSet<>();
        for (int i = 0; i < lines.size(); i++) {
            for (int j = i + 1; j < lines.size(); j++) {
                Set<Point> line1 = lines.get(i);
                Set<Point> line2 = lines.get(j);
                // Find common points
                for (Point p : line1) {
                    if (line2.contains(p)) {
                        // Check if point is within bounds and not on axes
                        if (p.x > 10 && p.x < WIDTH - 10 && p.y > 10 && p.y < HEIGHT - 10) { // Avoid edge pixels
                            intersections.add(p);
                        }
                    }
                }
            }
        }

        return intersections.size();
    }

    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        scanner.close();

        try {
            // Load image
            File file = new File(filename);
            BufferedImage image = ImageIO.read(file);

            // Check image dimensions
            if (image.getWidth() != WIDTH || image.getHeight() != HEIGHT) {
                System.out.println(0);
                return;
            }

            // Count intersections
            int result = countIntersections(image);
            System.out.println(result);

        } catch (IOException e) {
            System.out.println(0);
        }
    }
}