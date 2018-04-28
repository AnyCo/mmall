package com.mmall.test;

import org.apache.commons.lang.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) {

        Date closeDateTime = DateUtils.addHours(new Date(),-2);
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(closeDateTime));

    }


}
