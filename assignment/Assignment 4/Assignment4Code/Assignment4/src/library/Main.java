package library;

import java.util.ArrayList;

import items.*;

public class Main {
    public static void main(String[] args){
        //******************************PART1******************************//
        System.out.println();
        System.out.println("*****PART ONE*****");
        LibraryItem l1 = new LibraryItem(1001,"ny","AA","2024",true);
		System.out.println(l1);
		LibraryItem l2 = new LibraryItem(1002,"ny","AA","2024",true);
        LibraryItem l3= new LibraryItem(1001,"ny","AA","2024",true);
		System.out.println(l2);
		System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));

		Book b1 = new Book(10001,"HP1","JR","2024",true,100,"novel");
		System.out.println(b1);
		Book b2 = new Book(10001,"HP2","JR","2024",true,100,"novel");
        System.out.println(b2);
		System.out.println(b1.equals(b2));

        Referencebook rb1 = new Referencebook(100,"JAVA","ZWZ","2024",true,1000,"CS",3);
        System.out.println(rb1);
        System.out.println(b1.equals(rb1));

        Video v1 = new Video(10002,"StarWar","me","decadesago",true,"meagain",180);
        DVD dvd = new DVD(10003,"StarWar","me","decadesago",true,"meagain",180,"3840*2160",5,false);
        Music m = new Music(10004,"wonderwall","oasis","1996",true,12);
        CD cd = new CD(10005,"wonderwall","oasis","1996",true,12,true,false);
        //Record record = new Record(10006,"wonderwall","oasis","1996",true,12,"BritishPop","fast",true);
        Magazine maga = new Magazine(10007,"Science","dontKnow","2023",true,"Awarded",12);
        System.out.println(v1);
        System.out.println(dvd);
        System.out.println(m);
        System.out.println(cd);
        // System.out.println(record);
        System.out.println(maga);
        System.out.println();
        System.out.println();

        //******************************PART2******************************//
        System.out.println();
        System.out.println("*****PART TWO*****");
        Library library = new Library("Tandon Library","New York","NY");
        System.out.println(library);

        //addItem method
        System.out.println("*****AddItem method*****");
        Book book = new Book(1,"ThreeBody","LCX","2008",true,1418,"sci-fiction");;
        library.addItem(book);System.out.println(library);
        Referencebook referencebook = new Referencebook(2,"JAVA","vonNeumann","2020",true,114514,"CS",3);
        library.addItem(referencebook);System.out.println(library);
        Music music = new Music(3,"wonderwall","oasis","1996",true,12);
        Magazine magazine = new Magazine(4,"Science","dontKnow","2023",true,"Awarded",12);
        library.addItem(music);System.out.println(library);
        library.addItem(magazine);System.out.println(library);

        //itemInStock method
        System.out.println();
        System.out.println("*****itemInStock method*****");
        ArrayList<LibraryItem> list = library.itemsInStock();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

        //remove method
        System.out.println();
        System.out.println("*****Remove method*****");
        library.removeItem(2);
        list = library.itemsInStock();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

        //lendItem method
        System.out.println();
        System.out.println("*****LendItem method*****");
        System.out.println(library.lendItem(4));
        System.out.println(library.lendItem(3));
        System.out.println();
        list = library.itemsInStock();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

        //returnItem method
        System.out.println();
        System.out.println("*****ReturnItem method*****");
        System.out.println(library.returnItem(4));
        System.out.println(library.returnItem(3));

    }
}
