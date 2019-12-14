package cn.ucloud.usms.util;

import cn.ucloud.common.exception.ValidatorException;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author: codezhang
 * @date: 2019/12/13 7:46 下午
 * @describe:
 **/
public class FileUtil {

    private static final Logger log = LoggerFactory.getLogger(FileUtil.class);

    /**
     * 文件需先进行base64编码格式转换，
     * 此处填写转换后的字符串。
     * 文件大小不超过4 MB
     *
     * @param path 文件路径
     * @return
     * @throws ValidatorException
     */
    public static String getFileContent2StringAfterBase64Encode(String path)
            throws ValidatorException {

        String value = "";
        FileInputStream fileInputStream = null;
        try {
            URL fileUrl = new URL("file://" + path);
            URLConnection urlConnection = fileUrl.openConnection();
            String type = urlConnection.getContentType();
            fileInputStream = new FileInputStream(path);
            int available = fileInputStream.available();
            byte[] buffer = new byte[available];
            int readLen = fileInputStream.read(buffer);
            log.info("file({}) mime-type:{} , size:{} , read size:{}",
                    path,
                    type,
                    available,
                    readLen);

            value = String.format("data:%s;base64,%s",
                    type, new String(Base64.encodeBase64(buffer)));
        } catch (IOException e) {
            throw new ValidatorException(e.getMessage());
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    log.error("close file({}) error:{}", path, e.getMessage());
                }
            }
        }
        return value;
    }

}
