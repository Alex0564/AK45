package hw12;

public class App {
    public static void main(String[] args) {
        TiledFoundation build1 = new TiledFoundation(23,20,0.5);
        System.out.println(build1.getArea());
        System.out.println(build1.getVolume());

        TiledFoundation foundation1 = new TiledFoundation(6,6,0.3);
        System.out.println(foundation1.getArea());
        System.out.println(foundation1.getVolume());

        ColumnFoundation build2 = new ColumnFoundation(0.2, 3);
        System.out.println(build2.getArea());
        System.out.println(build2.getVolume());

        ColumnFoundation column = new ColumnFoundation(0.1,5);
        System.out.println(column.getArea());
        System.out.println(column.getVolume());
    }
}
