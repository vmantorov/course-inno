package item;

public class task3 {
    public static void main(String[] args) {
        Item Item_1 = new Item("часы",1488228,10000,17,"Белый");
        Item Item_2 = new Item("нож", 1785268, 500, 999,"чёрный");
        Item Item_3 = new Item("ноутбук", 7777777,120000,38,"серый");
        Item Item_4 = new Item("умная колонка",1213158, 20000,100, "синий");
        Item Item_5 = new Item("камера",1112223,15000,2,"розовый");

        System.out.println("Наименование"+ "="+ Item_1.name + "," + "Артикул" + "=" +Item_1.article + "," +"Цена" + "=" +Item_1.price + "," + "Количество" + "=" +Item_1.quantity + "," + "Цвет" + "=" +Item_1.color);
        System.out.println("Наименование"+ "="+ Item_2.name + "," + "Артикул" + "=" +Item_2.article + "," +"Цена" + "=" +Item_2.price + "," + "Количество" + "=" +Item_2.quantity + "," + "Цвет" + "=" +Item_2.color);
        System.out.println("Наименование"+ "="+ Item_3.name + "," + "Артикул" + "=" +Item_3.article + "," +"Цена" + "=" +Item_3.price + "," + "Количество" + "=" +Item_3.quantity + "," + "Цвет" + "=" +Item_3.color);
        System.out.println("Наименование"+ "="+ Item_4.name + "," + "Артикул" + "=" +Item_4.article + "," +"Цена" + "=" +Item_4.price + "," + "Количество" + "=" +Item_4.quantity + "," + "Цвет" + "=" +Item_4.color);
        System.out.println("Наименование"+ "="+ Item_5.name + "," + "Артикул" + "=" +Item_5.article + "," +"Цена" + "=" +Item_5.price + "," + "Количество" + "=" +Item_5.quantity + "," + "Цвет" + "=" +Item_5.color);

        }

    }
