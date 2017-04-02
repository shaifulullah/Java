package com.company;

import java.util.ArrayList;

/**
 * Created by Shaiful on 2017-02-28.
 */
public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void addGroceryItem(String name) {
        groceryList.add(name);
    }

    public void printGroceryList() {
        System.out.println("you have total " + groceryList.size() + " items in grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Item " + (i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String NewItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, NewItem);
        }
    }

    private void modifyGroceryItem(int position, String name) {
        groceryList.set(position, name);
        System.out.println("Grocery item " + (position + 1) + " is modified to " + name);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
            System.out.println(item+ " has been removed");
        }else{
            System.out.println(item+" is not in the list. can not be removed");
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String itemName) {
        return groceryList.indexOf(itemName);
    }

    public boolean onfile(String itemName){
        int position = findItem(itemName);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}


//package com.company;
//
//        import java.util.ArrayList;
//
///**
// * Created by Shaiful on 2017-02-28.
// */
//public class GroceryList {
//    private static ArrayList<String> groceryList = new ArrayList<>();
//
//    public static void addGroceryItem(String name){
//        groceryList.add(name);
//    }
//
//    public void printGroceryList(){
//        System.out.println("you have total "+groceryList.size()+" items in grocery list");
//        for (int i = 0; i<groceryList.size(); i++){
//            System.out.println("Item "+(i+1)+". "+groceryList.get(i));
//        }
//    }
//
//    public void modifyGroceryItem(int position, String name){
//        groceryList.set(position,name);
//        System.out.println("Grocery item "+(position+1)+ " is modified to "+name);
//    }
//
//    public void removeGroceryItem(int position){
//        groceryList.remove(position-1);
//    }
//
//    public String findItem(String itemName){
//        int position = groceryList.indexOf(itemName);
//        if (position>=0){
//            return groceryList.get(position);
//        }
//        return null;
//    }
//}