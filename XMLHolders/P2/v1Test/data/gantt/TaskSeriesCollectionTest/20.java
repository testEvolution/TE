@Test
    public void testCloning() throws CloneNotSupportedException {
        TaskSeries s1 = new TaskSeries("S1");
        s1.add(new Task("T1", new Date(1), new Date(2)));
        s1.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeries s2 = new TaskSeries("S2");
        s2.add(new Task("T1", new Date(33), new Date(44)));
        s2.add(new Task("T2", new Date(55), new Date(66)));
        TaskSeriesCollection c1 = new TaskSeriesCollection();
        c1.add(s1);
        c1.add(s2);

        TaskSeriesCollection c2 = (TaskSeriesCollection) c1.clone();
        assertTrue(c1 != c2);
        assertTrue(c1.getClass() == c2.getClass());
        assertTrue(c1.equals(c2));

        // basic check for independence
        s1.add(new Task("T3", new Date(21), new Date(33)));
        assertFalse(c1.equals(c2));
        TaskSeries series = c2.getSeries("S1");
        series.add(new Task("T3", new Date(21), new Date(33)));
        assertTrue(c1.equals(c2));

    }

    