package ZapisVFail;

import java.io.*;

public class UserWriter {
    public static void main(String[] args)
        throws Exception{
        User user = new User();
        user.setLifecycle(65);

        FileOutputStream fileOutputStream = new FileOutputStream("tempUser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("tempUser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User user1 = (User) objectInputStream.readObject();
        System.out.println(user1.getLifecycle());
    }
}
