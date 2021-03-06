package com.harium.keel.util;

import com.harium.keel.core.helper.ColorHelper;

public class HeightMapUtil {

  public static int[][] convertToGray(double min, double max, double[][] map) {
    int width = map.length;
    int height = map[0].length;
    int[][] result = new int[height][width];

    double d = max - min;

    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        double v = map[y][x];
        double factor = (v - min) / d;
        double value = Math.max(0, Math.min(255, 255 * factor));
        result[y][x] = (int) value;
      }
    }
    return result;
  }

  public static int[][] convertToRGB(double min, double max, double[][] map) {
    int width = map.length;
    int height = map[0].length;
    int[][] result = new int[height][width];

    double d = max - min;

    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        double v = map[y][x];
        double factor = (v - min) / d;
        double value = Math.max(0, Math.min(255, 255 * factor));
        int gray = (int) value;
        result[y][x] = ColorHelper.getRGB(gray, gray, gray);
      }
    }
    return result;
  }

}
