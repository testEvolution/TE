@Test
    public void testRemove() {
        TaskSeriesCollection c = new TaskSeriesCollection();
        TaskSeries s1 = new TaskSeries("S1");
        c.add(s1);
        assertEquals("S1", c.getSeries(0).getKey());
        c.remove(0);
        assertEquals(0, c.getSeriesCount());
        c.add(s1);

        boolean pass = false;
        try {
            c.remove(-1);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            c.remove(1);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

}