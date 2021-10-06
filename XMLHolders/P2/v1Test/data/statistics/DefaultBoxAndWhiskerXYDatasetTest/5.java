@Test
    public void testGetRangeBounds() {
        DefaultBoxAndWhiskerXYDataset d1
                = new DefaultBoxAndWhiskerXYDataset("S");
        d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0,
                6.0, 7.0, 8.0, new ArrayList<Double>()));
        assertEquals(new Range(5.0, 6.0), d1.getRangeBounds(false));
        assertEquals(new Range(5.0, 6.0), d1.getRangeBounds(true));

        d1.add(new Date(1L), new BoxAndWhiskerItem(1.5, 2.5, 3.5, 4.5, 5.5,
                6.5, 7.5, 8.5, new ArrayList<Double>()));
        assertEquals(new Range(5.0, 6.5), d1.getRangeBounds(false));
        assertEquals(new Range(5.0, 6.5), d1.getRangeBounds(true));

        d1.add(new Date(2L), new BoxAndWhiskerItem(2.5, 3.5, 4.5, 5.5, 6.5,
                7.5, 8.5, 9.5, new ArrayList()));
        assertEquals(new Range(5.0, 7.5), d1.getRangeBounds(false));
        assertEquals(new Range(5.0, 7.5), d1.getRangeBounds(true));
    }

}