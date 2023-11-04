package net.santoshganti.InterviewPrepProblems.amazon;

import java.util.Stack;

public class FloodFillIterative {
    // A method to perform the flood fill algorithm using a stack
    public static void floodFill(int[][] image, int x, int y, int newColor) {
        // Get the old color of the starting pixel
        int oldColor = image[x][y];

        // If the old color and the new color are the same, return
        if (oldColor == newColor) {
            return;
        }

        // Create a stack to store the pixels that need to be filled
        Stack<Pixel> stack = new Stack<>();

        // Push the starting pixel to the stack
        stack.push(new Pixel(x, y));

        // While the stack is not empty
        while (!stack.isEmpty()) {
            // Pop a pixel from the stack
            Pixel pixel = stack.pop();

            // Get the coordinates of the pixel
            int i = pixel.x;
            int j = pixel.y;

            // Change the color of the pixel
            image[i][j] = newColor;

            // Check the adjacent pixels and push them to the stack if they have the old color
            if (i > 0 && image[i - 1][j] == oldColor) {
                stack.push(new Pixel(i - 1, j));
            }
            if (i < image.length - 1 && image[i + 1][j] == oldColor) {
                stack.push(new Pixel(i + 1, j));
            }
            if (j > 0 && image[i][j - 1] == oldColor) {
                stack.push(new Pixel(i, j - 1));
            }
            if (j < image[0].length - 1 && image[i][j + 1] == oldColor) {
                stack.push(new Pixel(i, j + 1));
            }
        }
    }

    static class Pixel {
        int x;
        int y;

        public Pixel(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}