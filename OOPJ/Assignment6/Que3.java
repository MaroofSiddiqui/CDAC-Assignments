import java.io.*;

class Que3 {
    public static void main(String[] args) {

        int count = 0;

        try (
            BufferedReader br = new BufferedReader(new FileReader("system.log"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("error.log"))
        ) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("ERROR")) {
                    bw.write(line);
                    bw.newLine();
                    count++;
                }
            }

            System.out.println("Total Errors: " + count);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}