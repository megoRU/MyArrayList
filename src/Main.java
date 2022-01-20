public class Main {

    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>();


        myArrayList.add("Поесть");
        myArrayList.add("Сходить погулять");
        myArrayList.add("Сделать уроки");
        myArrayList.add("Выучить стихотворение");

        System.out.println(myArrayList.getSize());
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.contains("Сделать уроки"));
        System.out.println("_______________________");
        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }

    }
}
