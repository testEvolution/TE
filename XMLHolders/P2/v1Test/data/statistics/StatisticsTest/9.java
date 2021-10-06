@Test
    public void testCorrelation1() {
        Number[] data1 = new Number[3];
        data1[0] = 1.0;
        data1[1] = 2.0;
        data1[2] = 3.0;
        Number[] data2 = new Number[3];
        data2[0] = 1.0;
        data2[1] = 2.0;
        data2[2] = 3.0;
        double r = Statistics.getCorrelation(data1, data2);
        assertEquals(1.0, r, 0.00000001);
    }

    