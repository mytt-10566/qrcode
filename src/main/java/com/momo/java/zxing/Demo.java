package com.momo.java.zxing;

import com.momo.java.zxing.util.QRCodeUtil;
import org.junit.Test;

public class Demo {

    @Test
    public void testLogo() throws Exception {
        String text = "test content";
//        QRCodeUtil.encode(text, "files/1.png", "files", true);
//        QRCodeUtil.encode(text, "logo/logo2.jpg", "files", true);
//        QRCodeUtil.encode("http://www.baidu.com", "logo/logo2.jpg", "files", true);
        QRCodeUtil.encode("tel:123456789", "logo/logo2.jpg", "files", true);
    }

}
