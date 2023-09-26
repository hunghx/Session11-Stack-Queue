import java.util.*;


public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Ăn kem");
        stack.push("Đá bóng");
        stack.push("Học bài");
        stack.push("Đi ngủ");
        // sử dụng peek để lấy ra phần tử trên cùng của stack
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
        // lấy phần tử trên cùng và xóa
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        if(!stack.empty()) {
//            System.out.println(stack.pop());
////        }
//        while(!stack.empty()){
//            System.out.println(stack.pop());
//        }
        System.out.println(stack.search("Học bài"));

Deque<String> deque = new ArrayDeque<>();
        Queue<Integer> queue = new PriorityQueue<>();

//        queue.offer(100);
//        queue.offer(200);
//        queue.offer(300);
//        queue.offer(400);
//        queue.offer(500);
//        System.out.println(queue.poll()); // lấy và xóa phần tử đầu
//        System.out.println(queue);
//        System.out.println(queue.remove()); // có ngoại lệ

        // lấy ra phần tử đầu
//        System.out.println(queue.peek()); // ko sinh ra ngoaaij lệ
        //  có sinh ra ngoại lệ
//        System.out.println(queue.element());

        // handling exception
//        try{
//            queue.remove();
//        }catch (NoSuchElementException e){
//            System.out.println("đã được xử li");
//        }


        List<Student> students = new ArrayList<>();
        students.add(new Student(1,30,"Hùng"));
        students.add(new Student(2,22,"Khánh"));
        students.add(new Student(3,18,"Duy"));
        students.add(new Student(4,25,"Long"));
        students.add(new Student(5,23,"Bình"));
        System.out.println(students);


//      students.sort(new StudentComparator());
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);

        // cách 1 sử dụng Comparable
        List<Integer>  list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
    }
}