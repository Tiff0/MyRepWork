package WorkwithFiles;

import java.io.*;

// Запись состояния

public class ConditionFileWriter {
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


class User implements Serializable {
    private int lifecycle;

    public int getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(int lifecycle) {
        this.lifecycle = lifecycle;
    }
}
