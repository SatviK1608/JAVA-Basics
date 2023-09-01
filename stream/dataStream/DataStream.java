package stream.dataStream;



import java.io.*;

public class DataStream {
    static final String dataFileName = "DataStreams.txt";

    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) throws EOFException,IOException {
        DataOutputStream out = null;
        DataInputStream in = null;

        try {
//            WRITING TO FILE FIRST
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFileName)));
            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
            System.out.println("Data written successfully.");
            out.close(); //closing the file  to read data
//            READING DATA STREAM FROM FILE NOW
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFileName)));
            double price;
            int unit;
            String desc;
            double total = 0.0;
//            Object c;
//            while ((Integer) (c = in.read()) != -1) {
            System.out.println(in.available());    //tells us how many bytes are available
            while (in.available()>0) {          
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                        unit, desc, price);
                total += unit * price;
            }
//            System.out.println("Data read successfully.");
        } catch (EOFException e) {
            System.out.println("Error occurred: " + e);
//            throw new RuntimeException(e);
        } finally {
//            assert out != null;
            out.close();
            in.close();
        }
    }
}