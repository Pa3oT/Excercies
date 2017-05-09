package main.pattern.proxy;

import java.util.HashMap;
import java.util.Map;

interface Image {
    public String get(String imgName);
}

class LargeImage implements Image {
    @Override
    public String get(String imgName) {
        System.out.println("some expensive operation for loading image");
        return String.format("image with name \"%s\"", imgName);
    }
}

class ImageProxy implements Image {

    private Image realImage = new LargeImage();
    private Map<String, String> loadedImages = new HashMap();

    @Override
    public String get(String imgName) {
        if (loadedImages.get(imgName) != null) {
            return loadedImages.get(imgName);
        } else {
            String image = realImage.get(imgName);
            loadedImages.put(imgName, image);
            return image;
        }
    }
}

public class ImagesTester {
    public static void main(String[] args) {
        Image image1 = new ImageProxy();
        Image image2 = new LargeImage();
        System.out.println(image1.get("Flowers.jpg"));
        System.out.println(image1.get("Flowers.jpg"));
        System.out.println(image1.get("Flowers.jpg"));

        System.out.println(image2.get("Sky.jpg"));
        System.out.println(image2.get("Sky.jpg"));
    }
}