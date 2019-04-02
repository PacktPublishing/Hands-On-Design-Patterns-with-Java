package com.three19;

public class Driver {

    public static void main(String[] args) {

        // Example calls to mutators
        Bicycle myBike = new Bicycle();
        myBike.setGears(24);
        myBike.setCost(319.99);
        myBike.setWeight(13.5);
        myBike.setColor("Purple");
        System.out.println("\nmyBike's color is " + myBike.getColor());


        // Example of calls to overloaded constructor
        Bicycle myBike1 = new Bicycle();
        Bicycle myBike2 = new Bicycle("Brown");
        Bicycle myBike3 = new Bicycle(22);
        Bicycle myBike4 = new Bicycle(22, 319.99, 13.5, "White");

        myBike1.outputData("Nbr 1");
        myBike2.outputData("Nbr 2");
        myBike3.outputData("Nbr 3");
        myBike4.outputData("Nbr 4");


        // Example using method call chaining
        Bicycle myBike5 = new Bicycle(24, 418.50, 17.2, "Green");
        myBike5.setColor("Peach").setGears(32).outputData("Number 5");


        // "IS A" Checks
        System.out.println("\n\"IS A\" CHECKS");

        // focus on myBike6
        Bicycle myBike6 = new Bicycle();

        if (myBike6 instanceof Bicycle)
            System.out.println("myBike6 Instance of Bicycle: True");
        else
            System.out.println("myBike6 Instance of Bicycle: False");

        if (myBike6 instanceof TwoWheeled)
            System.out.println("myBike6 Instance of TwoWheeled: True");
        else
            System.out.println("myBike6 Instance of TwoWheeled: False");

        if (myBike6 instanceof Vehicle)
            System.out.println("myBike6 Instance of Vehicle: True");
        else
            System.out.println("myBike6 Instance of Vehicle: False");

        if (myBike6 instanceof Object)
            System.out.println("myBike6 Instance of Object: True");
        else
            System.out.println("myBike6 Instance of Object: False");

        // focus on TwoWheeled
        TwoWheeled myTwoWheeled = new TwoWheeled();

        if (myTwoWheeled instanceof Bicycle)
            System.out.println("\nmyTwoWheeled Instance of Bicycle: True");
        else
            System.out.println("\nmyTwoWheeled Instance of Bicycle: False");

        if (myTwoWheeled instanceof TwoWheeled)
            System.out.println("myTwoWheeled Instance of TwoWheeled: True");
        else
            System.out.println("myTwoWheeled Instance of TwoWheeled: False");

        if (myTwoWheeled instanceof Vehicle)
            System.out.println("myTwoWheeled Instance of Vehicle: True");
        else
            System.out.println("myTwoWheeled Instance of Vehicle: False");

        if (myTwoWheeled instanceof Object)
            System.out.println("myTwoWheeled Instance of Object: True");
        else
            System.out.println("myTwoWheeled Instance of Object: False");

        // focus on Vehicle
        Vehicle myVehicle = new Vehicle();

        if (myVehicle instanceof Bicycle)
            System.out.println("\nmyVehicle Instance of Bicycle: True");
        else
            System.out.println("\nmyVehicle Instance of Bicycle: False");

        if (myVehicle instanceof TwoWheeled)
            System.out.println("myVehicle Instance of TwoWheeled: True");
        else
            System.out.println("myVehicle Instance of TwoWheeled: False");

        if (myVehicle instanceof Vehicle)
            System.out.println("myVehicle Instance of Vehicle: True");
        else
            System.out.println("myVehicle Instance of Vehicle: False");

        if (myVehicle instanceof Object)
            System.out.println("myVehicle Instance of Object: True");
        else
            System.out.println("myVehicle Instance of Object: False");
    }
}
