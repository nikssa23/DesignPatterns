public class Main {

    public static void main(String[] args) {

        Image image1 = new ProxyImage("/path/to/big/image/1.png");
        Image image2 = new ProxyImage("/path/to/big/image/2.png");
        Image image3 = new ProxyImage("/path/to/big/image/3.png");
        Image image4 = new ProxyImage("/path/to/big/image/4.png");

        image3.display();
    }
}
