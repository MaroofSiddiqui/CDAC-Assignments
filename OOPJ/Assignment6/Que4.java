import java.io.*;
import java.util.*;

class WordCounterThread implements Runnable {

    List<String> lines;
    int count = 0;

    WordCounterThread(List<String> lines) {
        this.lines = lines;
    }

    public void run() {
        for (String line : lines) {
            count += line.split(" ").length;
        }
        System.out.println("Thread count: " + count);
    }
}

class Que4 {
    public static void main(String[] args) throws Exception {

        List<String> allLines = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            allLines.add(line);
        }
        br.close();

        List<String> part1 = allLines.subList(0, allLines.size() / 2);
        List<String> part2 = allLines.subList(allLines.size() / 2, allLines.size());

        WordCounterThread w1 = new WordCounterThread(part1);
        WordCounterThread w2 = new WordCounterThread(part2);

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int total = w1.count + w2.count;
        System.out.println("Total words: " + total);
    }
}