
package com.mycompany.projectprototypesystemv01.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author leandro
 */
public class DateUtil {
    public static Date StringToDate(String dateInf) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateFormat = sdf.parse(dateInf);
        return dateFormat;
    }
}
