package net.santoshganti.InterviewPrepProblems.amazon;

public class FloodFillRecursive {
    // A helper method that recursively fills the image with the new color
    private void floodFillHelper(int[][] image, int x, int y, int color, int newColor) {
        int m = image.length; // the number of rows in the image
        int n = image[0].length; // the number of columns in the image
        if (image[x][y] == color) { // if the pixel at (x, y) has the original color
            image[x][y] = newColor; // change its color to the new color
            if (x >= 1) floodFillHelper(image, x - 1, y, color, newColor); // fill the pixel to the left
            if (y >= 1) floodFillHelper(image, x, y - 1, color, newColor); // fill the pixel to the top
            if (x + 1 < m) floodFillHelper(image, x + 1, y, color, newColor); // fill the pixel to the right
            if (y + 1 < n) floodFillHelper(image, x, y + 1, color, newColor); // fill the pixel to the bottom
        }
    }

    // The main method that takes an image, a starting pixel, and a new color, and returns the filled image
    public int[][] floodFill(int[][] image, int x, int y, int newColor) {
        int color = image[x][y]; // the original color of the starting pixel
        if (color != newColor) // if the original color is different from the new color
            floodFillHelper(image, x, y, color, newColor); // call the helper method to fill the image
        return image; // return the filled image
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