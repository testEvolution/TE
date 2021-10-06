private static Date date(int day, int month, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        Date result = calendar.getTime();
        return result;

    }    