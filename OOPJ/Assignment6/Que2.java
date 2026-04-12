import java.io.*;
import java.util.*;

class Que2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("activity.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String user = line.split(" ")[0];
                map.put(user, map.getOrDefault(user, 0) + 1);
            }

            String maxUser = "";
            int max = 0;

            for (String u : map.keySet()) {
                if (map.get(u) > max) {
                    max = map.get(u);
                    maxUser = u;
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("activity_summary.txt"));
            bw.write("Most Active User: " + maxUser);
            bw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}