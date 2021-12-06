package fun.fifu.spring.imagecut.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CutUtil {

    public static List<String> toBase64List(List<BufferedImage> list) {
        List<String> base64List = new ArrayList<>();
        for (BufferedImage image : list) {
            base64List.add(ImgUtil.BufferedImageToBase64(image));
        }
        return base64List;
    }


    public static void saveImageList(List<BufferedImage> list) {
        for (int i = 0; i < list.size(); i++) {
            File outfile = new File("D:/_Temp/test/image{num}.png".replace("{num}", "" + (list.size() - i)));
            try {
                ImageIO.write(list.get(i), "png", outfile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<BufferedImage> c3(BufferedImage image) {
        List<BufferedImage> list = new ArrayList<>();
        int chunkLen = image.getWidth() / 3;
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen * 2, chunkLen * 2, 0, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, chunkLen));
        return list;
    }

    public static List<BufferedImage> c4(BufferedImage image) {
        List<BufferedImage> list = new ArrayList<>();
        int chunkLen = image.getWidth() / 3;
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen * 3, chunkLen * 2, 0, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, chunkLen * 2));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, chunkLen * 2));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, chunkLen * 2));
        return list;
    }

    public static List<BufferedImage> c5(BufferedImage image) {
        List<BufferedImage> list = new ArrayList<>();
        int chunkLen = image.getWidth() / 3;
        int bigChunklen = image.getWidth() / 2;
        list.add(ImgUtil.cropImageAdaptation(image, bigChunklen, bigChunklen, 0, 0));
        list.add(ImgUtil.cropImageAdaptation(image, bigChunklen, bigChunklen, bigChunklen, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, bigChunklen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, bigChunklen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, bigChunklen));
        return list;
    }

    public static List<BufferedImage> c6(BufferedImage image) {
        List<BufferedImage> list = new ArrayList<>();
        int chunkLen = image.getWidth() / 3;
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen * 2, chunkLen * 2, 0, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, chunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, chunkLen * 2));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, chunkLen * 2));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, chunkLen * 2));
        return list;
    }

    public static List<BufferedImage> c7(BufferedImage image) {
        List<BufferedImage> list = new ArrayList<>();
        int chunkLen = image.getWidth() / 3;
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen * 3, chunkLen * 2, 0, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, chunkLen * 2));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, chunkLen * 2));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, chunkLen * 2));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, chunkLen * 3));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, chunkLen * 3));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, chunkLen * 3));
        return list;
    }

    public static List<BufferedImage> c8(BufferedImage image) {
        List<BufferedImage> list = new ArrayList<>();
        int chunkLen = image.getWidth() / 3;
        int bigChunkLen = image.getWidth() / 2;
        list.add(ImgUtil.cropImageAdaptation(image, bigChunkLen, bigChunkLen, 0, 0));
        list.add(ImgUtil.cropImageAdaptation(image, bigChunkLen, bigChunkLen, bigChunkLen, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, bigChunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, bigChunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, bigChunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, bigChunkLen + chunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, bigChunkLen + chunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen * 2, bigChunkLen + chunkLen));
        return list;
    }

    public static List<BufferedImage> c9(BufferedImage image) {
        List<BufferedImage> list = new ArrayList<>();
        int chunkLen = image.getWidth() / 3;
        int bigChunkLen = chunkLen * 2;
        list.add(ImgUtil.cropImageAdaptation(image, bigChunkLen, bigChunkLen, 0, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, bigChunkLen, 0));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, bigChunkLen, chunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, bigChunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, bigChunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, bigChunkLen, bigChunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, 0, bigChunkLen + chunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, chunkLen, bigChunkLen + chunkLen));
        list.add(ImgUtil.cropImageAdaptation(image, chunkLen, chunkLen, bigChunkLen, bigChunkLen + chunkLen));
        return list;
    }
}
