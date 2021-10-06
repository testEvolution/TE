@Test
    public void testGetEndValue3() {
        TaskSeriesCollection c = new TaskSeriesCollection();
        TaskSeries s = new TaskSeries("Series 1");
        s.add(new Task("Task with null duration", null));
        c.add(s);
        Number millis = c.getEndValue("Series 1", "Task with null duration");
        assertTrue(millis == null);
    }

    