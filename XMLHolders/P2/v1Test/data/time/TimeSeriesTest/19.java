@Test
    public void testAddOrUpdate3() {
        TimeSeries s1 = new TimeSeries("S1");
        s1.addOrUpdate(new Year(2010), 1.1);
        assertEquals(Year.class, s1.getTimePeriodClass());

        boolean pass = false;
        try {
            s1.addOrUpdate(new Month(1, 2009), 0.0);
        }
        catch (SeriesException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    