// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

package com.company;

public class Main {

    public static void main(String[] args) {
        Television television = new Television("V68","Sony",17,new Resolution(200,200));
        Table table = new Table(4,"Hatil");
        Bed bed = new Bed("Ikea","Double");

	    Room room = new Room(television,table, bed);
	    room.thisRoom();
    }
}
