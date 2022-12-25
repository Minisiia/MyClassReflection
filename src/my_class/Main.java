package my_class;

public class Main {
    public static void main(String[] args) {
        Class<Velociraptor> cl = Velociraptor.class;
        System.out.println((char) 27 + "[34m" + "Інформація про клас " + (char) 27 + "[39m");
        ClassInfo.getClassName(cl);
        System.out.println((char) 27 + "[34m" + "Модифікатори класу " + (char) 27 + "[39m");
        ClassInfo.modifierInfo(cl);
        System.out.println((char) 27 + "[34m" + "Поля класу " + (char) 27 + "[39m");
        ClassInfo.fieldInfo(cl);
        System.out.println((char) 27 + "[34m" + "Конструктори класу " + (char) 27 + "[39m");
        ClassInfo.constructorInfo(cl);
        System.out.println((char) 27 + "[34m" + "Методи класу " + (char) 27 + "[39m");
        ClassInfo.methodInfo(cl);
    }
}
