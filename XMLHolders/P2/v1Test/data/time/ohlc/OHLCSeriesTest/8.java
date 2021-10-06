@Test
    public void testAdditionOfDuplicatePeriod() {
        OHLCSeries s1 = new OHLCSeries("s1");
        s1.add(new Year(2006), 1.0, 1.0, 1.0, 1.0);
        boolean pass = false;
        try {
            s1.add(new Year(2006), 1.0, 1.0, 1.0, 1.0);
        }
        catch (SeriesException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    