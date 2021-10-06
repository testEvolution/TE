@Test
    public void testSerialization() {
        TaskSeries s1 = new TaskSeries("Series");
        s1.add(new Task("Task 1", new Date(0L), new Date(1L)));
        TaskSeriesCollection u1 = new TaskSeriesCollection();
        u1.add(s1);
        XYTaskDataset d1 = new XYTaskDataset(u1);
        XYTaskDataset d2 = (XYTaskDataset) TestUtils.serialised(d1);
        assertEquals(d1, d2);

        // basic check for independence
        s1.add(new Task("Task 2", new Date(10L), new Date(11L)));
        assertFalse(d1.equals(d2));
        TaskSeriesCollection u2 = d2.getTasks();
        TaskSeries s2 = u2.getSeries("Series");
        s2.add(new Task("Task 2", new Date(10L), new Date(11L)));
        assertTrue(d1.equals(d2));
    }

}