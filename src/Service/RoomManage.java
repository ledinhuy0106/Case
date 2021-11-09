package Service;

import model.Room;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManage implements InterFace<Room>, Serializable {
    private List<Room> roomList = new ArrayList<>();

    public RoomManage(List<Room> roomList) {
        this.roomList = roomList;
    }

    public RoomManage() {
        roomList = new ArrayList<>();
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
    @Override
    public void add(Room room) {
        roomList.add(room);
    }

    @Override
    public void edit(int id, Room room) {
        int index = findIndexById(id);
        roomList.set(index, room);
        System.out.println("Hoàn thành!");
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        roomList.remove(index);
        System.out.println("Đã Xóa!");
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomId()==id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void printList() {
        for (Room room : roomList) {
            System.out.println(room);
        }
    }
    public int findRoomByPrice(int price) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getPrice() == price) {
                return i;
            }
        }
        return -1;
    }

    public void findRoomByPrice2(int price) {
        int index = findRoomByPrice(price);
        if (index != -1) {
            System.out.println(roomList.get(index));
        }
    }

    public void findRoomByPrice3(int price) {
        for (Room room : roomList) {
            if (room.getPrice() == price) {
                System.out.println(room);
            }
        }
    }

    public void findRoomById2(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            System.out.println(roomList.get(index));
        }
    }

    public void checkRoomByStatus(int status) {
        for (Room room : roomList) {
            if (room.getRoomId()==status){
                System.out.println(room);
            }
        }
    }

    public Room creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new ID: ");
        int numberRoom = scanner.nextInt();
        System.out.println("Enter price: ");
        int price = scanner.nextInt();
        System.out.println("Enter status: ");
        boolean status = scanner.nextBoolean();
        System.out.println("Enter bedrooms: ");
        int numberOfBedRoom = scanner.nextInt();
        System.out.println("Enter toilets: ");
        int numberOfToiLet = scanner.nextInt();
        return new Room(numberRoom, price, status, numberOfBedRoom, numberOfToiLet);
    }

    public int size() {
        return roomList.size();
    }
}
