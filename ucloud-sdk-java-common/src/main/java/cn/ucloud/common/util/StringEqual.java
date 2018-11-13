package cn.ucloud.common.util;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-11-13 14:40
 **/

public class StringEqual {

    /**
     * 判断两个region 或者 zone的code是否一致
     * @param a regionA zoneA
     * @param b regionB zoneB
     * @return true 一致，false 不一致
     */
    public static boolean regionZoneStringEqual(String a, String b) {
        if (a != null && b != null && a.length() > 0 && b.length() > 0 && a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }

}
