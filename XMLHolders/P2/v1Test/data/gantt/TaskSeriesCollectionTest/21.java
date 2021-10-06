@Test
    public void testSerialization() {
        TaskSeries s1 = new TaskSeries("S");
        s1.add(new Task("T1", new Date(1), new Date(2)));
        s1.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeries s2 = new TaskSeries("S");
        s2.add(new Task("T1", new Date(1), new Date(2)));
        s2.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeriesCollection c1 = new TaskSeriesCollection();
        c1.add(s1);
        c1.add(s2);
        TaskSeriesCollection c2 = (TaskSeriesCollection) 
                TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    