package com.bjpowernode.javase.array.homework;

public class Hotel {
    private Room[][] rooms;

    // 盖楼
    public Hotel() {
        // 一共有几层，每层的房间类型是什么，每个房间的编号是什么。
        // 我们可以先写死。一共三层、一层单人间、二层标准间、三层总统套房，每层有10个房间。
        /**
         * 房间编号
         * 1楼：101 102 103 104 105 106..
         * 2楼：201 202 203 204 205 206..
         * 3楼：301 302 303 304 305 306..
         * ...
         */
        this.rooms = new Room[3][10];

        // 创建30个Room对象，放到数组中
        for (int i = 0; i < rooms.length; i++){
            for (int j = 0; j < rooms[i].length; j++){
                if (i == 0){
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "单人间", true);
                }else if (i == 1){
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "标准间", true);
                }else if (i == 2){
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "总统套房", true);
                }
            }
        }
    }

    // 打印所有房间状态
    public void print(){
        for (int i = 0; i < rooms.length; i++){
            for (int j = 0; j < rooms[i].length; j++){
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }

    // 订房方法
    // 把Room对象status修改为false
    public void order(int roomNo){
        // 房间编号207（下标为rooms[1][6]）
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(false);
        System.out.println(roomNo + "已订房！");
    }

    // 退房
    public void exit(int roomNo){
        // 房间编号207（下标为rooms[1][6]）
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(true);
        System.out.println(roomNo + "已退房！");
    }
}
