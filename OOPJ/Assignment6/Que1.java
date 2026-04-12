import java.io.*;
import java.util.*;

class StudentRecord {
    String name, subject;
    int marks;

    StudentRecord(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }
}

class Que1 {
    public static void main(String[] args) {

        List<StudentRecord> list = new ArrayList<>();
        Map<String, Integer> total = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        Map<String, StudentRecord> topper = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[1];
                String subject = data[2];
                int marks = Integer.parseInt(data[3]);

                StudentRecord sr = new StudentRecord(name, subject, marks);
                list.add(sr);

                total.put(name, total.getOrDefault(name, 0) + marks);
                count.put(name, count.getOrDefault(name, 0) + 1);

                if (!topper.containsKey(subject) || topper.get(subject).marks < marks) {
                    topper.put(subject, sr);
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"));

            bw.write("===== STUDENT REPORT =====\n");

            for (String name : total.keySet()) {
                double avg = total.get(name) / (double) count.get(name);
                bw.write(name + " Total=" + total.get(name) + " Avg=" + avg + "\n");
            }

            bw.write("\nTopper:\n");
            for (String sub : topper.keySet()) {
                StudentRecord t = topper.get(sub);
                bw.write(sub + ": " + t.name + "\n");
            }

            bw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}