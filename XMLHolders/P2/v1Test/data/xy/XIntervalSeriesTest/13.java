@Test
    public void testGetXHighValue() {
        XIntervalSeries s1 = new XIntervalSeries("S1");
        s1.add(1.0, 2.0, 3.0, 4.0);
        assertEquals(3.0, s1.getXHighValue(0), EPSILON);
        s1.add(2.0, 1.0, 4.0, 2.5);
        assertEquals(4.0, s1.getXHighValue(1), EPSILON);
    }

}