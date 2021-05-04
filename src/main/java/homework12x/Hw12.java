package homework12x;

public class Hw12 {
    public static void main(String[] args) {
        //1st-2nd objects of class Parallelepiped
        Parallelepiped p1 = new Parallelepiped(7, 8, 10);
        p1.draw();
        System.out.println("Volume of p1 = " + p1.getVolume());

        Parallelepiped p2 = new Parallelepiped(5.6, 18.6, 7);
        p2.draw();
        System.out.println("Volume of p2 = " + p2.getVolume());
        
        //1st-2nd object of class Cube 
        Cube cube1 = new Cube(8);
        cube1.draw();
        System.out.println("Volume of cube1 = " + cube1.getVolume());

        Cube cube2 = new Cube(10);
        cube2.draw();
        System.out.println("Volume of cube2 = " + cube2.getVolume());


        //Assign one object to interface type
        IVolumetricFigures cube3 = new Cube(8.9);
        cube3.draw();
        System.out.println("Volume of cube2 = " + cube3.getVolume());
    }
}
