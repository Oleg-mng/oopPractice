package WorkerWithIterator;

import java.util.Iterator;

public class Program {
        public static void main(String[] args) {

            Worker worker = new Worker("имя", "Фамилия", 23, 4567);

            Iterator<String> components = worker;

            while (components.hasNext()){
                System.out.println(components.next());
            }
        }
}



