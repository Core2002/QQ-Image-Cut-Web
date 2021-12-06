package fun.fifu.spring.imagecut.controller;

import fun.fifu.spring.imagecut.utils.CutUtil;
import fun.fifu.spring.imagecut.utils.ImgUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @ResponseBody
    @PostMapping("/upload")
    public List<String> upload(@RequestParam Map<String, Object> map) {
        // 信息收集
//        System.out.println(map.get("base64"));
        String base64 = ((String) map.get("base64")).replace("data:image/jpeg;base64,", "");
        String scale = ((String) map.get("scale"));

        var cutX = Double.parseDouble((String) map.get("cut[x]"));
        var cutY = Double.parseDouble((String) map.get("cut[y]"));
        var cutX2 = Double.parseDouble((String) map.get("cut[x2]"));
        var cutY2 = Double.parseDouble((String) map.get("cut[y2]"));
        var cutW = Double.parseDouble((String) map.get("cut[w]"));
        var cutH = Double.parseDouble((String) map.get("cut[h]"));

        BufferedImage bufferedImage = ImgUtil.base64ToBufferedImage(base64);
        if (bufferedImage == null) {
            System.out.println("Base64转图片失败");
            return null;
        }

        // 预处理
        bufferedImage = ImgUtil.cropImage(bufferedImage, (int) cutX, (int) cutY, (int) cutX2, (int) cutY2);

        // 开始处理
        List<String> base64List;
        switch (scale) {
            case "规格C3，宽高比3:2":
                base64List = CutUtil.toBase64List(CutUtil.c3(bufferedImage));
                break;
            case "规格C4，宽高比1:1":
                base64List = CutUtil.toBase64List(CutUtil.c4(bufferedImage));
                break;
            case "规格C5，宽高比6:5":
                base64List = CutUtil.toBase64List(CutUtil.c5(bufferedImage));
                break;
            case "规格C6，宽高比1:1":
                base64List = CutUtil.toBase64List(CutUtil.c6(bufferedImage));
                break;
            case "规格C7，宽高比3:4":
                base64List = CutUtil.toBase64List(CutUtil.c7(bufferedImage));
                break;
            case "规格C8，宽高比2:2.5":
                base64List = CutUtil.toBase64List(CutUtil.c8(bufferedImage));
                break;
            case "规格C9，宽高比3:4":
                base64List = CutUtil.toBase64List(CutUtil.c9(bufferedImage));
                break;
            default:
                return null;
        }

//        System.out.println("规格：" + scale);
//        System.out.println(base64);
        return base64List;
    }
}
