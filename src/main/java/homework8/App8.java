package homework8;

import Lesson8a.Vehicle;

public class App8 {
    public static void main(String[] args) {
        Wine merlot = new Wine();
        merlot.name = "Merlot";
        merlot.year = 2016;
        merlot.category = "red";
        merlot.region = "France";
        merlot.WineInfo();

        Wine malbec = new Wine();
        malbec.name = "Malbec";
        malbec.year = 2019;
        malbec.category = "red";
        malbec.region = "Argentina";
        malbec.WineInfo();

        House myHouse = new House();
        myHouse.area = "Hollywood";
        myHouse.rooms = 5;
        myHouse.yearBuild = 2010;
        myHouse.houseInfo();

        House MomsHouse = new House();
        MomsHouse = new House();
        MomsHouse.yearBuild = 2020;
        MomsHouse.rooms = 2;
        MomsHouse.area = "Malibu";
        MomsHouse.houseInfo();

        Vegetables tomato = new Vegetables();
        tomato.name = "tomato";
        tomato.color = "red";
        tomato.myVeggi();

        Vegetables carrot = new Vegetables();
        carrot.name = "carrot";
        carrot.color = "orange";
        carrot.myVeggi();

        Clothes sweater = new Clothes();
        sweater.category = "sweater";
        sweater.size = "m";
        sweater.color = "pink";
        sweater.clothesType();

        Clothes skirt = new Clothes();
        skirt.category = "skirt";
        skirt.size = "s";
        skirt.color = "black";
        skirt.clothesType();


    }
}
