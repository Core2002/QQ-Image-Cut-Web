package fun.fifu.spring.imagecut;

import fun.fifu.spring.imagecut.utils.CutUtil;
import fun.fifu.spring.imagecut.utils.ImgUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@SpringBootTest
class ImageCutApplicationTests {

    @Test
    void contextLoads() throws IOException {
//        BufferedImage image = ImageIO.read(new File("D:\\_Temp\\test\\c3.png"));
//        CutUtil.saveImageList(CutUtil.c3(image));
    }

}
