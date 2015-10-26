package com.xiberty.nextstep.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format {

    public static final String TWO_DECIMALS_NUMBER_FORMAT = "###,###,##0.00";
    public static final String FOUR_DECIMALS_NUMBER_FORMAT = "###,###,##0.0000";
    public static final String FIVE_DECIMALS_NUMBER_FORMAT = "###,###,##0.00000";
    public static final String WITHOUT_DECIMALS_NUMBER_FORMAT = "###,###,###";

    public static final String DATE_FORMAT = "ddMMMyyyy";
    public static final String DATE_FORMAT_NUMERIC = "dd/MM/yyyy";
    public static final String DATE_FORMAT_WITH_HOUR = "ddMMMyyyy hh:mm:ss";
    public static final String DATE_FORMAT_WITH_HOUR_MINUTE = "ddMMMyyyy hh:mm";


    public static String date(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        return simpleDateFormat.format(date).toUpperCase();
    }

    public static String date_numeric(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_NUMERIC);
        return simpleDateFormat.format(date).toUpperCase();
    }

    public static Date date_string_numeric(String date) {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT_NUMERIC);
        Date startDate = null;
        try {
            startDate = df.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return startDate;
    }


    public static String dateWithHour(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_WITH_HOUR);
        return simpleDateFormat.format(date).toUpperCase();
    }

    public static String dateWithHourMinute(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_WITH_HOUR_MINUTE);
        return simpleDateFormat.format(date).toUpperCase();
    }

    public static String numberTwoDecimals(double number) {
        DecimalFormat decimalFormat = new DecimalFormat(TWO_DECIMALS_NUMBER_FORMAT);
        decimalFormat.setNegativePrefix("(");
        decimalFormat.setNegativeSuffix(")");
        return decimalFormat.format(number);
    }

    public static String numberFourDecimals(double number) {
        DecimalFormat decimalFormat = new DecimalFormat(FOUR_DECIMALS_NUMBER_FORMAT);
        decimalFormat.setNegativePrefix("(");
        decimalFormat.setNegativeSuffix(")");
        return decimalFormat.format(number);
    }

    public static String numberFiveDecimals(double number) {
        DecimalFormat decimalFormat = new DecimalFormat(FIVE_DECIMALS_NUMBER_FORMAT);
        decimalFormat.setNegativePrefix("(");
        decimalFormat.setNegativeSuffix(")");
        return decimalFormat.format(number);
    }

    public static String numberWithoutDecimals(double number) {
        DecimalFormat decimalFormat = new DecimalFormat(WITHOUT_DECIMALS_NUMBER_FORMAT);
        decimalFormat.setNegativePrefix("(");
        decimalFormat.setNegativeSuffix(")");
        return decimalFormat.format(number);
    }



    public static String numberTwoDecimalsWithSign(double number) {
        DecimalFormat decimalFormat = new DecimalFormat(TWO_DECIMALS_NUMBER_FORMAT);
        decimalFormat.setNegativePrefix("-");
        decimalFormat.setNegativeSuffix("");
        decimalFormat.setPositivePrefix("+");
        decimalFormat.setPositiveSuffix("");
        return decimalFormat.format(number);
    }


    public static String dateWithHourMinuteSecond(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        return simpleDateFormat.format(date).toUpperCase();
    }


}
