@Test
    public void testSerialization() {
        TimeTableXYDataset d1 = new TimeTableXYDataset();
        d1.add(new Year(1999), 123.4, "S1");
        TimeTableXYDataset d2 = (TimeTableXYDataset) 
                TestUtils.serialised(d1);
        assertTrue(d1.equals(d2));
    }

    