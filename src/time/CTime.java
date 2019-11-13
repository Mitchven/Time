/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gamboama_sd2082
 */
public class CTime {

    private Date dd;
    private Thread th;

    public void run() {
        for (;;) {
            try {
                do {
                    dd = new Date();
                    SimpleDateFormat simple = new SimpleDateFormat("hh:mm:ss a");
                    simple.format(dd);
                    Thread.sleep(1000);  // 1000 = 1 second
                } while (th.isAlive());
            } catch (Exception e) {

            }
        }
    }
}
