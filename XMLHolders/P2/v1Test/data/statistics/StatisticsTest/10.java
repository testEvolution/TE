@Test
    public void testCorrelation2() {
        Number[] data1 = new Number[20];
        data1[0] = 68.0;
        data1[1] = 71.0;
        data1[2] = 62.0;
        data1[3] = 75.0;
        data1[4] = 58.0;
        data1[5] = 60.0;
        data1[6] = 67.0;
        data1[7] = 68.0;
        data1[8] = 71.0;
        data1[9] = 69.0;
        data1[10] = 68.0;
        data1[11] = 67.0;
        data1[12] = 63.0;
        data1[13] = 62.0;
        data1[14] = 60.0;
        data1[15] = 63.0;
        data1[16] = 65.0;
        data1[17] = 67.0;
        data1[18] = 63.0;
        data1[19] = 61.0;
        Number[] data2 = new Number[20];
        data2[0] = 4.1;
        data2[1] = 4.6;
        data2[2] = 3.8;
        data2[3] = 4.4;
        data2[4] = 3.2;
        data2[5] = 3.1;
        data2[6] = 3.8;
        data2[7] = 4.1;
        data2[8] = 4.3;
        data2[9] = 3.7;
        data2[10] = 3.5;
        data2[11] = 3.2;
        data2[12] = 3.7;
        data2[13] = 3.3;
        data2[14] = 3.4;
        data2[15] = 4.0;
        data2[16] = 4.1;
        data2[17] = 3.8;
        data2[18] = 3.4;
        data2[19] = 3.6;
        double r = Statistics.getCorrelation(data1, data2);
        assertEquals(0.7306356862792885, r, 0.000000000001);
    }

    