@Test
    public void testEquals() {
        DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset(
                "Series");
        DefaultBoxAndWhiskerXYDataset d2 = new DefaultBoxAndWhiskerXYDataset(
                "Series");
        assertTrue(d1.equals(d2));

        d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0,
                6.0, 7.0, 8.0, new ArrayList<Double>()));
        assertFalse(d1.equals(d2));
        d2.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0,
                6.0, 7.0, 8.0, new ArrayList<Double>()));
        assertTrue(d1.equals(d2));
    }

    