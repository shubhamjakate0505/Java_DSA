import java.util.*;

public class PQJCF {
    public class Student implements Comparable<Student> {
        String name;
        int rank;
        
        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s1) {  // Corrected the method name
            return this.rank - s1.rank;
        }
    }

    public static void main(String args[]) {
        PQJCF pqjcf = new PQJCF();  // Create an instance of the outer class
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        pq.add(pqjcf.new Student("A", 4));  // Corrected the constructor syntax
        pq.add(pqjcf.new Student("B", 5));
        pq.add(pqjcf.new Student("C", 2));
        pq.add(pqjcf.new Student("D", 12));

        while (!pq.isEmpty()) {
            Student s = pq.peek();
            System.out.println(s.name + " -> " + s.rank);
            pq.remove();
        }
    }
}
