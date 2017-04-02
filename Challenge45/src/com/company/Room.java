package com.company;

/**
 * Created by Shaiful on 2017-02-24.
 */
public class Room {
    private Television television;
    private Table table;
    private Bed bed;

    public Room(Television television, Table table, Bed bed) {
        this.television = television;
        this.table = table;
        this.bed = bed;
    }

    public void thisRoom(){
        table.eatingPersonOnTable(4);
        bed.sleep(3);
        objtelevision();
    }
    private void objtelevision(){
        television.watch();
    }
}
