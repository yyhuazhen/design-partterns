package org.example;

/**
 * 组合模式本质：统一叶子对象和组合对象
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Compoent cloth = new Composite("服装");
        Compoent womanCloth = new Composite("女装");
        Compoent manCloth = new Composite("男装");
        cloth.addChrild(womanCloth);
        cloth.addChrild(manCloth);
        Compoent womanShirt = new Leaf("女衬衣");
        Compoent womanTrousers = new Leaf("女裤子");
        Compoent manShirt = new Leaf("男衬衣");
        Compoent manTrousers = new Leaf("男裤子");
        womanCloth.addChrild(womanShirt);
        womanCloth.addChrild(womanTrousers);
        manCloth.addChrild(manShirt);
        manCloth.addChrild(manTrousers);
        Compoent root = cloth.getChrild(1);
        root.someOperation();
    }
}
