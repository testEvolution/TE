@Test
    public void test1() {
        TimeSeries source = createDailyTimeSeries1();
        TimeSeries maverage = MovingAverage.createMovingAverage(source, 
                "Moving Average", 3, 3);

        // the moving average series has 7 items, the first three
        // days (11, 12, 13 August are skipped)
        assertEquals(7, maverage.getItemCount());
        double value = maverage.getValue(0).doubleValue();
        assertEquals(14.1, value, EPSILON);
        value = maverage.getValue(1).doubleValue();
        assertEquals(13.4, value, EPSILON);
        value = maverage.getValue(2).doubleValue();
        assertEquals(14.433333333333, value, EPSILON);
        value = maverage.getValue(3).doubleValue();
        assertEquals(14.933333333333, value, EPSILON);
        value = maverage.getValue(4).doubleValue();
        assertEquals(19.8, value, EPSILON);
        value = maverage.getValue(5).doubleValue();
        assertEquals(15.25, value, EPSILON);
        value = maverage.getValue(6).doubleValue();
        assertEquals(12.5, value, EPSILON);
    }

    