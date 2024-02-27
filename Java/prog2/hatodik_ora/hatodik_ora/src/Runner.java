import java.sql.Array;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(new Building("deik", "kassai u. 26."), "f0"));
        rooms.add(new Room(new Building("deik", "kassai u. 26."), "f1"));
        rooms.add(new Room(new Building("deik", "kassai u. 26."), "f2"));

        rooms.remove(2);
        for(Room room : rooms) {
            System.out.println(room);
        }

        Set<Building> buildings = new HashSet<>();  //hashcode alapján rendezi az elemeket "bucketekbe", nincs benne azonos elem, nem rendezett
        Building building1 = new Building("deik", "kassai u. 26.");
        Building building2 = building1;
        buildings.add(building1);
        buildings.add(building2);
        buildings.add(new Building("deik", "kassai u. 26."));
        buildings.add(new Building("deik", "kassai u. 26."));
        buildings.add(new Building("deik", "kassai u. 26."));

        for(Building building : buildings) {
            System.out.println(building);
        }

        Set<Building> buildings2 = new TreeSet<>(new Comparator<Building>() {   //treeset: sorrendbe rendez es nincs benne azonos elem
            @Override
            public int compare(Building o1, Building o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        });
        buildings2.add(new Building("deik", "kassai u. 26."));
        buildings2.add(new Building("deik", "kassai u. 26."));
        buildings2.add(new Building("deik", "kassai u. 26."));

        buildings2.forEach(System.out::println); // :: metódus referencia, ha egy bemeneti érték van, ezt lehet használni
        //buildings2.forEach(b -> System.out.println(b));  //ha nem használunk ::-t, így kell írni

        System.out.println("------------------------------------------------------");
        Set<Building> buildings3 = new LinkedHashSet<>();
        buildings3.add(new Building("foepulet", "kassai u. 22."));
        buildings3.add(new Building("foepulet", "kassai u. 29."));
        buildings3.add(new Building("gazdasagi", "kassai u. 23."));
        buildings3.forEach(System.out::println);

        ArrayList<Room> rooms2 = new ArrayList<>();
        rooms2.add(new Room(new Building("deik", "kassai u. 26."), "f0"));
        rooms2.add(new Room(new Building("deik", "kassai u. 26."), "f1"));
        rooms2.add(new Room(new Building("deik", "kassai u. 26."), "ik321"));
        rooms2.add(new Room(new Building("deik", "kassai u. 26."), "ik1284"));
        rooms2.add(new Room(new Building("deik", "kassai u. 26."), "f05"));
        rooms2.add(new Room(new Building("foepulet", "kassai u. 22."), "aud max"));
        rooms2.add(new Room(new Building("foepulet", "kassai u. 22."), "romai 1"));
        rooms2.add(new Room(new Building("foepulet", "kassai u. 22."), "romai 4"));
        rooms2.add(new Room(new Building("gazdasagi", "kassai u. 26."), "k2"));
        rooms2.add(new Room(new Building("gazdasagi", "kassai u. 26."), "k1"));

        Map<Building, ArrayList<Room>> map = new HashMap<>();  //a map kulcs-ertekpart tarol, duplikalt kulcs nem lehet, ertek igen
        for (Room room : rooms2) {
            ArrayList<Room> tmp;
            if (!map.containsKey(room.getBuilding())) {
                tmp = new ArrayList<>();
                tmp.add(room);
                map.put(room.getBuilding(), tmp);
            } else {
                map.get(room.getBuilding()).add(room);
            }
        }
        System.out.println("------------------------------------------------------");

        
        for(Map.Entry<Building, ArrayList<Room>> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + "value: " + entry.getValue());
            System.out.println("values: ");
            for(Room room: entry.getValue()) {
                System.out.println(room);
            }
        }
    }
}
