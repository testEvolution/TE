@Test
    public void testGetStartValue3() {
        TaskSeriesCollection c = new TaskSeriesCollection();
        TaskSeries s = new TaskSeries("Series 1");
        s.add(new Task("Task with null duration", null));
        c.add(s);
        Number millis = c.getStartValue("Series 1", "Task with null duration");
        assertTrue(millis == null);
    }

    