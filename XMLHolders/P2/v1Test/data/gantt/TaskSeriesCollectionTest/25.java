@Test
    public void testGetSeries() {
        TaskSeries s1 = new TaskSeries("S1");
        TaskSeries s2 = new TaskSeries("S2");
        TaskSeriesCollection c = new TaskSeriesCollection();
        c.add(s1);

        assertEquals(c.getSeries(0), s1);
        assertEquals(c.getSeries("S1"), s1);
        assertEquals(c.getSeries("XX"), null);

        c.add(s2);
        assertEquals(c.getSeries(1), s2);
        assertEquals(c.getSeries("S2"), s2);

        boolean pass = false;
        try {
            c.getSeries(null);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    