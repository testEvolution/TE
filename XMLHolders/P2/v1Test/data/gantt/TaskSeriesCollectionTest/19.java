@Test
    public void testEquals() {

        TaskSeries s1 = new TaskSeries("S");
        s1.add(new Task("T1", new Date(1), new Date(2)));
        s1.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeries s2 = new TaskSeries("S");
        s2.add(new Task("T1", new Date(1), new Date(2)));
        s2.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeriesCollection c1 = new TaskSeriesCollection();
        c1.add(s1);
        c1.add(s2);

        TaskSeries s1b = new TaskSeries("S");
        s1b.add(new Task("T1", new Date(1), new Date(2)));
        s1b.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeries s2b = new TaskSeries("S");
        s2b.add(new Task("T1", new Date(1), new Date(2)));
        s2b.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeriesCollection c2 = new TaskSeriesCollection();
        c2.add(s1b);
        c2.add(s2b);

        assertTrue(c1.equals(c2));
        assertTrue(c2.equals(c1));

    }

    