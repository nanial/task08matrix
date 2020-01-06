package by.training.task08.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadMatrix {

    public int[][] readMatrix(String pathFile) {

        List<String> list = new ArrayList<>();

        Path path = Paths.get(pathFile);

        try (Stream<String> lineStream = Files.lines(path)) {

            list = lineStream.collect(Collectors.toList());

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

        int width = list.get(0).split(" ").length;
        int height = list.size();

        int[][] matrix = new int[height][width];


        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {
                String[] strings = list.get(i).split(" ");
                matrix[i][j] = Integer.parseInt(strings[j]);
            }
        }
        return matrix;
    }
}
