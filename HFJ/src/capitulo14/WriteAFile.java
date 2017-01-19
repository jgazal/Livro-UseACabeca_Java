package capitulo14;

import java.io.FileWriter;

class WriteAFile {

    public static void main(String[] args) {

        try{
            FileWriter writer = new FileWriter("foo.txt");
            writer.write("Hello foo");
            writer.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
