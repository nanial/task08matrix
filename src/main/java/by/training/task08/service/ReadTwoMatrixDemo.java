package by.training.task08.service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadTwoMatrixDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Path path = Paths.get("D:\\study\\java\\by.training.task08matrix\\twoMatrix.txt");

        try (Stream<String> lineStream = Files.lines(path)) {

            list = lineStream.collect(Collectors.toList());

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

        int heght = 0;
        int width = list.get(0).split(" ").length;

        for (int i = 0; i < list.size(); i++) {

            Arrays.stream(list.get(i).split(" \n")).collect(Collectors.toList());
            if(list.get(i).length() == 0){break;}
            heght++;//find space between two matrix

        }
        int[][] matrixA = new int[heght][width];

        for (int i = 0; i < heght; i++) {

            for (int j = 0; j < width; j++) {
                String[] strings = list.get(i).split(" ");
                matrixA[i][j] = Integer.parseInt(strings[j]);
            }

        }
        List<String> temp = new ArrayList<>();

        for (int i = heght + 1; i < list.size(); i++) {
            temp.add(list.get(i));
        }

        int[][] matrixB = new int[temp.size()][width];

        for (int i = 0; i < temp.size(); i++) {

            for (int j = 0; j < width; j++) {
                String[] strings = temp.get(i).split(" ");
                matrixB[i][j] = Integer.parseInt(strings[j]);
            }

        }
        System.out.println("A:");

        for (int [] i : matrixA) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("B:");
        for (int [] i : matrixB) {
            System.out.println(Arrays.toString(i));
        }
    }
}
