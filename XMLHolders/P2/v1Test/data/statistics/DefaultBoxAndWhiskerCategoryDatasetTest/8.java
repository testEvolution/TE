@Test
    public void testRemove() {
        DefaultBoxAndWhiskerCategoryDataset data
                = new DefaultBoxAndWhiskerCategoryDataset();

        boolean pass = false;
        try {
            data.remove("R1", "R2");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
        data.add(new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0,
                new ArrayList<Double>()), "R1", "C1");
        assertEquals(new Range(7.0, 8.0), data.getRangeBounds(false));
        assertEquals(new Range(7.0, 8.0), data.getRangeBounds(true));

        data.add(new BoxAndWhiskerItem(2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5,
                new ArrayList<Double>()), "R2", "C1");
        assertEquals(new Range(7.0, 9.5), data.getRangeBounds(false));
        assertEquals(new Range(7.0, 9.5), data.getRangeBounds(true));

        data.remove("R1", "C1");
        assertEquals(new Range(8.5, 9.5), data.getRangeBounds(false));
        assertEquals(new Range(8.5, 9.5), data.getRangeBounds(true));
    }

}