@Test
    public void testBug3446965() {
        TimeSeries s = new TimeSeries("s");
        s.addOrUpdate(new Year(2011), 100.0);
        s.addOrUpdate(new Year(2012), 150.0);
        s.addOrUpdate(new Year(2013), 200.0);
        s.addOrUpdate(new Year(2012), 250.0);  // this line triggers the defect
        assertEquals(100.0, s.getMinY(), EPSILON);
        assertEquals(250.0, s.getMaxY(), EPSILON);
    }

    